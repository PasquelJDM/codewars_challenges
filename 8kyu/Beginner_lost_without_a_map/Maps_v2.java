import java.util.Arrays;

public class Maps_v2 {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }
}