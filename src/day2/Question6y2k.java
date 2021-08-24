package day2;
import java.util.Scanner;
public class Question6y2k {

	public static void main(String[] args) {
		int birt, curr ;
		int age=0;
		Scanner sc = new Scanner(System.in);
	
		birt = sc.nextInt();
		curr = sc.nextInt();
		
	   if (curr>birt)
	   {
	   age = curr-birt;
	   }
	   else if(curr<birt)
	   {
		age = (curr+100)-birt;   
	   }
	   System.out.println(age);
	}

}
