import java.util.Scanner;
//Using if_else we check conditions
//For a condition if its true then code segment inside if block executed
//Otherwise else block executed

public class if_else{

	public static void main(String[] args) {
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter integer value:");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an even no");
	  }
		else {
			System.out.println(n+" is an odd no");
		}
	}
}
