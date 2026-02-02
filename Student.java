import java.util.Scanner;

public class Student{
    int id;
    String studentName;
    int marks;
    
    public Student(int id, String name, int marks){
        this.id = id;
        this.studentName = name;
        this.marks = marks;
    }

    public void showMarks(){
        System.out.println("The marks achieved by "+ studentName + " is : "+ marks);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student(11,"Vansh Verma", 89);
        student1.showMarks();


    }

}