import javax.swing.JOptionPane;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        boolean continueChecking = true;
        
        while (continueChecking) {
            // Input: Take marks obtained (out of 100) in each subject
            int numOfSubjects = 5; // Assuming 5 subjects for simplicity
            int totalMarks = 0;
            boolean validMarks = true;

            for (int i = 1; i <= numOfSubjects; i++) {
                String input = JOptionPane.showInputDialog(null, "Enter marks obtained in Subject " + i + ":");
                try {
                    int marks = Integer.parseInt(input);
                    if (marks < 0 || marks > 100) {
                        validMarks = false;
                        JOptionPane.showMessageDialog(null, "Please enter valid marks (0 - 100) for Subject " + i);
                        break;
                    } else if (marks < 30) {
                        validMarks = false;
                        JOptionPane.showMessageDialog(null, "Student has failed in this class, please try again!");
                        break;
                    }
                    totalMarks += marks;
                } catch (NumberFormatException e) {
                    validMarks = false;
                    JOptionPane.showMessageDialog(null, "Please enter numerical marks for Subject " + i);
                    break;
                }
            }

            if (validMarks) {
                // Calculate Total Marks
                // Calculate Average Percentage
                double averagePercentage = (double) totalMarks / numOfSubjects;

                // Grade Calculation: Assign grades based on the average percentage achieved
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

                // Display Results: Show the total marks, average percentage, and the corresponding grade
                String output = "Total Marks: " + totalMarks
                        + "\nAverage Percentage: " + averagePercentage + "%"
                        + "\nGrade: " + grade;
                JOptionPane.showMessageDialog(null, output);
            }
            
            // Ask user if they want to continue checking grades for another student
            int option = JOptionPane.showConfirmDialog(null, "Do you want to check grades for another student?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION) {
                continueChecking = false;
            }
        }
    }
}import javax.swing.JOptionPane;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        boolean continueChecking = true;
        
        while (continueChecking) {
            // Input: Take marks obtained (out of 100) in each subject
            int numOfSubjects = 5; // Assuming 5 subjects for simplicity
            int totalMarks = 0;
            boolean validMarks = true;

            for (int i = 1; i <= numOfSubjects; i++) {
                String input = JOptionPane.showInputDialog(null, "Enter marks obtained in Subject " + i + ":");
                try {
                    int marks = Integer.parseInt(input);
                    if (marks < 0 || marks > 100) {
                        validMarks = false;
                        JOptionPane.showMessageDialog(null, "Please enter valid marks (0 - 100) for Subject " + i);
                        break;
                    } else if (marks < 30) {
                        validMarks = false;
                        JOptionPane.showMessageDialog(null, "Student has failed in this class, please try again!");
                        break;
                    }
                    totalMarks += marks;
                } catch (NumberFormatException e) {
                    validMarks = false;
                    JOptionPane.showMessageDialog(null, "Please enter numerical marks for Subject " + i);
                    break;
                }
            }

            if (validMarks) {
                // Calculate Total Marks
                // Calculate Average Percentage
                double averagePercentage = (double) totalMarks / numOfSubjects;

                // Grade Calculation: Assign grades based on the average percentage achieved
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

                // Display Results: Show the total marks, average percentage, and the corresponding grade
                String output = "Total Marks: " + totalMarks
                        + "\nAverage Percentage: " + averagePercentage + "%"
                        + "\nGrade: " + grade;
                JOptionPane.showMessageDialog(null, output);
            }
            
            // Ask user if they want to continue checking grades for another student
            int option = JOptionPane.showConfirmDialog(null, "Do you want to check grades for another student?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.NO_OPTION) {
                continueChecking = false;
            }
        }
    }
}
