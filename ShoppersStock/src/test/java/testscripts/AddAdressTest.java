package testscripts;

public class AddAdressTest
{
	@Test
	
	Map<String,String> map=excel.getData("Sheet1","Add Address");
	welcome.clickLoginButton();
	login.loginToApp(map.get("Email"),map.get("Password"));
	Thread.sleep(2000);
	home.clickProfileButton();
	Thread.sleep(2000);
	
	
	

}
