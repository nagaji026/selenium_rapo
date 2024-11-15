package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_005_Test extends BaseClass{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getDataFromExcel("Books", 1, 0), "Books page is displayed");
		test.log(Status.PASS, "Books Page is displayed");
	}

}
