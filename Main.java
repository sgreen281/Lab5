import java.util.*;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student1.print();

    Student student2 = new Student();

    student2.name = "Spencer Green";
    student2.gpa = 4.3;
    student2.major = "Business Analytics and IS";

    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(0, student1.getGPA());
    gpas.add(1, student2.getGPA());
    //System.out.println(gpas);

    double sum = 0;
    for (double i : gpas){
      sum += i;
    }
    System.out.println("The average GPA is " + sum / gpas.size());



// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  }
}