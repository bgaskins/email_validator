package emailvalidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Author: Bryan Gaskins
//Date: 02/11/22
//Assignment #2: Email ID Validator for Caltech CTME/Simplilearn

public class emailIdValidator {
	
		//A regular expression for a valid email
		public static final String regex = "[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
		
		public static void main(String[] args) {
			
			// ArrayList with email addresses that can be searched
			List <String> emails = new ArrayList<String>();
			emails.add("hell0@company.com");
			emails.add("hithere221@hello.com");
			emails.add("help@school.edu");
			emails.add("food@grocerystore.com");
			emails.add("usa@government.gov");
			emails.add("charity0102@help.org");
			emails.add("findsomething@store.co");
			emails.add("giftsat22street@store.com");
		
			// Declaring userEmail and creating Scanner object
			String userEmail = null;
			Scanner scan = new Scanner(System.in);
			
			// Prompt for user to input their information (i.e. email address)
			System.out.println("Hello! Let's verify your membership.");
			System.out.println("Please enter a valid email:");
				userEmail = scan.nextLine();
				
			// Searching for email address in the ArrayList 
			// User will get a positive or negative response after inputing their email
				for(int i = 0; i < emails.size(); i++)
				{
					if(emails.get(i).equals(userEmail))
					{
						System.out.println("Welcome! Your email has been verified! :)");
						break;
					}
					
					if(i != emails.size())
					{
						System.out.println("Sorry... Email invalid. :( Please try again!");
						break;
					}
				}
		}
		
			// Comparing user input to regex to verify a correct email address input
			private static boolean emailValidation(String email) {
				
				Pattern pattern = Pattern.compile(regex);
				
				Matcher matcher = pattern.matcher(email);
				
				
				if (matcher.matches())
					return true;
				else
					return false;
			}
		}
		
	

