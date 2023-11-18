package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtility extends BaseClass {
	public void enteringTheDataIntoWebelement(WebElement element,String data) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='"+data+"'",element);

}
	public void clickingOnWebelement(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'",element);
}
	public void scrolloingThePage(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy("+x+","+y+")");
}
	
}                
