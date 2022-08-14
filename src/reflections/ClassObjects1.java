package reflections;

public class ClassObjects1 {

    public static void main(String[] args) throws ClassNotFoundException {

        /**Get the type for a primary data type : int*/
        Class intClass = Integer.TYPE;
        System.out.println(intClass);

        Person person = new Student();
        System.out.println(person);

        /**Getting the Class object.*/
        /**First way:*/
        Class c1 = Class.forName("reflections.Student");
        System.out.println(c1.hashCode());

        /**Second way:*/
        Class c2 = person.getClass();
        System.out.println(c2.hashCode());

        /**Third way:*/
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        /**Get superclass*/
        Class superClass = c1.getSuperclass();
        System.out.println(superClass);
    }

}

class Student extends Person {
    public Student() {
        super.setName("student");
    }
}

class Teacher extends Person {
    public Teacher() {
        super.setName("teacher");
    }
}

class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}