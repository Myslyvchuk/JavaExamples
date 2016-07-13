package reflection;

import static java.lang.System.out;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ConstructorAccess {
    public static void main(String... args) {
        try {
            Class<?> c = Class.forName(args[0]);
            try {
                Constructor[] ctors = Singleton.class.getDeclaredConstructors();
                for (Constructor<?> ctor : ctors){
                    ctor.setAccessible(true);
                }
                Method[] methods = c.getDeclaredMethods();
                for(Method method: methods){
                    //method.setAccessible(true);
                    method.invoke(ctors[0].newInstance() );
                }
                Singleton o = (Singleton)ctors[0].newInstance();
               // o.print();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Constructor[] allConstructors = c.getDeclaredConstructors();
            for (Constructor ctor : allConstructors) {
                int searchMod = modifierFromString(args[1]);
                int mods = accessModifiers(ctor.getModifiers());
                if (searchMod == mods) {
                    out.format("%s%n", ctor.toGenericString());
                    out.format("  [ synthetic=%-5b var_args=%-5b ]%n", ctor.isSynthetic(), ctor.isVarArgs());
                }
            }

            // production code should handle this exception more gracefully
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }

    private static int accessModifiers(int m) {
        return m & (Modifier.PUBLIC | Modifier.PRIVATE | Modifier.PROTECTED);
    }

    private static int modifierFromString(String s) {
        if ("public".equals(s))
            return Modifier.PUBLIC;
        else if ("protected".equals(s))
            return Modifier.PROTECTED;
        else if ("private".equals(s))
            return Modifier.PRIVATE;
        else if ("package-private".equals(s))
            return 0;
        else
            return -1;
    }
}