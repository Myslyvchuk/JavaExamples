package inheritance;

public class Animal {

    int intValue;
    static int staticIntValue;
    protected int portectedInherit = 10;
  
    public void a() {
        System.out.println("Animal");
    }

    public void b() {

    }

    public void c() {

    }

   public int animalInt = 10;

    public String tryOverloading() {
        System.out.println("Overloading Animal");
        return "";
    }

    public String tryOverriding() {
        System.out.println("Overriding Animal");
        return "";
    }
    public static void main(String[] args ){
        Animal an= new Animal();
        System.out.println(an.intValue);
        System.out.println(staticIntValue);
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
        System.out.println(-10%3);
        String a = new String("S");
        String b = a;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        
        int dayOfWeek = 0;
        switch(dayOfWeek) {
        case 0:
        System.out.println("Sunday");
        default:
        System.out.println("Weekday");
        break;
        case 6:
        System.out.println("Saturday");
        
        }
    }
}
