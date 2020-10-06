import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BigDecimalOperations {
    public void sortInDescendingOrderAndPrint(String[] s) {
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null || s2 == null)
                    return 0;

                BigDecimal d1 = new BigDecimal(s1);
                BigDecimal d2 = new BigDecimal(s2);

                return d1.compareTo(d2);
            }
        }));

        for (String str : s) {
            System.out.println(str);
        }
    }
}
