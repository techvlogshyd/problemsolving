package interview.servicenow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatingChar {
//“Ab9AAAAABBBC6pVnZ1Yzz7pQ9MDfG5sOoP3tIqR0bSvX”;
public static void main(String[] args) {
    String input = "Ab9AAAAABBBC6pVnZ1Yzz7pQ9MDfG5sOoP3tIqR0bSvX";
//    Set<Character> set = new HashSet<>();
    Map<Character, Integer> memory = new HashMap<>();
  for(char ch : input.toCharArray()){
      memory.put(ch, memory.getOrDefault(ch, 0)+1);
  }
  for(char ch:input.toCharArray()){
      if(memory.get(ch) == 1){
          System.out.println("Non repeating***"+ch);
          break;
      }
  }


//    for(char ch : input.toCharArray()){
//        if(!set.contains(ch)){
//            result = ch;
//        }
//    }



}
//    BaseTest{
//    static WebDriver driver;
//        DriverFactory instance = DriverFactory.init("chrome");
//        driver = instance.getDriver();
//
//        @BeforeSuite
//        void login(String user, String pwd){
//            BrowserUtils.
//        }
//
//    }
//
//    @Test
//
//    static void createRow(String input) {
//
////        driver.get(url);
////        driver.findElement(By.name("create")).click();
////        driver.findElement(By.id("txtOperation")).sendKeys(input);
////        driver.findElement(By.id("btnSave")).click();
////        Assert.assertEquals(expected, "Saved successfully");
//        RowPage rowPage = new RowPage(driver);
//        String msg = rowPage.createRow(input);
//        Assert.assertEquals(msg, xmldoc.get(file, dataSet, "successMsg"));
//
//    }
//
//    RowPage extends BasePage{
//
//        RowPage(WebDriver driver){
//            PageFactory.init(this, driver);
//        }
//
//        @FindBy(name="create")
//        WebElement btnCreate;
//
//        @FindBy(id="txtOperation")
//        WebElement txtOperation;
//
//        @FindBy(id="save")
//        WebElement btnSave;
//
//        @FindBy(id="success")
//        WebElement labelSuccessMsg;
//
//
//        String createRow(String input){
//            browserUtils.waitForPageRefresh();
//            browserUtils.click(btnCreate);
//            browserUtils.inputText(txtOperation, input, int retries);
//            browserUtils.click(btnSave);
//            return browserUtils.getText(labelSuccessMsg);
//        }


    }



//}
