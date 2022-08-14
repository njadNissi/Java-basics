package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicObjectCreation {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {

        Class personClass = Class.forName("reflections.Person");

        /**No-Parameter Constructor*/
        Person person = (Person)personClass.newInstance();
         person.setName("Paul");
//         person.age = 20;
        System.out.println(person);

        /**Parametrized Constructor*/
        Constructor constructor = personClass.getDeclaredConstructor(String.class, int.class);
        Person c2 = (Person) constructor.newInstance("Maggie", 23);
        System.out.println(c2);

        /**Through reflection*/
        Person p3 = (Person) personClass.newInstance();
        Method setName = personClass.getDeclaredMethod("setName", String.class);
        setName.invoke(p3, "Sandy");
        System.out.println(p3);

        /**get field*/
        Person p4 = (Person) personClass.newInstance();
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);//because it's a private field
        name.set(p4, "Chris");
        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true);//because it's a private field
        age.set(p4, 29);
        System.out.println(p4);
    }


}

class User {

}