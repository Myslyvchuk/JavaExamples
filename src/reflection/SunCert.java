package reflection;
class  SunCert {
    private String x = "Outer";
    private static String OUTER_STATIC = "Outer Static";
    public  void returnSmthNonStatic(){
        System.out.println("Outer x is " + OUTER_STATIC);
    }
    public static void returnSmth(){
        System.out.println("Outer x is " + OUTER_STATIC);
    }
    //Local
    void doStuff() {
        class MyInner {
            @SuppressWarnings("unused")
            private String x = "Local";
            public void seeOuter() {
                System.out.println("Outer x is " + SunCert.this.x);
            } 
           
        } 
        MyInner mi = new MyInner(); 
        mi.seeOuter();
    } 
    //Inner
    class Inner {
        private String x = "Inner";
        public void seeInner(){
            System.out.println("Outer x is " + x);
        }
    }
    //Nested
    static class Nested{
        private String x = "Nested";
        private static String OUTER_STATIC = "Outer Static";
        public void seeNested(){
            System.out.println("Outer x is " + x);
        }
        public static void returnSmth(){
            System.out.println("Outer x is " + OUTER_STATIC);
        }
    }
    public static void main(String[] args){
        //Local
        SunCert m2 = new  SunCert();
        m2.doStuff();
        
        //Inner
        SunCert.Inner inner = m2.new Inner();
        inner.seeInner();
        
        //Nested
        SunCert.Nested nested = new SunCert.Nested();
        nested.seeNested();
        SunCert.Nested.returnSmth();
        SunCert sun = new SunCert(){
            public void returnSmthNonStatic(){
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
        
    }
    
} 
