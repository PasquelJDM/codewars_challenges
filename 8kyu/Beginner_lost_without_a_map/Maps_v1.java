public class Maps_v1 {
    public static int[] map(int[] arr) {
        int counter = 0;
        for (int element : arr) {
            arr[counter] *= 2;
            counter++;
        }
        return arr;
    }
}