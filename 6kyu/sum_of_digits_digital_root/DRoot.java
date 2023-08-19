public class DRoot {
    public static int digital_root(int n) {
        if (n == 0)
            return n;

        String characters = Integer.toString(n);
        int length = characters.length(), amount = 0, pos;
        if (length == 1)
            return n;
        while (length > 1) {
            amount = 0;
            pos = 0;
            while (pos < length) {
                amount += characters.charAt(pos) - '0';
                pos++;
            }
            length = Integer.toString(amount).length();
            characters = Integer.toString(amount);
        }
        return amount;
    }
}