import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Point of Prime number");
		int s = sc.nextInt();
		System.out.println("Enter the Ending Point of Prime number");
		int l = sc.nextInt();
		int p;
		System.out.println("All Perfect numbers are between"+s+" and "+l);
		for(int i=s; i<l+1; i++) {
			p = checkPerfectNumber(i);
			if(p == 1)
				System.out.println(i);
		}
	}

	public static int checkPerfectNumber(int i) {
		int sum=0;
		for(int j=1; j<=i/2; j++) {
			if(i%j == 0)
				sum = sum + j;
		}
		if(sum == i)
			return 1;
		return 0;
	}


}
