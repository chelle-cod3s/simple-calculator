import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        char operator;
        double num1,num2;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your operator :'+' '*' '/' '-' ");

       operator=scanner.next().charAt(0);

        System.out.println("enter the two values:");
        num1= scanner.nextDouble();
        num2= scanner.nextDouble();

        scanner.close();

        switch (operator){
            case '+':
                System.out.printf("%.2f+ %.2f = %.2f",num1,num2,(num1+num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f =%.2f",num1,num2,(num1*num2));
                break;
            case '-':
                System.out.printf("%.2f * %.2f = %.2f",num1,num2,(num1-num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.printf("%.2f / %.2f =%.2f",num1,num2,(num1/num2));
                }
                else {
                    System.out.println("Invalid,denominator cannot be zero!");
                }

        }
    }
}