package Statics;
import java.text.DecimalFormat;

public class Features {
    private static final String DECIMAL_PATTERN = "###,###.###";
    public static DecimalFormat dc = new DecimalFormat(DECIMAL_PATTERN);

    public static float validateDataNumber(float value) {
        try {
            value = SC.sc.nextFloat();
        } catch (Exception e) {
            System.out.println("A number was expected as an argument. Exception: " + e);
            System.exit(0);
        }

        return value;
    }
}
