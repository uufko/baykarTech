import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoToPageTest extends App {
    @BeforeClass
    public void setDriverTest(){
        setDriver();
    }
    @Test (priority = 1)
    public void goPageTest(){
        goPage();
    }
    @Test (priority = 2)
    public void closeWindowTest(){
        closeWindow();
    }
    //@Test (priority = 3) public void testTest(){TestDeneme();}
    @Test (priority = 3) public void clickFirstBarTest() throws InterruptedException {clickFirstBar();}
    @Test (priority = 4) public void clickSecondBarTest() throws InterruptedException {clickSecondBar();}


}
