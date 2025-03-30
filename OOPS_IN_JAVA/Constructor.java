public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Raj");
        Student s2= new Student();
        Student s3= new Student(123);
        System.out.println(s1.name);
        System.out.println(s3.roll);
    }

}
class Student{
    String name;
    int roll;

    Student(String name) {// parameterized constructor
        this.name=name;
    }
        Student(){
            System.out.println("Constructor is called.."); //Non-parameterized
        }

        Student(int roll){
            this.roll=roll;
        }

    }

