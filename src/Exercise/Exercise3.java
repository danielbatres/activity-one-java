package Exercise;

import Statics.Features;

public class Exercise3 {
    private static float legA;
    private static float legB;

    public static void receiveData() {
        System.out.println("Enter the value of the leg A: ");
        legA = Features.validateDataNumber(legA);

        System.out.println("Enter the value of the leg B: ");
        legB = Features.validateDataNumber(legB);

        hypotenuse(legA, legB);
    }

    private static void hypotenuse(float legA, float legB) {
        legA = (float) Math.pow(legA, 2);
        legB = (float) Math.pow(legB, 2);

        float hypotenuse = (float) Math.sqrt(legA + legB);
        System.out.println("The value of the hypotenuse is: " + Features.dc.format(hypotenuse));
    }
}
