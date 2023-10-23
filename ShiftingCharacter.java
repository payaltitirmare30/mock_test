 /*Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters
Sample Input:
User gives input as "Hello"
Output should be: "Fbiil" */
package com.interview.practice;
import java.util.Scanner;

public class ShiftingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking input 
		System.out.println("Enter a String : ");
		String originalText = sc.next();
		
		// Call the shiftCharacter method
		String shiftedText = shiftCharacters(originalText);

		//printing the string after shifting 
		System.out.println("Shifted String :"+ shiftedText);
	}
	
	public static String shiftCharacters(String input) {
		// Convert the input string to a character array
		char[] chars = input.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			// Check if the character is uppercase and shift it left by 2 characters
			if(Character.isUpperCase(chars[i]))
			{
				chars[i] = (char) (chars[i]-2);	
				 // If it goes below A wrap it around by adding 26
				if (chars[i] < 'A') {
					chars[i] = (char) (chars[i] + 26);
				}
			}
			// Check if the character is lowercase and shift it  left by 3 characters
			if (Character.isLowerCase(chars[i])) {
				
				chars[i] = (char) (chars[i] - 3);		
				
				 // If it goes below 'a' wrap it around by adding 26
				if (chars[i] < 'a') {
					chars[i] = (char) (chars[i] + 26);
				}
			}
		}
		// Convert the character array back to a string and return the  string
		return new String(chars);
	}

}
