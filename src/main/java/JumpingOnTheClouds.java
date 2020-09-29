public class JumpingOnTheClouds {
    public int test(int[] c) {
        int count = 0;
        int i = 0;
        while (i < c.length - 1) {
            count++;
            if (i + 2 < c.length && c[i + 2] != 1) {
                i += 2;
            } else {
                i++;
            }
        }

        return count;
    }
}
