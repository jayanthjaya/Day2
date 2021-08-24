package day2;
import java.util.Scanner;
public class Laballocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z ;
		String lab ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The X Value");
		x = sc.nextInt();
		System.out.println("Enter The Y Value");
		y = sc.nextInt();
		System.out.println("Enter The Z Value");
		z = sc.nextInt();
		System.out.println("Enter The Lab Allocated for ACE training ");
		lab = sc.next();
		
		if (lab.equals("L1")) 
		{
			if (y<z ) {
				System.out.println("L2 has the minimal seating capacity");
			}
				else {
					System.out.println("L3 has the minimal seating capacity");
				}
					
			}
		else if  (lab.equals("L2")) 
		{
			if (x<z) {
				System.out.println("L1 has the minimal seating capacity");
			}
				else {
					System.out.println("L3 has the minimal seating capacity");
				}
					
			}
		else 
		{
			if (x<y) {
				System.out.println("L1 has the minimal seating capacity");
			}
				else {
					System.out.println("L2 has the minimal seating capacity");
				}
					
		}
		
	}

}
