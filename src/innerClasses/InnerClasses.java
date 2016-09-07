package innerClasses;

import inheritance.Animal;

class InnerClasses extends Animal implements AnonymousInterface {
    private String x = "Outer";
    private static String OUTER_STATIC = "Outer Static";

    private void returnSmthNonStatic() {
        System.out.println("Outer x is " + OUTER_STATIC);
    }

    public static void returnSmth() {
        System.out.println("Outer x is " + OUTER_STATIC);
    }

    // Local
    void doStuff() {
        class MyInner {  // NO STATIC methods no static fields
            @SuppressWarnings("unused")
            private String x = "Local";
            public void seeOuter() {
                System.out.println("Outer x is " + InnerClasses.this.x + OUTER_STATIC);
                returnSmth();
                returnSmthNonStatic();
            }
            // static void go(){ }  
            
        }
        MyInner mi = new MyInner();
        mi.seeOuter();
    }

    // Inner
    class Inner { // NO STATIC methods and No static field inside
        private String x = "Inner";

        public void seeInner() {
            System.out.println("Outer x is " + x);
        }
        
        //static void go(){ }  
    }

    // Nested
    static class Nested { //all static
        private String x = "Nested";

        public void seeNested() {
            System.out.println("Outer x is " + x);
        }

        public static void returnSmth() {
            System.out.println("Outer x is " + OUTER_STATIC);
        }
    }
    //Anonymous
    AnonymousInterface anonimous = new AnonymousInterface(){ // no static inside, could reach static outer
        String a = OUTER_STATIC;
    };

    public static void main(String[] args) {
        // Local
        InnerClasses m2 = new InnerClasses();
        m2.doStuff();

        // Inner
        InnerClasses.Inner inner = m2.new Inner();
        inner.seeInner();

        // Nested
        InnerClasses.Nested nested = new InnerClasses.Nested();
        nested.seeNested();
        InnerClasses.Nested.returnSmth();
        //Anonymous
        InnerClasses sun = new InnerClasses() {
            public void returnSmthNonStatic() {
                System.out.println("Anon x is " + OUTER_STATIC);
            }
        };
        sun.returnSmthNonStatic();
        boolean a = false;
        System.out.println(int[][][].class);
        System.out.println(a);
        System.out.println(a = a | true);
        System.out.println(a);
        System.out.println(0x0 | 0x00000010);
        Animal animal = new Animal();
        System.out.println(animal.animalInt);
    
    }

}
