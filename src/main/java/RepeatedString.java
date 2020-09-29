public class RepeatedString {
    public long test(String s, long n) {
        long l = s.replaceAll("[^a]", "").length() * (n / s.length());
        int mod = (int) n % s.length();
        if (mod > 0) {
            l += s.substring(0, mod).replaceAll("[^a]", "").length();
        }

        return l;
    }
}
