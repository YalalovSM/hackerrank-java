import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigDecimalOperations {
    public void sortInDescendingOrderAndPrint(String[] s) {
        List<String> list = Arrays.asList(s);
        list.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return new BigDecimal(s1).compareTo(new BigDecimal(s2));
            }
        }.reversed());

        for (String b : list) {
            System.out.println(b);
        }
    }
}
