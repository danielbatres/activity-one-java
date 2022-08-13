package Exercise;

import Statics.Features;
import Statics.SC;

public class Exercise10 implements IExercise {
    private static Client client = new Client();
    private static float purchaseValue;
    private static final float DISCOUNT_FIVE = 0.05f;
    private static final float DISCOUNT_TEN = 0.1f;

    public static void receiveData() {
        System.out.println("Enter your name");
        String name = SC.sc.next();
        client.setName(name);

        System.out.println("Enter the value of your purchase");
        purchaseValue = Features.validateDataNumber(purchaseValue);

        purchase();
    }

    private static float appliedDiscount(float value) {
        if (value <= 75) return value;

        return (value > 75 && value < 150)
                ? discount(value, DISCOUNT_FIVE)
                : discount(value, DISCOUNT_TEN);
    }

    private static float discount(float value, float discount) {
        return value - (value * discount);
    }

    private static void purchase() {
        float discount = appliedDiscount(purchaseValue);

        printPurchase(client.getName(), purchaseValue, Features.dc.format(discount));
    }

    private static void printPurchase(String name, float value, String total) {
        System.out.println("Succesful purchase"
                + "\nName of the buyer: " + name
                + "\nInitial value: " + value
                + "\nTotal value: " + total);
    }
}
