package reflections;

public class StaticBlocks {

    static {
        System.out.println("StaticBlocks class is loaded though main()!");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        /**JRE Running steps: Loading -->  Linkage -->  Initialization
         * the loading process is made;
         * and static are made before object initialization.
         * Any operation on one of these classes will cause class loading.
         * */
         /**1*/ // new Son();
         /**2*/ // Class.forName("reflection.Son");
         /**3*/ //System.out.println(Son.age);
         /**3*/ Son[] sons = new Son[5];
         /**Final variables->(constant) can't cause class loading.*/
        System.out.println(Son.id);

    }

}

class Son extends Father {
    static {
        System.out.println("The child inherits from father!");
        age = 15;
    }
    static int age = 20;
    static final int id = 1234;
}

class Father extends GrandPa {
    static {
        System.out.println("The father inherits from GrandPa!");
    }
}

class GrandPa {
    static {
        System.out.println("GrandPa is initialized!!");
    }
}