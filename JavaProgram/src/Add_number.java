import java.util.Scanner;

public class Add_number {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int num1=sc.nextInt();


        System.out.println("enter Second number");
        int num2=sc.nextInt();


        int sum=num1+num2;
        System.out.println("Result is :"+sum);
    }
}


