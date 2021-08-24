package day2;
import java.util.Scanner;

public class QuestionP2Greenlight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float s,t,d,sp ;
		
		System.out.println("Enter The Speed ");
		sp = sc.nextFloat();
		
		System.out.println("Enter The Distance");
		d = sc.nextFloat();
		System.out.println("Enter The Time");
		t = sc.nextFloat();
	
		
		t = t/3600 ;
		s = d/t ;
		
		if (s>sp) 
		{
			System.out.println("Yes");
		}
		else  
		{
			System.out.println("No");
		}
	}

}
