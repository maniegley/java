import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number--------");
		int n = sc.nextInt();
		int i = Math.abs(n), c=0, d;
// Counting the number of digits in a given number
		while(i>0) {
			i = i/10;
			c++;
		}
		i = n;
		int sum = 0;
   // Finding the sum which is the power of digit of total number of digit
		while(i>0) {
			d = i%10;
			sum = sum + (int)Math.pow(d,c);
			i = i/10;
		}
		if(n<0) {
			if(c%2 == 1)
				System.out.println("This is not an Armstrong number    ");
			else {
				if(sum == Math.abs(n))
					System.out.println("This is an Armstrong number     ");
				else
					System.out.println("This is not an Armstrong number    ");
			}
		}
		else {
			if(sum == n)
				System.out.println("This is an Armstrong number     ");
			else
				System.out.println("This is not an Armstrong number    ");

		}
		
		
		
		
  //######################################## Alternate logic for checking for Armstrong ################################################
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=n,c=0;
		while(i>0) {
			i = i/10;
			c++;
		}
		i=n;
		int d,sum=0,d1;
		while(i>0) {
			d = i%10;
			d1=1;
			for(int j=0; j<c; j++)
				d1 = d1*d;
			sum = sum + d1;
			i = i/10;
		}
		if(sum == n)
			System.out.println("This is ARMSTRONG number....");
		else
			System.out.println("This is not an ARMSTRONG number....");
			*/
	}

}
