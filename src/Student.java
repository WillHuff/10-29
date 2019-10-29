public class Student {

    String name;
    int id;
    double cis2348Score;

//define a constructor method for Student class here

    public Student(String x, int y, double z){
        name = x;
        id=y;
        cis2348Score=z;
    }

    public void displayData(){
        System.out.println ("Name: "+ name);
        System.out.println ("ID: "+ id);
        System.out.println("Score: "+ cis2348Score);
    }
}
