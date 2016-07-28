package inheritance;

public class Cat {
    public Animal animal = new Animal();

    public void a(){
        animal.a();
    }
    private void b(){
        animal.b();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.a();
        cat.b();
    }

}
