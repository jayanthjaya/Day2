package day2;
import java.util.Scanner;
public class Seatallocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Rows");
		r = sc.nextInt();
		System.out.println("Enter The Number Of Column");
		c = sc.nextInt();
		System.out.println("Enter The Number Of Student");
		s = sc.nextInt();
		
		
		if (s%c==0 || s%c==1 || s<=c)
		{
			System.out.println("Yes");
		}
			else {
				
				System.out.println("No");
		}
		
			
	}

}
