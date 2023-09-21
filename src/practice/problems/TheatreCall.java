package practice.problems;

public class TheatreCall {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("AMB",10,15);
        theatre.getSeats();
        if (theatre.reserveSeat("H12")){
            System.out.println("Please pay");
        }
        else {
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("H12")){
            System.out.println("Please pay");
        }
        else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
