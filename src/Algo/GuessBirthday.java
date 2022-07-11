package Algo;

import java.util.Scanner;

public class GuessBirthday {
	private Scanner input;
	private String[] sets;
	private int day = 0;
	
	public GuessBirthday() {
		input = new Scanner(System.in);
		sets = new String[5];
		loadSets();
		interact();
	}
	
	private void loadSets()
	{
		sets[0] = set1;
		sets[1] = set2;
		sets[2] = set3;
		sets[3] = set4;
		sets[4] = set5;
	}
	private static final String set1 =
			         " 1  3  5  7\n" +
					 " 9 11 13 15\n" +
					 "17 19 21 23\n" +
					 "25 27 29 31";
					
	private static final String set2 =
					 " 2 3   6  7\n" +
					 "10 11 14 15\n" +
					 "18 19 22 23\n" +
					 "26 27 30 31";
					
    private static final String set3 =
					 " 4 5   6  7\n" +
					 "12 13 14 15\n" +
					 "20 21 22 23\n" +
					 "28 29 30 31";
					
    private static final String set4 =
					 " 8  9 10 11\n"  +
					 "12 13 14 15\n" +
					 "24 25 26 27\n" +
					 "28 29 30 31";
					
    private static final String set5 =
					 "16 17 18 19\n" +
					 "20 21 22 23\n" +
					 "24 25 26 27\n" +
					 "28 29 30 31";
  
    private void interact() {
    	System.out.println("LET ME GUESS YOUR BIRTHDAY\n=*+*+*+*+=*+*+*+*+=*+*+*+*+=");
    	for(int i = 0; i < sets.length; i++) {
    		System.out.println("============================================");
    		// Prompt the user to answer questions
	  		  System.out.println("Is your birthday in Set"+(i+1));
	  		  System.out.print(sets[i]);
	  		  System.out.print("\nEnter 0 for No and 1 for Yes: ");
	  		  if(input.nextInt() == 1)
	  			  day += Math.pow(2, i); //the birthday is the sum of the 1st elements of the sets where the birthday appears 
	  		System.out.println("============================================");
    	}
    	
    	System.out.println("\nYour birthday is " + this.day + "!");
    }
	public static void main(String[] args) {
		 	new GuessBirthday();  
		}
  }