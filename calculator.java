import java.util.Scanner;
import math.log;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("enter a number :");
            int num1 = in.nextInt();
            System.out.print("enter another number :");
            int num2 = in.nextInt();
            System.out.print("Please enter a operater :");
            char op  = in.next().trim().charAt(0);
            switch(op){
                case '+':
                    int y = num1+num2;
                    System.out.println("sum od two number :" + y);
                    break;
                case '-':
                    int z = num1-num2;
                    System.out.println("diff of two number :" + z);
                    break;
                case '*':
                    int x = num1*num2;
                    System.out.println("product of two number :"+x);
                    break;
                case '/':
                    if(num2!=0){
                        int a = num1/num2;
                        System.out.println("division of two number :"+a);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case '%':
                    if(num2!=0){
                        int b = num1%num2;
                        System.out.println("modular division :"+b);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case '^':
                    double c = Math.pow(num1,num2);
                    System.out.println("expoential :"+c);
                    break;
                default:
                    System.out.println("sorry you entered wrong operator");
        break;
            }
        }

    }
}
