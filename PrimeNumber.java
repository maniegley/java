import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Point of Prime number");
		int s = sc.nextInt();
		System.out.println("Enter the Ending Point of Prime number");
		int l = sc.nextInt();
		int p;
		System.out.println("All Prime numbers are between"+s+" and "+l);
		for(int i=s; i<l+1; i++) {
			p = checkPrimeNumber(i);
			if(p == 1)
				System.out.println(i);
		}
	}

	public static int checkPrimeNumber(int i) {
		if(i == 1)
			return 0;
		for(int j=2; j<=i/2; j++) {
			if(i%j == 0) {
				return 0;
			}	
		}
		
		return 1;
	}
}
