package Organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	   @org.testng.annotations.Test
       public void organization() {
		WebDriver w = new ChromeDriver();
		w.get("http://localhost:8888");
	
       }
}
