package Grades;

	import java.util.Scanner;

	public class StudentGrades {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of subjects
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        // Array to store marks obtained in each subject
	        int[] marks = new int[numSubjects];
	        int totalMarks = 0;

	        // Input marks for each subject
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }

	        // Calculate average percentage
	        double averagePercentage = (double) totalMarks / numSubjects;

	        // Determine the grade based on average percentage
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B";
	        } else if (averagePercentage >= 60) {
	            grade = "C";
	        } else if (averagePercentage >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }

	        // Display the results
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage);
	        System.out.println("Grade: " + grade);
	        
	        // Close the scanner
	        scanner.close();
	    }
	}


