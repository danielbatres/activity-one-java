package Exercise;

import Statics.Features;

public class Exercise5 implements IExercise {
    private static int num;

    public static void receiveData() {
        System.out.println("Enter the integer number");
        num = Features.validateIntDataNumber(num);

        factorial(num);
    }

    private static void factorial(int num) {
        int factorial = 1;

        for (int i = num; i != 0; i--) factorial *= i;

        System.out.println("The factorial is: " + factorial);
    }
}
