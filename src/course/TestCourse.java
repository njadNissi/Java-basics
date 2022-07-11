package course;

public class TestCourse {
    
    public static void main(String[] args) {
        
        Course c = new Course("JAVA PROGRAMMING");
        
        c.addStudent("梅宇");
        c.addStudent("安杰");
        c.addStudent("李想");
        c.dropStudent("安杰");
//        c.clearStudents();
        c.addStudent("梅宇");
        c.addStudent("安杰");
//        c.addStudent("李想");
        System.out.println(c.getCourseName()+" Students \n==========================");
        for (int i = 0; i < c.getNunStudents(); i++) {
            System.out.println(c.getStudents()[i]);
        }
        
    }
    
}
