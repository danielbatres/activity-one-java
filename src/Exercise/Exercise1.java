package Exercise;
import Statics.Features;

public class Exercise1 implements IExercise {
    private static float num1;
    private static float num2;

    public static void receiveData() {
        System.out.println("Enter the first number");
        num1 = Features.validateDataNumber(num1);

        System.out.println("Enter the second number");
        num2 = Features.validateDataNumber(num2);

        boolean result = num1 == num2;

        if (!result) {
            product(num1, num2);
        } else {
            System.out.println("The numbers are the same");
        }
    }

    // Numbers product is multiplication of the same numbers.

    private static void product(float num1, float num2) {
        float product = num1 * num2;

        System.out.println("The product of both numbers is: " + Features.dc.format(product));
    }
}
