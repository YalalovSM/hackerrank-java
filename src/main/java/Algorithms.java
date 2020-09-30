public class Algorithms {
    void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.printf("pos=%.6f\n", pos * 1.0f / arr.length);
        System.out.printf("neg=%.6f\n", neg * 1.0f / arr.length);
        System.out.printf("zero=%.6f\n", zero * 1.0f / arr.length);
    }
}
