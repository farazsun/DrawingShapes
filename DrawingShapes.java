/*
 * DrawingShapes.java
 * Author:  Faraz Sunil
 * Submission Date:  10/21/2022
 *
 * Purpose: The user is prompted a shape and its length to be drawn using asterisks. The options for shape include rectangles,triangles, hexagons, octagons, and pentagons
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a shape: r t h o p");
		char whichShape = scan.nextLine().charAt(0);
		// Asking the user for which shape and storing it as the variable whichShape. If the whichShape variable is r, t, h, o, or p, then one of the 
		// if branches below will be executed. If not, then "Invalid shape\nGoodbye!" will be outputted.
		
		char asterisk = '*'; char space = ' '; // Storing the asterisk and space characters as a variable.
		
		if (whichShape == 'r') { // This branch is for creating a rectangle.
			System.out.println("Enter a length");
			int inputtedLength = scan.nextInt();
			// Asking the user for a length and storing it as the variable named inputtedLength.
				
			if (inputtedLength > 1) { // Inputted Length must be greater than 1. If not, "Length must be greater than 1\nGoodbye!" will be outputted.
				System.out.println("Enter a height");
				int inputtedHeight = scan.nextInt();
				// Asking the user for the height of the rectangle and storing the value as inputtedHeight. If the inputted height is above 1, then 
				// the if branch below is executed. If not, "Height must be greater than 1\nGoodbye!" will be outputted.
					
				if (inputtedHeight > 1) {
					System.out.println("Below is a " + inputtedLength + " by " + inputtedHeight + " rectangle of " + asterisk);
					
					char[] lengthArray = new char[inputtedLength];
					// Creating an array of asterisks that will be outputted to the user.
					
					for (int index = 0; index < lengthArray.length; index++) {
						lengthArray[index] = asterisk;
					} // The for loop is assinging the asterisk character to each index of the array. The array's length is the length input from user.
					
					for (int integer = 0; integer < inputtedHeight; integer++) {
						System.out.println(lengthArray);
					} // The loop will output the array of asterisks (length inputted). How many times the length is outputted is determined by the
					// height input from the user.
				}
				
				else {
					System.out.println("Height must be greater than 1\nGoodbye!");
				}
			}
				
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
		
		else if (whichShape == 't') { // This branch is for creating a trapezoid.
			System.out.println("Enter a length");
			int inputtedLength = scan.nextInt();
			// Asking the user for a length and storing it as the variable inputtedLength.
			
			if (inputtedLength > 1) { // If inputted length is not greater than 1, "Length must be greater than 1\nGoodbye!" will be outputted.
				System.out.println("Below is a triangle with two side lengths of " + inputtedLength + " " + asterisk);
				
				int numberOfSpaces = inputtedLength - 1; int numberOfAsterisks = 1; // There is always 1 asterisk at the top of the triangle, and the
				// rest of characters are spaces in the first line.
				
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} // Printing out the number of spaces for the first line. 
				
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} System.out.println(); // Printing out the number of asterisks for the first line. Then printing a whole line so that the second line
				// will be outputted next.
				
				int number = 0; int numberOfLinesAfterFirst = inputtedLength - 1;
				while (number < numberOfLinesAfterFirst) { // Outputting the rest of the lines following the first line of the triangle below.
					numberOfSpaces--; numberOfAsterisks+=2; // The pattern of the triangle is there is one less space and two more asterisks outputted
					// in the next line. 
					
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Outputting the number of spaces in the line.
					
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Outputting the number of asterisks in the line. Printing a line so the next line will be executed.
					number++; // Updating the value of number.
				} // The loop will continue until the value of number equals the number of lines - the first line.
			}
				
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");	
			}
		}
				
		else if (whichShape == 'h') { // This branch is for creating a hexagon.
			System.out.println("Enter a length");
			int inputtedLength = scan.nextInt();
			// Asking the user for the length and storing it as inputtedLength.
			
			if (inputtedLength > 1) { // If the inputtedLength is not greater than 1, "Length must be greater than 1\nGoodbye!" will be outputted.
				System.out.println("Below is a hexagon with side lengths of " + inputtedLength + " *");
				
				int numberOfSpaces = inputtedLength - 1; int numberOfAsterisks = inputtedLength; // The number of asterisks always = the inputtedLength
				// for the first line. The number of spaces always equals inputtedLength - 1 for the first line.
				
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} // Printing the number of spaces in the first line.
				
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} System.out.println(); // Printing the number of asterisks in the first line. Then printing a line so the next lines can be outputted.
				
				int number = 0; int numberOfLinesBetweenFirstAndMiddle = inputtedLength - 2; 				
				while (number < numberOfLinesBetweenFirstAndMiddle) { // These lines outputted in the while loop are the lines after the first line and
					// before the middle line.
					
					numberOfSpaces--; numberOfAsterisks+=2; // The lines after the first and before the middle follow a pattern. The number of spaces
					// decreases by one and the number of asterisks increases by two. Before each line is outputted, the number of spaces and number of
					// asterisks are updated.
					
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Printing the number of spaces in the line.
					
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks in the line. Then, printing a line so that if the while loop is executed
					// again, the spaces and asterisks will be outputted on the next line.
					number++;
				} // The while loop continues until number equals the number of lines between the first and middle.
				
				int numberOfAsterisksInMiddleLine = numberOfAsterisks + 2; // The number of asterisks in the middle line is 2 more than the line right 
				// before it (last line executed in the while loop above). There are no spaces in the middle line.
				
				for (int integer = 0; integer < numberOfAsterisksInMiddleLine; integer++) {
					System.out.print(asterisk);
				} System.out.println(); // Printing the number of asterisks in the middle line. Then printing a line so the spaces and asterisks in the
				// next lines below will be outputted in lines below this one.
				
				number = 0; // Making number 0 again. The while loop below for lines between the middle and last line is similar to the while loop above
				// for lines between the first and middle.
				
				int numberOfLinesBetweenMiddleAndLast = numberOfLinesBetweenFirstAndMiddle; // There are the same number of lines between the first and
				// middle line and between the middle and last line.
				
				numberOfSpaces = 0; numberOfAsterisks = numberOfAsterisksInMiddleLine; // There were no spaces in the middle line, so the original value
				// of numberOfSpaces equals 0. The number of asterisks will equal the number of asterisks in the middle line before being updated in the
				// while loop for the next lines.
				
				while (number < numberOfLinesBetweenMiddleAndLast) { // The while loop is for the lines between the middle and last.
					numberOfSpaces++; numberOfAsterisks-=2; // There is a pattern for the lines between the middle and last. There is one more space
					// and two more asterisks in the line being executed than the previous line.
					
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Printing the number of spaces in the line.
					
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks in the line. Then, printing a line so the asterisks and spaces for the
					// next line (if any) will be outputted on the line below.
					number++;
				} // The while loop continues until all lines between middle and last are outputted.
				
				numberOfSpaces = inputtedLength - 1; numberOfAsterisks = inputtedLength; // The last line's number of spaces in the last line 
				// always equals the inputtedLength - 1, and the last line's number of asterisks will always equal the inputtedLength.
				
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} // Printing the number of spaces in the last line.
				
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} // Printing the number of asterisks in the last line. There is not a line being printed because this is the last line, and there will
				// be no more lines being outputted.
			}	
			
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
		
		else if (whichShape == 'o') { // This branch is for creating an octagon. First, a shape similar to the triangle is constructed. Then, a 
			// shape similar to the rectangle is constructed. Then, another shape similar to the triangle is constructed.
			
			System.out.println("Enter a length");
			int inputtedLength = scan.nextInt();
			// Asking the user for length and storing it as inputtedLength.
			
			if (inputtedLength > 1) { // If the length is not greater than 1, "Length must be greater than 1\nGoodbye!" will be outputted.
			
				System.out.println("Below is an octagon with side lengths of " + inputtedLength + " " + asterisk);
			
				int numberOfSpaces = inputtedLength - 1; int numberOfAsterisks = inputtedLength; // The number of spaces in the first line will always
				// equal inputtedLength - 1. The number of asterisks in the first line will always equal the inputtedLength.
			
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} // Printing the number of spaces in the first line.
			
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} System.out.println(); // Printing the number of asterisks in the first line. Then, printing a line so the spaces and asterisks outputted
				// next will be printed on the lines below the first.
			
				int number = 0; int numberOfLinesBetweenFirstAndMiddle = inputtedLength - 2;
				while (number < numberOfLinesBetweenFirstAndMiddle) { // The while loop ultimately prints out the number of spaces and asterisks for the 
				// lines after the first line and before the base of the shape like a triangle.
				
					numberOfSpaces--; numberOfAsterisks+=2; // These lines follow a pattern. The number of spaces in this line is always one less than the 
					// number of spaces in the previous line, and the number of asterisks in this line is always two more than the number of asterisks in
					// the previous line.
				
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Printing the number of spaces in the line.
				
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks in the line. Then, printing a line so the spaces and asterisks printed next
					// will be in the line below.
					number++;
				}
			
				numberOfAsterisks+=2; number = 0; int numberOfLinesForRectangle = inputtedLength; // This block of code with the while loop will construct
				// a shape similar to the rectangle. There are no spaces in this shape.
			
				while (number < numberOfLinesForRectangle) { // While loop continues until the shape like the rectangle is constructed.
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks in each line of the shape like the rectangle. Then printing a line so the
					// asterisks printed next will be in the line below.
					number++;
				}	
			
				number = 0; // Making number 0 again so the while loop below will execute.
			
				numberOfSpaces = 0; int numberOfLinesLeftBeforeTheLast = inputtedLength - 2; 
				// Since there were 0 spaces in the lines above, the number of spaces will be 0 and then updated before each line is printed.
			
				while (number < numberOfLinesLeftBeforeTheLast) { // This while loop prints the lines constructing a shape like the triangle. It will print
					// the rest of the lines except the last (the last line will not have System.out.println(); which is why I coded it this way).
				
					numberOfSpaces++; numberOfAsterisks-=2; // The number of spaces in this line is always one more than the number of spaces in the previous
					// line, and the number of asterisks in this line will always be two less than the number of asterisks in the previous line.
				
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Printing the number of spaces for the line.
				
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks in the line. Then, printing a line so the spaces and asterisks printed later
					// will be on the line below and not the same line as the already printed spaces and asterisks.
					number++;
				}
				numberOfSpaces = inputtedLength - 1; numberOfAsterisks = inputtedLength; // The number of spaces in the last line will always
				// equal inputtedLength - 1. The number of asterisks in the first line will always equal the inputtedLength.
			
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} // Printing the number of spaces in the last line.
			
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} // Printing the number of asterisks in the first line. No new line will be printed because no lines follow the last line.
				
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}	
		
		else if (whichShape == 'p') { // This branch will create a pentagon. First, a shape similar to that of a triangle will be constructed. Then,
		// a shape similar to that of a rectangle will be constructed.
			
			System.out.println("Enter a length");
			int inputtedLength = scan.nextInt();
			// Asking the user for the length and storing it as inputtedLength.
			
			if (inputtedLength > 1) { // If the length is not greater than 1, "Length must be greater than 1\nGoodbye!" will be outputted.
				
				System.out.println("Below is a pentagon with 4 side lengths of " + inputtedLength + " " + asterisk);
				
				int numberOfSpaces = inputtedLength - 1; int numberOfAsterisks = 1; // The number first line will always have one asterisk, and the
				// rest of the characters before it are spaces.
				
				for (int integer = 0; integer < numberOfSpaces; integer++) {
					System.out.print(space);
				} System.out.print(asterisk); System.out.println(); 
				// Printing the number of spaces in the for loop. Then, printing one asterisk to complete the first line. Printing a line so that the
				// spaces and asterisks for the next lines will be printed in the lines below the first.
				
				int number = 0; int numberOfLinesBetweenFirstAndMiddle = inputtedLength - 2;
				while (number < numberOfLinesBetweenFirstAndMiddle) { // While loop will continue until all lines between the first and middle line 
				// are printed.
					
					numberOfSpaces--; numberOfAsterisks+=2; // The number of spaces for this line will always be one less than the number of spaces in
					// the previous line, and the number of asterisks for this line will always be two more than the number of asterisks in the previous.
					
					for (int integer = 0; integer < numberOfSpaces; integer++) {
						System.out.print(space);
					} // Printing the number of spaces for the line.
					
					for (int integer = 0; integer < numberOfAsterisks; integer++) {
						System.out.print(asterisk);
					} System.out.println(); // Printing the number of asterisks. Then, printing a line so the spaces and asterisks for the next line
					// will be printed in the line below this one.
					number++;
				}					
				
				numberOfAsterisks+=2;
				for (int integer = 0; integer < numberOfAsterisks; integer++) {
					System.out.print(asterisk);
				} System.out.println(); // Printing the number of asterisks for the middle line. There are no spaces in the middle line. Then, printing
				// a line so the next lines will be printed below this one.
				
				int totalNumberOfLines = inputtedLength * 2 - 1; int linesLeft = totalNumberOfLines - inputtedLength; // The lines remaining are going to be
				// constructed similar to that of the rectangle.
				
				char[] restOfPentagonArray = new char[numberOfAsterisks]; // Creating an array of asterisks that will be printed in each line remaining.
				
				for (int index = 0; index < restOfPentagonArray.length; index++) {
					restOfPentagonArray[index] = asterisk;
				} // Assinging asterisk to each index of the array.
				
				number = 0; // Number now equals 0 so the while loop will execute below.
				
				while (number < linesLeft) { // While loop will print the array of asterisks for every line remaining which was created in the for loop above.
					System.out.println(restOfPentagonArray);
					number++;
				}
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
			
		else { // If the shape is not inputted as r, t, h, o, or p, then this statement will be outputted.
			System.out.println("Invalid shape\nGoodbye!");
		}
		scan.close();
	}
}