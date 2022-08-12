package Exercise;

import Statics.Features;

public class Exercise4 implements IExercise {
    private static float salary;
    private static float rent;
    private static final float DISCOUNT = 0.1f;

    public static void receiveData() {
        System.out.println("Enter the rent you pay");
        rent = Features.validateDataNumber(rent);

        System.out.println("Enter your actual salary");
        salary = Features.validateDataNumber(salary);

        System.out.println(discount(salary <= 350));
    }

    private static String discount(boolean salary) {
        if (!salary) return "Salary doesn't qualify for discount";

        float total = rent - (rent * DISCOUNT);

        return "Total discount is: $" + Features.dc.format(total);
    }
}
