package Exercise;

import Statics.Features;

public class Exercise2 {
    private static float base;
    private static float height;

    public static void receiveData() {
        System.out.println("Enter the base of your triangle");
        base = Features.validateDataNumber(base);

        System.out.println("Enter the height of your triangle");
        height = Features.validateDataNumber(height);

        rectangleArea(base, height);
    }

    private static void rectangleArea(float base, float height) {
        float area = base * height;

        System.out.println("The area of your rectangle is: " + Features.dc.format(area));
    }
}
