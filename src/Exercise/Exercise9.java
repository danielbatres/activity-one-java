package Exercise;

import Statics.Features;

public class Exercise9 implements IExercise {
    private static int age;
    private static float ticket;
    private static final float DISCOUNT = 0.5f;

    public static void receiveData() {
        System.out.println("Enter your ticket value");
        ticket = Features.validateDataNumber(ticket);

        System.out.println("Enter your age");
        age = Features.validateIntDataNumber(age);

        discountApplied(ticket, age < 18 || age > 60);
    }

    private static void discountApplied(float ticket, boolean value) {
        if (!value) {
            System.out.println("Discount is not applied, ticket value: " + ticket);
        } else {
            discount(ticket);
        }
    }

    private static void discount(float ticket) {
        float totalDiscount = ticket - (ticket * DISCOUNT);

        System.out.println("¡¡Discount applied!!, total discount is: " + totalDiscount);
    }
}
