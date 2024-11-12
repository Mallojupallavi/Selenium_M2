package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsOnMethodsTest {
	@Test
public void registrationTest() {
	Reporter.log("Register to app", true);
	// Assert.fail();
}
	@Test (dependsOnMethods="registrationTest")
	public void loginTest() {
		Reporter.log("login to app",true);
	}
	@Test (dependsOnMethods="loginTest")
	public void updateProfileTest() {
		Reporter.log("update profile", true);
	}
	
}
