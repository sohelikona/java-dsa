

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);  
    }

    // Student() {
    //     System.out.println("constructor called");
    // }


    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {
        
    }

}

public class Opps2 {

    public static void main(String args[]) {
        // Student s1 = new Student("Soheli Arefin Kona", 22);
        Student s1 = new Student();
        s1.name = "Soheli Arefin Kona";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
