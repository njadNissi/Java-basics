package Algo;

public class SchoolLocker {
    
    static void Unlock(int student, boolean[] lockers){
    student = 1;
        while(student <= 100){
        for (int j = student-1; j < lockers.length; j++) {
                if(lockers[j] == true)  
                  lockers[j] = false;
                else lockers[j] = true;        

            j += student -1;
        }
    student++;
}
    }
    
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        int student = 0;
        
        System.out.println("initial state: ");
        for (int i = 0; i < lockers.length; i++){
            lockers[i] = false; /*System.out.println("locker "+(i+1)+" open?: "+lockers[i]);*/}
            
        //start process
            Unlock(student, lockers);            
        
         System.out.println("final state: ");
        for (int i = 0; i < lockers.length; i++){
            if(lockers[i])
            System.out.println("locker "+(i+1)+" open?: "+lockers[i]);}
        
    }
}
