import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


class TestMultiBrowser {

	@Test
	void test() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        WebElement search_box = driver.findElement(By.name("q"));
	        search_box.sendKeys("NPRU");
	        search_box.sendKeys(Keys.ENTER);
	        String result = driver.findElement(By.className("VuuXrf")).getText();
	        System.out.print(" Nakhon Pathom Rajabhat :"+result);

	        driver.close();
	}



@Test
void test2() {
	 WebDriver driver = null;
        System.setProperty("webdriver.gecko.driver","D:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("PBRU");
        search_box.sendKeys(Keys.ENTER);
        
        String title = driver.getTitle();
        assertEquals("Google", title);
        driver.close();
}


@Test
void test3() {
	 WebDriver driver = null;
        System.setProperty("webdriver.edge.driver","D:\\webdriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("KRU");
        search_box.sendKeys(Keys.ENTER);
        
        String result = driver.findElement(By.className("VuuXrf")).getText();
        assertEquals("Kanchanaburi Rajabhat University", result);
        driver.close();
}

}