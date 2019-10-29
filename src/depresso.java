import java.util.Scanner;
public class depresso {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number, the number to be divided into, and the number to be subtracted.");
        int a = input.nextInt(), b= input.nextInt(),c= input.nextInt();
        double d=0.0f;
        try {
            d = (double)a/b-c;
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero attempt");
        }
        System.out.println("The result of the division is "+d);



    }
}
