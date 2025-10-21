package interview.publicissapient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//1. Read the webtable using selenium and Find company name with 3rd highest current price
//2. xpath to find company name by its price
// *[contains(text(), '324.40')]/preceding::a[1]
//https://money.rediff.com/gainers

//3.xpath for checkbox where country names starts with A and Primary language is English
//https://cosmocode.io/automation-practice-webtable/
//strong[starts-with(text(), 'A')]/following::td[3][text()='English']/preceding::input[1]
//4. Assert memberName from response where  city is Delhi - API
//5. Handle stale element exception
//{
//        "members": [{
//        "memberName": "Amit",
//        "memberId": 101,
//        "memberAddress": {
//        "PinCode": 410057,
//        "City": "Bombay"
//        }
//        },
//        {
//        "memberName": "Vijay",
//        "memberId": 102,
//        "memberAddress": {
//        "PinCode": 110075,
//        "City": "Delhi"
//        }
//        },
//        {
//        "memberName": "Garima",
//        "memberId": 103,
//        "memberAddress": {
//        "PinCode": 110045,
//        "City": "Delhi"
//        }
//        }
//        ]
//        }
//
//        if(response.jsonPath().get("members").get("memberAddress").get("City").equals("Delhi")){
//        esponse.jsonPath().get("members").get("memberName");
//}
//
//
//given()
//    .body(jsonObject)
//post().
//then().statusCode(201);
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.lang.*;
//public class Gainers  extends BasePage{
//    public Gainers(Webdriver driver){
//        PageFactory.initElements(this, driver);
//    }
//    https://cosmocode.io/automation-practice-webtable/
//    @FindBy(xpath = "//table[@class='dataTable']/tbody/tr/td[1]/a")
//    List<WebElement> companyNames;
//
//    @FindBy(xpath = "//table[@class='dataTable']/tbody/tr/td[1]/a/following::td[3]")
//    List<WebElement> currentPrice;
//
//    public String getThirdHigestPrice(){
//        try{
//            driver.manage().waitImplycitly(Duration.ofSeconds(30));
//            driver.navigateTo().refresh();
//            Map<String, Integer> memory = new HashMap<>();
//            for(int i=0; i<companyNames.size(); i++){
//
//                memory.put(companyNames.get(i).getText(), Integer.parseInt(currentPrice.get(i).getText()));
//            }
//
//            int counter = 0;
//            for(Map.entrySet<String, Integer> entry : memory.getEntrySet()){
//                counter++;
//                if(counter == memory.size()-3){
//                    break;
//                }
//                return entry.getKey();
//            }
//            return "";
//        }
//        catch(Exception e){
//            if(e.type.e){
//
//            }
//        }
//
//    }
//
//
//}

public class Round2 {
    public static void main(String[] args) {
        Map<String, Integer> empSalary = new HashMap<>();
        empSalary.put("ABC", 100);
        empSalary.put("A", 800);
        empSalary.put("BC", 1000);
        empSalary.put("C", 190);
        empSalary.put("D", 700);

        // Step 1: Find 1st, 2nd, and 3rd highest salaries manually
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int salary : empSalary.values()) {
            if (salary > first) {
                third = second;
                second = first;
                first = salary;
            } else if (salary > second && salary < first) {
                third = second;
                second = salary;
            } else if (salary > third && salary < second) {
                third = salary;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Less than 3 distinct salaries");
            return;
        }

        // Step 2: Find employee(s) with that 3rd highest salary
        List<String> employees = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : empSalary.entrySet()) {
            if (entry.getValue() == third) {
                employees.add(entry.getKey());
            }
        }

        System.out.println("1st Highest: " + first);
        System.out.println("2nd Highest: " + second);
        System.out.println("3rd Highest: " + third);
        System.out.println("Employee(s) with 3rd Highest Salary: " + employees);
    }
}
