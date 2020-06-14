package switchCase;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int a,b;
        boolean isTrue=false;
        while(isTrue!= true) {
            System.out.println("Choose a option from below:" +
                    "\n\t1.Add" +
                    "\n\t2.Subtract" +
                    "\n\t3.Multiply" +
                    "\n\t4.Division" +
                    "\n\t5.Exit");
            int x=sc.nextInt();

            switch(x) {
                case 1:
                    System.out.println("Enter two numbers\n");
                    a = sc.nextInt();
                    b= sc.nextInt();
                    System.out.println("Addition of two number is "+(a+b));
                    break;
                case 2:
                    System.out.println("Enter two numbers\n");
                    a = sc.nextInt();
                    b= sc.nextInt();
                    System.out.println("Subtraction of two number is "+(a-b));
                    break;
                case 3:
                    System.out.println("Enter two numbers\n");
                    a = sc.nextInt();
                    b= sc.nextInt();
                    System.out.println("Multiplication of two number is "+(a*b));
                    break;
                case 4:
                    System.out.println("Enter two numbers\n");
                    a = sc.nextInt();
                    b= sc.nextInt();
                    System.out.println("Division of two number is "+(a/(double)b));
                    break;
                case 5:
                    isTrue=true;
                    break;
                default:
                    continue;
            }
        }
    }

}
