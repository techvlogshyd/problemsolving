package practice.general;

import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class StreamRecipes {

    /* ---------- Sample data records ---------- */
    record User(int id, String name, String city) {}
    record Emp(String dept, String role, int salary) {}
    record MinMax(int min, int max) {}

    public static void main(String[] args) throws Exception {
        demoCreateStreams();
        demoBasicOps();
        demoFlatMap();
        demoTerminalOps();
        demoCollectorsToMapGrouping();
        demoGroupingDownstream();
        demoPartitioning();
        demoDownstreamMappingFiltering();
        demoSummarizing();
        demoSorting();
        demoImmutableCollectors();
        demoPrimitiveStreams();
        demoOptionalAndStreams();
        demoReduce();
        demoDistinctByKey();
        demoToMapVariations();
        demoCollectingAndThen();
        demoTeeingCollector();
        demoParallelStreams();
        demoCustomCollector();
        demoGroupTopNPerGroup();
        demoStreamOverMap();
        demoIndexZip();
        demoChunking();
        demoRemoveNullsBlanks();
        demoFrequencyMap();
        demoMinMaxByComparator();
        demoTakeDropWhile();
        demoInfiniteShortCircuit();

        // Demos that touch the file system are provided but not invoked to keep runtime clean:
        // demoFilesLines();
        // demoFilesWalk();
    }

    /* ---------- 1) Create Streams ---------- */
    static void demoCreateStreams() {
        Stream<String> s1 = Stream.of("a","b","c");
        Stream<Integer> s2 = Arrays.stream(new Integer[]{1,2,3});
        IntStream i1 = IntStream.of(1,2,3);
        IntStream i2 = IntStream.range(1,5);       // 1..4
        IntStream i3 = IntStream.rangeClosed(1,5); // 1..5
        Stream<Double> randoms = Stream.generate(Math::random).limit(3);
        Stream<Integer> powers = Stream.iterate(1, x -> x*2).limit(5);

        System.out.println("Create: " + s1.collect(joining(",")) + " | " +
                s2.collect(toList()) + " | " +
                i1.boxed().collect(toList()) + " | " +
                i2.boxed().collect(toList()) + " | " +
                i3.boxed().collect(toList()) + " | " +
                randoms.collect(toList()) + " | " +
                powers.collect(toList()));
    }

    /* ---------- 2) Basic Ops ---------- */
    static void demoBasicOps() {
        List<Integer> out = IntStream.rangeClosed(1,20)
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .distinct()
                .sorted()
                .skip(2)
                .limit(5)
                .boxed()
                .peek(n -> {}) // keep for example; no-op
                .toList();
        System.out.println("Basic ops: " + out);
    }

    /* ---------- 3) flatMap ---------- */
    static void demoFlatMap() {
        List<String> words = List.of("alpha beta", "gamma", "delta zeta");
        List<String> tokens = words.stream()
                .flatMap(w -> Arrays.stream(w.split("\\s+")))
                .toList();
        System.out.println("flatMap tokens: " + tokens);

        List<List<Integer>> grid = List.of(List.of(1,2), List.of(3), List.of(4,5));
        List<Integer> flat = grid.stream().flatMap(List::stream).toList();
        System.out.println("flatMap grid: " + flat);
    }

    /* ---------- 4) Terminal Ops ---------- */
    static void demoTerminalOps() {
        List<String> names = List.of("Ann","Bob","Ava","Ben");
        boolean anyA = names.stream().anyMatch(n -> n.startsWith("A"));
        Optional<String> first3 = names.stream().filter(n -> n.length()==3).findFirst();
        int sum = IntStream.rangeClosed(1,5).reduce(0, Integer::sum);
        String joined = names.stream().collect(joining(", "));
        System.out.println("anyA=" + anyA + ", first3=" + first3.orElse("N/A") +
                ", sum=" + sum + ", joined=" + joined);
    }

    /* ---------- 5) Collectors toMap/grouping ---------- */
    static void demoCollectorsToMapGrouping() {
        List<User> users = List.of(new User(1,"Ann","LA"), new User(2,"Bob","NY"), new User(3,"Ava","LA"));
        Map<Integer, String> idToName = users.stream().collect(toMap(User::id, User::name));
        Map<String, List<User>> byCity = users.stream().collect(groupingBy(User::city));
        Map<String, Long> cityCounts = users.stream().collect(groupingBy(User::city, counting()));
        System.out.println("idToName=" + idToName);
        System.out.println("byCity=" + byCity);
        System.out.println("cityCounts=" + cityCounts);
    }

    /* ---------- 6) groupingBy + downstream ---------- */
    static void demoGroupingDownstream() {
        List<Emp> emps = sampleEmps();
        Map<String, Map<String, List<Emp>>> group2 =
                emps.stream().collect(groupingBy(Emp::dept, groupingBy(Emp::role)));
        Map<String, Integer> deptSum =
                emps.stream().collect(groupingBy(Emp::dept, summingInt(Emp::salary)));
        Map<String, Optional<Emp>> deptMax =
                emps.stream().collect(groupingBy(Emp::dept, maxBy(Comparator.comparingInt(Emp::salary))));
        System.out.println("dept->role->list=" + group2);
        System.out.println("deptSum=" + deptSum);
        System.out.println("deptMax=" + deptMax);
    }

    /* ---------- 7) partitioningBy ---------- */
    static void demoPartitioning() {
        Map<Boolean, List<Integer>> evensOdds = IntStream.rangeClosed(1,10).boxed()
                .collect(partitioningBy(n -> n%2==0));
        System.out.println("partition evensOdds=" + evensOdds);
    }

    /* ---------- 8) mapping/filtering downstream ---------- */
    static void demoDownstreamMappingFiltering() {
        List<Emp> emps = sampleEmps();
        Map<String, Set<String>> rolesByDept = emps.stream()
                .collect(groupingBy(Emp::dept,
                        mapping(Emp::role, toCollection(LinkedHashSet::new))));
        Map<String, List<Emp>> richByDept = emps.stream()
                .collect(groupingBy(Emp::dept,
                        filtering(e -> e.salary()>100, toList())));
        System.out.println("rolesByDept=" + rolesByDept);
        System.out.println("richByDept=" + richByDept);
    }

    /* ---------- 9) summarizing ---------- */
    static void demoSummarizing() {
        List<Emp> emps = sampleEmps();
        IntSummaryStatistics stats = emps.stream().collect(summarizingInt(Emp::salary));
        System.out.println("stats: " + stats);
    }

    /* ---------- 10) custom sorting ---------- */
    static void demoSorting() {
        List<String> names = List.of("Ann","Benjamin","Ava","Bob");
        List<String> sorted = names.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toList();
        System.out.println("sorted=" + sorted);
    }

    /* ---------- 11) unmodifiable collectors ---------- */
    static void demoImmutableCollectors() {
        List<String> names = List.of("a","b","c");
        List<String> imm = names.stream().collect(toUnmodifiableList());
        System.out.println("immutable list=" + imm);
    }

    /* ---------- 12) primitive streams ---------- */
    static void demoPrimitiveStreams() {
        int maxEvenSquare = IntStream.rangeClosed(1,100)
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .max().orElse(-1);
        System.out.println("maxEvenSquare=" + maxEvenSquare);
    }

    /* ---------- 13) Files & Streams (not invoked by default) ---------- */
    static void demoFilesLines() throws IOException {
        Path tmp = Files.createTempFile("stream-demo", ".txt");
        Files.writeString(tmp, "a\n\nb\nc\n");
        try (Stream<String> lines = Files.lines(tmp)) {
            long nonEmpty = lines.filter(l -> !l.isBlank()).count();
            System.out.println("nonEmpty lines=" + nonEmpty);
        }
        Files.deleteIfExists(tmp);
    }

    static void demoFilesWalk() throws IOException {
        try (Stream<Path> paths = Files.walk(Path.of("."), 2)) {
            List<Path> javaFiles = paths.filter(p -> p.toString().endsWith(".java")).toList();
            System.out.println("java files (depth 2): " + javaFiles.size());
        }
    }

    /* ---------- 14) Optional + Streams ---------- */
    static void demoOptionalAndStreams() {
        Optional<String> maybe = Optional.of(" hello ");
        String trimmedUpper = maybe.map(String::trim).map(String::toUpperCase).orElse("N/A");
        List<Optional<Integer>> maybes = List.of(Optional.of(1), Optional.empty(), Optional.of(3));
        List<Integer> present = maybes.stream().flatMap(Optional::stream).toList();
        System.out.println("trimmedUpper=" + trimmedUpper + ", present=" + present);
    }

    /* ---------- 15) reduce variations ---------- */
    static void demoReduce() {
        int sum1 = IntStream.rangeClosed(1,10).sum();
        int sum2 = IntStream.rangeClosed(1,10).reduce(0, Integer::sum);
        String concat = Stream.of("a","b","c").reduce("", String::concat);
        System.out.println("sum1=" + sum1 + ", sum2=" + sum2 + ", concat=" + concat);
    }

    /* ---------- 16) distinct by key ---------- */
    static void demoDistinctByKey() {
        List<User> users = List.of(new User(1,"Ann","LA"), new User(2,"Bob","NY"), new User(3,"Ava","LA"));
        List<User> uniqueByCity = users.stream().filter(distinctByKey(User::city)).toList();
        System.out.println("distinct by city=" + uniqueByCity);
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    /* ---------- 17) toMap variations ---------- */
    static void demoToMapVariations() {
        List<String> names = List.of("Ann","Ava","Bob","Ben");
        Map<String, Integer> nameLen = names.stream()
                .collect(toMap(n -> n, String::length, (a,b) -> a, LinkedHashMap::new));
        System.out.println("nameLen=" + nameLen);
    }

    /* ---------- 18) collectingAndThen ---------- */
    static void demoCollectingAndThen() {
        List<String> upperUnmod =
                Stream.of("a","b","c").map(String::toUpperCase)
                        .collect(collectingAndThen(toList(), List::copyOf));
        System.out.println("upper unmodifiable=" + upperUnmod);
    }

    /* ---------- 19) teeing collector (Java 12+) ---------- */
    static void demoTeeingCollector() {
        MinMax mm = IntStream.rangeClosed(1,10).boxed().collect(
                teeing(
                        minBy(Integer::compareTo),
                        maxBy(Integer::compareTo),
                        (minOpt, maxOpt) -> new MinMax(minOpt.orElseThrow(), maxOpt.orElseThrow())
                )
        );
        System.out.println("MinMax=" + mm);
    }

    /* ---------- 20) parallel streams ---------- */
    static void demoParallelStreams() {
        long count = IntStream.range(1, 200_000)
                .parallel()
                .filter(n -> n%3==0)
                .count();
        System.out.println("parallel count of %3==0: " + count);
    }

    /* ---------- 21) custom Collector ---------- */
    static void demoCustomCollector() {
        String joined = Stream.of("a","b","c").collect(bracketJoiner());
        System.out.println("custom collector: " + joined);
    }
    public static Collector<String, StringJoiner, String> bracketJoiner() {
        return Collector.of(
                () -> new StringJoiner(", ", "[", "]"),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString
        );
    }

    /* ---------- 22) Group & top-N per group ---------- */
    static void demoGroupTopNPerGroup() {
        List<Emp> emps = sampleEmps();
        Map<String, List<Emp>> top1PerDept = emps.stream()
                .collect(groupingBy(Emp::dept,
                        collectingAndThen(toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingInt(Emp::salary).reversed())
                                        .limit(1)
                                        .toList()
                        )));
        System.out.println("top1PerDept=" + top1PerDept);
    }

    /* ---------- 23) Stream over Map entries ---------- */
    static void demoStreamOverMap() {
        Map<String,Integer> scores = Map.of("Ann",80,"Bob",95,"Ava",90);
        List<String> topNames = scores.entrySet().stream()
                .filter(e -> e.getValue() >= 90)
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("topNames=" + topNames);
    }

    /* ---------- 24) Index zip ---------- */
    static void demoIndexZip() {
        List<String> data = List.of("a","b","c");
        List<String> withIndex = IntStream.range(0, data.size())
                .mapToObj(i -> i + ":" + data.get(i))
                .toList();
        System.out.println("withIndex=" + withIndex);
    }

    /* ---------- 25) Chunking ---------- */
    static void demoChunking() {
        List<Integer> nums = IntStream.rangeClosed(1,10).boxed().toList();
        int size = 3;
        List<List<Integer>> chunks = IntStream.range(0, (nums.size()+size-1)/size)
                .mapToObj(i -> nums.subList(i*size, Math.min(nums.size(), (i+1)*size)))
                .toList();
        System.out.println("chunks=" + chunks);
    }

    /* ---------- 26) Remove nulls & blanks ---------- */
    static void demoRemoveNullsBlanks() {
        List<String> cleaned = Stream.of("a", null, " ", "b")
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println("cleaned=" + cleaned);
    }

    /* ---------- 27) Frequency map ---------- */
    static void demoFrequencyMap() {
        Map<String, Long> freq = Stream.of("a","b","a","c","b","a")
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println("freq=" + freq);
    }

    /* ---------- 28) Min/Max by comparator ---------- */
    static void demoMinMaxByComparator() {
        List<String> names = List.of("Ann","Benjamin","Ava","Bob");
        String longest = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("longest=" + longest);
    }

    /* ---------- 29) takeWhile / dropWhile ---------- */
    static void demoTakeDropWhile() {
        List<Integer> take = IntStream.rangeClosed(1,10).boxed()
                .takeWhile(n -> n < 5).toList();
        List<Integer> drop = IntStream.rangeClosed(1,10).boxed()
                .dropWhile(n -> n < 5).toList();
        System.out.println("take=" + take + ", drop=" + drop);
    }

    /* ---------- 30) Infinite + short-circuit ---------- */
    static void demoInfiniteShortCircuit() {
        int firstOver1000 = Stream.iterate(1, n -> n+1)
                .map(n -> n*n)
                .filter(n -> n > 1000)
                .findFirst().orElseThrow();
        System.out.println("first square > 1000 = " + firstOver1000);
    }

    /* ---------- Helpers ---------- */
    static List<Emp> sampleEmps() {
        return List.of(
                new Emp("Eng","SDE",120),
                new Emp("Eng","SDE",150),
                new Emp("Eng","QA",100),
                new Emp("HR","HRBP",90),
                new Emp("HR","Recruiter",110),
                new Emp("Sales","AE",200)
        );
    }
}
