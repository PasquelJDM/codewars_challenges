class Kata {
    public static String numberToString(int num) {
        /*
         * String.valueOf(num) is valid too but has an extra call
         * because uses the Integer.toString method
         */
        return Integer.toString(num);
    }
}