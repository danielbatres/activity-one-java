package Exercise;

import Statics.Features;

public class Exercise7 implements IExercise {
    private static int num;

    public static void receiveData() {
        System.out.println("Enter your number");
        num = Features.validateIntDataNumber(num);

        boolean isOdd = num % 2 == 0;

        isOdd(isOdd);
    }

    private static void isOdd(boolean value) {
        if (!value) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
