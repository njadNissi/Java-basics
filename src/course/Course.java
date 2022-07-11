package course;

public class Course {
    
    private String courseName;
    private String[] students;
    private int numOfStudents;
    private int defaultSize = 3;
    
    public Course(String courseName){
        students = new String[defaultSize];
        this.courseName = courseName;
        this.numOfStudents = 0;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void addStudent(String studentName){
        String[] tempStudents = null;
        if(this.numOfStudents == this.students.length){
            tempStudents = new String[2*(students.length)];
            for (int i = 0; i < students.length; i++) {
                tempStudents[i] = students[i]; 
            }
             this.students = tempStudents;  //the old array becomes the new Array
        }
        this.students[numOfStudents] = studentName;
        this.numOfStudents++;
    }
    
    public void dropStudent(String studentName){
        for (int i = 0; i < students.length; i++) {
                if(students[i].equalsIgnoreCase(studentName)){         
                    while(i < students.length){
                        students[i] = students[++i];
                        i++;
                    }
                    this.numOfStudents--;
                    students[students.length-1] = "";
                    break;
                }
        }
    }
    
    public String[] getStudents(){
        return this.students;
    }
    
    public int getNunStudents(){
        return this.numOfStudents;
    }
    
    public void clearStudents(){
        students = new String[defaultSize];
        this.numOfStudents = 0;
    }
}