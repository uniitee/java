class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }    
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is barking");
    }
}

public class InheritAnimal {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        // d.super.sound(); // an error
    }
}

