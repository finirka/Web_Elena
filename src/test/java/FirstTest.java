import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("http://google.com");

    }

    @Test
    public void openGoogle() {
       /* wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("http://google.com");*/
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
    }

    @Test
    public void openGoogle2() {

        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
    }



    @AfterClass
    public void tearDown(){
        wd.quit();

    }


}
