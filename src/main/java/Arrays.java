public class Arrays {
    public int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];

        int start = d;
        if (d > a.length) {
            start = d % a.length;
        }

        int len = a.length - start;

        for (int i = 0; i < len; i++) {
            result[i] = a[start + i];
        }

        for (int i = 0; i < start; i++) {
            result[len + i] = a[i];
        }

        return result;
    }
}
