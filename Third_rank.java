import java.util.Scanner;

public class Third_rank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 4 students:");
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int i=0; i<4; i++) {
            int marks = sc.nextInt();
            
            if(marks > first) {
                third = second;
                second = first;
                first = marks;
            } else if(marks > second) {
                third = second;
                second = marks;
            } else if(marks > third) {
                third = marks;
            }
        }
        
        System.out.println("Third ranker has marks: " + third);
    }
}