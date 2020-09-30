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

    public String minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                return "Too chaotic";
            }
            int start = q[i] - 2 > 0 ? q[i] - 2 : 0;
            for (int j = start; j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }

        return String.valueOf(bribes);
    }
}
