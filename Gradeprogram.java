import java.util.Scanner;

class Gradeprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double average = total / 3;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average < 90 && average >= 80) {
            grade = 'B';
        } else if (average < 80 && average >= 70) {
            grade = 'C';
        } else if (average < 70 && average >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
