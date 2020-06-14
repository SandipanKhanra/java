package switchCase;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int a,b;
        boolean isTrue=false;
        while(isTrue!= true) {
            System.out.println("Choose a option from below:\n");
            System.out.println("\t1.Add 2 numbers\n");
            System.out.println("\t2.Subtract 2 numbers\n");
            System.out.println("\t3.Multiply 2 numbers\n");
            System.out.println("\t4.Divide 2 numbers\n");
            System.out.println("\t5.Exit\n");
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
