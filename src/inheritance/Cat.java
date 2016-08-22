package inheritance;

public class Cat extends Animal {
    


    public static void main(String[] args) {
       Animal catA = new Animal();
       Cat cat = new Cat();
       catA.tryOverloading();
       cat.tryOverriding();
    }

    public String tryOverloading() {
        System.out.println("Overloading Cat");
        return "";
    }
    
    public void tryOverloading(String a) {
        System.out.println("Overloading Cat");
       
    }

    public String tryOverriding() {
        System.out.println("Overriding Cat");
        return "";
    }

    public void a() {
        System.out.println("Cat");
    }
}
