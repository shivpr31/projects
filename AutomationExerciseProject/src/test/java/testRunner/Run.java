package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features={".//Features/SignUp.feature",
	        		".//Features/Login.feature",
	        		".//Features/TestCases_APITesting_VideoTutorials.feature",
	        		".//Features/ContactUs.feature",
	        		".//Features/Category_Brands.feature",
	        		".//Features/Subscription.feature",
	        		".//Features/VerifyAllProducts&productdetailpage.feature",
	        		".//Features/SearchProduct.feature",
	        		".//Features/ProductsinCart.feature",
	        		".//Features/PlaceOrder.feature"},
       
				glue="stepDefinitions",
				dryRun=false,
				monochrome=true,
				plugin={"pretty", "html:target/Cucumber_Reports/Html_Report.html",
				"junit:target/Cucumber_Reports/Xml_Report.xml"}
		        )

public class Run {

}
