package Exercise;

public class Exercise6 implements IExercise {
    public static void receiveData() {
        isPrimeNumber();
    }

    private static void isPrimeNumber() {
        boolean prime;

        for (int i = 2; i <= 100; i++) {
            prime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
