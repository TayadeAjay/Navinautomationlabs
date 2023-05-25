package commons;

import java.util.ArrayList;

public class constant {

	public static String username = "rahul";

	public static String lastname = "tiger";

	public static String password = "abc@123";
	
	public static String loginerror="Warning: No match for E-Mail Address and/or Password.";

	public static String expectedtextacc = "Your Account Has Been Created!";

	public static String expectedtextlogin = "My Account";

	public static String errormsg = "Not working";
	
	public static String product1="iphone";
	
	public static String product2="samsung";
	
	public static String iMac="iMac";
	
	public constant(ArrayList<String> name1, ArrayList<String> pass) {

		name1.add("vinay");
		name1.add("virat");
		name1.add("sairat");
		name1.add("balma");
		name1.add("rahul");

		pass.add("vinay@123");
		pass.add("virat@123");
		pass.add("sairat@123");
		pass.add("balma@420");
		pass.add("rahul@123");
	}

}