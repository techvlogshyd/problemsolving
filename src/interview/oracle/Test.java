package interview.oracle;

public class Test {
    public static void main(String[] args) {
        int amount = 800;
        //500 200 100
        System.out.println(numberOfNotes(amount));
    }
    public static int numberOfNotes(int amount){
        int result = 0;
        for(int amt : new int[]{500,200,100}){
            result += amount / amt;
            amount = amount % amt;
        }
        return result;
    }

}


//suite xml
//test class
//@Tests
//    clickLink("Fresh");
//
//Page class
//    clickLink(String linkName){
//        WebElement linkToClick = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[contains(text(),'"+linkName+"')]"));
//        ElementUtils.clickAnElement(linkToClick);
//}
//
//class Amazon{
//    Amazon(WebDriver driver){
//        Pagefactory.init();
//    }
//    @FindBy(id = 'value')
//    Webelement linkMenu;
//
//    linkMenu.click();
//}
//private By linkMenu = By.xpath("//*[@id='nav-xshop']/a[contains(text(),'Fresh')]");
//    actions
//    elments of the page
//clickLink(){
//        WebElement linkToClick = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[contains(@class,'""+paramValue+""')]"));
//        ElementUtils.clickAnElement(webelement);
//        By
//        type value
//
//        linkMenu.click();
//        }
//
//
//        RequestSpecification request = given
//            .body(json);
//    Response res = request.post();
//    Assert.assertEquals(res.getStatusCode, '200');




