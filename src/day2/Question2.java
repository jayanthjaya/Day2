package day2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any Charcter");
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("Vowel" +ch);
		} 
		else 
		{
		 System.out.println("Consontant");
		}
	
		}
	}
	

	

 