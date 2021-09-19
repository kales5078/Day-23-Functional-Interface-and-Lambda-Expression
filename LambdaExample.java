package Math;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//functional interface for firstName
interface FirstInt
{
  boolean checkValidFirstName(String firstName); //Abstract Method for firstName
}

//Functional interface  for LastName
interface LastNameInt
{
  boolean checkValidLastName(String lastName);
}

//functional Interface for the E-mail 
interface Email
{
	boolean checkValidEmail(String email);
}

//functional Interface for the E-mail
interface MobNum
{
	boolean checkValidMobileNumber(String mobNumber);
}

//functional Interface for the password 
interface Password 
{
	boolean checkValidPassword(String pass);
}


public class LambdaExample
{

	public static void main(String[] args)
	{
		
   // Lambda function for First Name Validation	
	FirstInt firstInt = (firstName) -> 
	{
		
        boolean isFirstName; //Variable declare to check validation
		String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";    
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		if (firstName == null)
		{
			isFirstName = false;
		}
		
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
		
		//condition to check FirstName Validation
		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name " +matcher.matches());
		else
			System.out.println(firstName + " is an Invalid First Name "+matcher.matches());
	  
		return isFirstName;	
	};
	
	//Lambda Function for LastName
	LastNameInt lastnameInt = (lastName) -> 
	{
		boolean isLastName; //Variable declare to check validation
		String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";    
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		if (lastName == null)
		{
			isLastName = false;
		}
		
		Matcher matcher = pattern.matcher(lastName);
		isLastName = matcher.matches();
		
		//condition to check LastName Validation
		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name "+matcher.matches());
		else
			System.out.println(lastName + " is an Invalid Last Name "+matcher.matches());
	      return matcher.matches();

	};
	
	//Lambda Function for E-mail
	Email E1 = (email) -> 
	{
		boolean isEmail;
		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		if (email == null)
		{
			isEmail = false;
		}
		Matcher matcher = pattern.matcher(email);
		isEmail = matcher.matches();

		if (isEmail)
			System.out.println(email + " is a Valid Email address "+matcher.matches());
		else
			System.out.println(email + " is an Invalid Email address "+matcher.matches());
		
		return matcher.matches();
	   };
	   
		//Lambda Function for Mobile Number
	   MobNum Mob = (mobNumber) -> {
		   boolean isMobileNumber; //Variable declare to check validation
			String moblieRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
  
			Pattern pattern = Pattern.compile(moblieRegex);
			
			if (mobNumber == null)
			{
				isMobileNumber = false;
			}
			
			Matcher matcher = pattern.matcher(mobNumber);
			isMobileNumber = matcher.matches();
			
			//condition to check Email Validation
			if (isMobileNumber)
				System.out.println(mobNumber + " is an Valid Mobile Number "+matcher.matches());
			else
				System.out.println(mobNumber + " is an Invalid Mobile Number "+matcher.matches());
	         	return matcher.matches();
	  
	   };
	   
	   //Lambda Function for PassWord
		 Password pwd = (password) -> {
		   boolean isPassword; //Variable declare to check validation
			String passRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
  
			Pattern pattern = Pattern.compile(passRegex);
			
			if (password == null)
			{
				isPassword = false;
			}
			
			Matcher matcher = pattern.matcher(password);
			isPassword = matcher.matches();
			
			//condition to check Password Validation
			if (isPassword)
				System.out.println(password + " is an Valid Password \n");
			else
				System.out.println(password + " is an Invalid Password");
			return  matcher.matches();
		};

	   //Print statement
	    System.out.println(firstInt.checkValidFirstName("Suraj"));
	    System.out.println(lastnameInt.checkValidLastName("Kale"));
	    System.out.println(E1.checkValidEmail("surajkale@gmail.com"));
	    System.out.println(Mob.checkValidMobileNumber("91 9667859075"));
	    System.out.println(pwd.checkValidPassword("Suraj@123"));
	}
}
