package Exercise;

import Statics.Features;

public class Exercise8 implements IExercise {
    private static float firstCoordinate;
    private static float secondCoordinate;

    public static void receiveData() {
        System.out.println("Enter the first coordinate");
        firstCoordinate = Features.validateDataNumber(firstCoordinate);

        System.out.println("Enter the second coordinate");
        secondCoordinate = Features.validateDataNumber(secondCoordinate);

        System.out.println(computeCoordinates(firstCoordinate, secondCoordinate));
    }

    private static String computeCoordinates(float fc, float sc) {
        if (fc < 0 && sc < 0) {
            return "The easting coordinate in the third quadrant";
        } else if (fc < 0 && sc > 0) {
            return "The easting coordinate in the first quadrant";
        } else if (fc > 0 && sc > 0) {
            return "The easting coordinate in the second quadrant";
        } else if (fc == 0 && sc == 0) {
            return "The coordinate is at the origin";
        }

        return "The easting coordinate in the fourth quadrant";
    }
}
