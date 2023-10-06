interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {

} 

class Cat implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.walk(); 
    }
}
