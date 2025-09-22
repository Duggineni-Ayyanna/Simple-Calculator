//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Calci {
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void sub(int a, int b){
        System.out.println(a - b);
    }
    public static void mul(int a, int b){
        System.out.println(a * b);
    }
    public static void div(double a, double b){
        double c= a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {

                Scanner sc= new Scanner(System.in);

                boolean run = true;
                while (run) {
                    System.out.println("Enter 1 to addition, 2 to subtract, 3 to multiply, 4 to divide, 5 to exit");
                    System.out.println("Enter your decision : ");
                    int opr = sc.nextInt();
                    if (opr != 5) {
                        System.out.println("Enter a Number : ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd Number : ");
                        int num2 = sc.nextInt();


                        if (opr == 1) {
                            add(num1, num2);
                        } else if (opr == 2) {
                            sub(num1, num2);
                        } else if (opr == 3) {
                            mul(num1, num2);
                        } else if (opr == 4) {
                            div(num1, num2);
                        }
                        else {
                            System.out.println("Invalid Input");
                        }
                    }
                    else  {
                        run = false;
                    }
                }

    }
}