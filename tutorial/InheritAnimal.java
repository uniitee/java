class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    } 
    public void type(){
        System.out.println("Mamal");
    }
}

class Dog extends Animal {
    public void sound() {
        super.sound(); // only way to acess the super class sound
        System.out.println("Dog is barking");
    }
    public void isCute(){
        System.out.println("Very Cute");
    }
}

public class InheritAnimal {
    public static void main(String[] args) {

        // ___________________ALLOWED_______________________
        // Animal ani = new Animal(); //created at runtime
        // ani.sound();
        // ani.type();

        // Dog doggo = new Dog(); //created at runtime
        // doggo.sound();
        // doggo.isCute();

        // Animal ani = new Dog(); // reference -> super-class | obj -> subclass
        // _________________________________________________
        
        // __________________NOT ALLOWED____________________
        // Dog doge = new Animal(); // NOT ALLOWED
        // _________________________________________________

        Animal d = new Dog();
        d.sound();      // obj ka run hoga method not of reference
        // d.isCute();  // error => reference was of Animal so method dog cannot be called
        d.type();       // called of super class
        // d.super.sound(); // an error
    }
}

