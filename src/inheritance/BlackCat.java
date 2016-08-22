package inheritance;

public class BlackCat extends Cat {
    public static void main(String[] args) {

        BlackCat black = new BlackCat();
        Animal a = (Animal)black;
        a.a();
    }
}
