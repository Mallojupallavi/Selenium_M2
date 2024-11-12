package Annotations;

public class LoginTest extends BaseClassForLogin {
public void loginTest() {
	login.setEmail("admin");
	login.setPassword("admin");
	login.clickKeepMeLoggedIn();
	login.clickLogin();
}
}
