package siddhesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class TC_DWS_050_Test {
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Fork and pull request",true);
	}
}	
