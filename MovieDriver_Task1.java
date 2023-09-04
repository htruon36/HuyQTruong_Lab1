/*
 * Class: CMSC203 
 * Program: Lab 1
 * Instructor: Ashique Tanveer
 * Summary of Description: You are given a file called Movie.java, which has the data fields for a  movie, along with “setters” and “getters”, and a “toString” method.  You will create a driver class from the pseudocode in Task #1 below to test the Movie class.
 * Due Date: 07/03/2023 
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
*/
import java.util.Scanner;

public class MovieDriver_Task1 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in); //Create a new object of type Scanner that reads from the keyboard
		Movie m=new Movie(); //Create a new movie object
		System.out.println("Enter the name of a movie: ");
		String title=input.nextLine();
		m.setTitle(title); //Set the title in the movie object
		System.out.println("Enter the rating of the movie: ");
		String rating=input.nextLine();
		m.setRating(rating); //Set the rating in the movie object
		System.out.println("Enter the number of tickets sold for this movie: ");
		int soldTickets=input.nextInt();
		m.setSoldTickets(soldTickets); //Set the number of tickets sold in the movie object
		System.out.println("Goodbye");
	}

}
