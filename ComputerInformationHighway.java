
import java.util.Scanner;

public class ComputerInformationHighway {

    public static void main(String[] args) {
        
        calcGPA(getClasses());
    }
    
    public static void calcGPA(char grades[]) {
        
        //(sum of all)/(total number)
        double total = 0;
        
        for(int x = 0; x < grades.length; x++) {
            
            switch(grades[x]) {
                case 'A':
                    total += 4;
                    break;
                    
                case 'B':
                    total += 3;
                    break;
                    
                case 'C':
                    total += 2;
                    break;
                
                case 'D':
                    total += 1;
                    break;
                    
                case 'F':
                    total += 0;
                    break;

                default:
                    break;
                        
            }
        }
        System.out.println("Your GPA is: " + total/grades.length);
    }
    
    public static char[] getClasses() {
        
        Scanner in = new Scanner(System.in);
        int classCount;
        char grades[];
        
        
        System.out.println("How many classes are we averaging?");
        classCount = in.nextInt();
        grades = new char[classCount];
        
        System.out.println("What grade do you have in your classes? A-F Scale.");
        
        for(int x = 0; x < classCount; x++) {
            grades[x] = in.next().toUpperCase().charAt(0);
            System.out.println("Variable stored is " + grades[x]);
        }
        
        in.close();
        
        return grades;
    }
    
}
