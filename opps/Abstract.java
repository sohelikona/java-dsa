abstract class Animal {
    abstract void walk();
    public void eat() {
        System.out.println("cat eats fish");
    }
}

class Cat extends Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Kangaroo extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class Abstract {
    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.walk();
        cat.eat();
        Kangaroo kangaroo = new Kangaroo();
        kangaroo.walk();
    }    
}
