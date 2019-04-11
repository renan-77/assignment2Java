package com.orenan.griffith;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Printing out the outputs returned from the methods below.
		System.out.println("The word is a palindrome: " + isWordPalindrome("racecar"));
		
		System.out.println(" "); //That's just for getting an space between the lines.
		System.out.println("The number of vowels in the word inputed is: " + vowelNumberCheck("renan"));
		
		System.out.println(" ");
		System.out.println("Is there repetition: " + hasRepetitionArray());
		
		System.out.println(" ");
		System.out.println("Array with the names characters: " + "\n" + namesToChars());
		
		System.out.println(" ");
		System.out.println("The array where the values are being declared is: " + arrayProperties());
	}

	/*
	 * Method that checks whether the word is a palindrome or not.
	 */
	static boolean isWordPalindrome(String palindromeWordCheck) {
		//Declaring the variable that will be returned and an comparison String.
		String toConfirmWord = "";
		boolean isPalindrome = false;
		
		System.out.println("Inputed Word =  " + palindromeWordCheck);
		
		//Filling the confirmation variable with the characters from the word.
		for(int i = palindromeWordCheck.length() - 1; i >= 0; i--) {
			toConfirmWord = toConfirmWord + palindromeWordCheck.charAt(i);	
		}
		
		System.out.println("Reversed Word =  " + toConfirmWord);
		System.out.println(" ");
		
		//Checks if the word is the same when the characters order
		if(palindromeWordCheck.equalsIgnoreCase(toConfirmWord)){
			isPalindrome = true;
		}else {
			isPalindrome = false;
		}	
		
		//returning the boolean.
		return isPalindrome;	
	}
	
	
	/*
	 * Method that checks the number of vowels and consonants and returns the number of vowels.
	 */
	static int vowelNumberCheck(String wordVowelsCheck) {
		//Declaring the counters for the vowels and consonants.
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		
		//Checking with a switch inside a for loop if each character is or not a vowel, if it is, increases the counter.
		for(int i = 0; i < wordVowelsCheck.length(); i++) {
			switch(wordVowelsCheck.toLowerCase().charAt(i)) {
			case 'a':
				numberOfVowels++;
				break;
				
			case 'e':
				numberOfVowels++;
				break;
			case 'i':
				numberOfVowels++;
				break;
				
			case 'o':
				numberOfVowels++;
				break;
			case 'u':
				numberOfVowels++;
				break;
			default:
				break;
			}
		}
		System.out.println("The number of Vowels is: " + numberOfVowels);
		
		//Creating the number of consonants based that the word has only letters.
		numberOfConsonants = wordVowelsCheck.length() - numberOfVowels;
		
		//Printing the number of consonants
		System.out.println("The number of Consonants is: " + numberOfConsonants);
		System.out.println(" ");
		
		//returning the value for the vowels.
		return numberOfVowels;
	}
	
	/*
	 * Method to state if the inputed array has repetition.
	 */
	protected static boolean hasRepetitionArray() {
		//Declaring the boolean variable that will show whether there's repetition or not and the array.
		boolean isElementRepeated = false;
		int[] numberSet = {3,9,8,1,10};
	
		//Sorting the order of the numbers in purpose of having them organised to check
		Arrays.sort(numberSet);
		
		//For loop for checking each element of the array.
		for(int i = 0; i < numberSet.length; i++) {
			//If the number after the [i] element in the list [i + 1] is the same as [i] change isElementRepeated to true.
			if(i < numberSet.length - 1 && numberSet[i] == numberSet[i + 1]) {
				isElementRepeated = true;
				break;
			}else {
				isElementRepeated = false;
			}
		}
		return isElementRepeated;
	}
	
	
	/*
	 * Method that takes a set of names and transform in a 2D array of characters.
	 */
	private static String namesToChars() {
		//Declaring the array of strings and the array that will get those strings as characters with a limited size.
		String[] nameSet = {"renan","eduarda","lucas","jessica"};
		char [][] characterSet = new char [4][8];
		
		//A for loop nesting a for loop to go trough the elements of the first array and set those elements as the ones for the characters array.
		for(int i = 0; i < nameSet.length; i++) {
			//Giving a space and a label to the names (organising).
			System.out.println(" ");
			System.out.println("######## NEXT NAME ########");
			//For loop that goes through the columns of the characterSet array (characterSet[][!]). 
			for(int j = 0; j < nameSet[i].length(); j++) {
				System.out.println(" ");
				System.out.println("Line: " + i + " Column: " + j);
				//Assigning the values from nameSet to characterSet.
				characterSet[i][j] = nameSet[i].charAt(j);
				System.out.println(characterSet[i][j]);
				System.out.println(" ");
				System.out.println(" ");
			}	
		}
		//Converting the array to a String where it can be shown.
		String arrayCharactersAsString = Arrays.toString(characterSet[0]) + "\n" + Arrays.toString(characterSet[1]) + "\n" +
		Arrays.toString(characterSet[2]) + "\n" + Arrays.toString(characterSet[3]);
		
		//returning the String.
		return arrayCharactersAsString;
	}
	
	static String arrayProperties() {
		//Declaring the variables (one array and the variable for the sum).
		int[] setOfNumbers = {12,56,33,9,74};
		int arraySum = 0;
		
		//Sorting the Array to get Maximum and Minimum.
		Arrays.sort(setOfNumbers);
		
		//Printing maximum, minimum and length.
		System.out.println("The Smallest Number is: " + setOfNumbers[0]);
		System.out.println("The Largest Number is: " + setOfNumbers[setOfNumbers.length - 1]);
		System.out.println("The lenght of the array is: " + setOfNumbers.length);
		
		//For loop for sum the elements from the array
		for(int i = 0; i < setOfNumbers.length; i++) {
			arraySum += setOfNumbers[i];
		}
		
		//Creating a variable that will divide the sum by the length to get the average and printing it.
		double avarageArrayValue = arraySum / setOfNumbers.length;
		System.out.println("The avarage of the array is: " + avarageArrayValue);
		
		//Assigning a String for the array to print it on the console.
		String arrayAsString = Arrays.toString(setOfNumbers);
		
		//returning the string.
		return arrayAsString;
	}
}
