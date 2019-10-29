import java.util.Scanner;
public class demoStudentRectangle {
    public static void main(String[] args){
        System.out.println("Name the two dimensions.");
        Scanner darkly = new Scanner(System.in);
            double d1 =darkly.nextDouble();
            double d2 =darkly.nextDouble();
        System.out.println("What is the name?");
            darkly.nextLine();
            String s1=darkly.nextLine();
        System.out.println("What is the ID?");
            int s2=darkly.nextInt();
        System.out.println("What is the score?");
            double s3=darkly.nextDouble();

        Rectangle r1= new Rectangle(d1,d2);
        Student r2= new Student(s1,s2,s3);

        r1.area();
        r2.displayData();
    }
}