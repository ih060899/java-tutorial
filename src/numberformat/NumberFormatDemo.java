package numberformat;
import java.text.NumberFormat;
public class NumberFormatDemo {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getCurrencyInstance().format(12343545.54565));
        System.out.println(NumberFormat.getPercentInstance().format(0.4));
    }
}

