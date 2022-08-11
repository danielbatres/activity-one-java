package Exercise;

import Statics.Features;
import Statics.SC;

public class Exercise11 implements IExercise {
    private static float hours;

    public static void receiveData() {
        System.out.println("Enter the hours you worked this week");
        hours = Features.validateDataNumber(hours);

        System.out.println("Enter the class you belong to. \n"
                + "[A] Class A \n"
                + "[B] Class B \n"
                + "[C] Class C \n"
                + "[D] Class D \n");

        String workerClass = SC.sc.next().toUpperCase();

        selectClass(hours, workerClass);
    }

    private static void selectClass(float hours, String workerClass) {
        switch (workerClass) {
            case "A":
                salary(hours, WorkerClasses.getCLASSA());
                break;
            case "B":
                salary(hours, WorkerClasses.getCLASSB());
                break;
            case "C":
                salary(hours, WorkerClasses.getCLASSC());
                break;
            case "D":
                salary(hours, WorkerClasses.getCLASSD());
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private static void salary(float hours, float workerClass) {
        float totalSalary = hours * workerClass;

        System.out.println("Your salary is: " + Features.dc.format(totalSalary));
    }
}
