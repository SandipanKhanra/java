import java.util.Scanner;


public class loops {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter value of n");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {  	//This is for loop
			System.out.println(i);
		}
//		while(n>0) {  				//This is while loop
//			System.out.println(n);
//			n--;
//		}
//		
//		//The above two loops are called entry control loops
//		
//		
//		do {						//This is do while loop, it is executed atleast once no matter
//			System.out.println(n);  //what is the condition....it is called exit control loop
//		}while(n<5);
	}
}
