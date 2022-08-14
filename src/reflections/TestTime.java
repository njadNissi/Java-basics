package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestTime {

    public static void testWithSimpleObjectCreation(){

        Person p = new Person();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            p.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Simple Object creation: " + (endTime - startTime) + " ms");
    }

    public static void testWithReflectionObjectCreation() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        Person p = new Person();
        Class c = p.getClass();
        Method getName = c.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(p, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Reflection Object creation: " + (endTime - startTime) + " ms");
    }

    public static void testWithReflectionObjectCreation2() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        Person p = new Person();
        Class c = p.getClass();
        Method getName = c.getDeclaredMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(p, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Reflection (inaccessible) Object creation: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        testWithSimpleObjectCreation();
        testWithReflectionObjectCreation();
        testWithReflectionObjectCreation2();

    }
}
