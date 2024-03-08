import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many subjects?? "); // to know how many subjects in total
        int n = sc.nextInt();
        int[] marks = new int[n]; // creates array for the marks of different subjects

        for (int i = 0; i < n; i++) { // loop to input the marks
            System.out.print("enter marks for subject " + (i + 1) + " :: ");
            marks[i] = sc.nextInt();
            if (marks[i] > 100) { // condition for marks to be entered should be less than 100
                System.out.println("invalid input!! maximum marks are 100!!");
                i = 0;
            }
        }
        int sum = 0; // variable 'sum' carries the grand total of marks in all subjects
        for (int i = 0; i < n; i++) {// loop to add on all marks in sum
            sum = sum + marks[i];
        }
        System.out.println("TOTAL SUM OF MARKS :: " + sum);
        double avg = sum / marks.length;// to calc avg percentage
        System.out.println("AVG %AGE :: " + avg);
        if (avg >= 90) { // grade calculation with conditional statements
            System.out.println("GRADE A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("GRADE B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("GRADE C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("GRADE D");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("GRADE E");
        } else {
            System.out.println("FAIL");
        }

    }
}
