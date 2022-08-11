package Exercise;

import Statics.Features;

public class Exercise12 implements IExercise {
    private static float[] studentGrades;
    private static int numberStudents;

    public static void receiveData() {
        System.out.println("Enter the number of students");
        numberStudents = Features.validateIntDataNumber(numberStudents);

        saveData(numberStudents);
    }

    private static void saveData(int numberStudent) {
        studentGrades = new float[numberStudent];

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Enter the grade of the " + (i + 1) + "° student");
            studentGrades[i] = Features.validateDataNumber(studentGrades[i]);
        }

        average();
    }

    private static void average() {
        float preTotal = 0;

        for (float studentGrade : studentGrades) {
            if (studentGrade > 10) {
                System.out.println("Grades can't be higher than ten");
                System.exit(0);
            }

            preTotal += studentGrade;
        }

        float average = preTotal / studentGrades.length;

        System.out.println("The average of the students' grades is: " + Features.dc.format(average));
    }
}
