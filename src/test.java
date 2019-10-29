import java.util.Scanner;

public class test {
    public static void main(String[] args){
        //New project
        Scanner input=new Scanner(System.in);
        int x[]=new int[4];
        try{
            for (int i=0;i<=4;i++){
                System.out.println("Enter next int.");
                x[i]=input.nextInt();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds.");
        }

        for (int j=0;j<4;j++){
            System.out.println(x[j]);
        }
    }
}
