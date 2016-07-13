package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
    public Cat(int a){
       super(a);
    }
    Animal a = new Animal(4);
    public static void main(String[] args){
        List<Animal> animal = new ArrayList<Animal>();
        animal.add(new Animal(5));
        List<Cat> cat = new ArrayList<Cat>();
        cat.add(new Cat(4));
        recieveCollection(animal);
        recieveCollection(cat);
    }
    
    public static void recieveCollection(List<? super Cat> list){
        
    }
}
