package works;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class task2 {
    private static final Logger LOGGER = Logger.getLogger(task2 .class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("task2 .log");
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.INFO);

        int[] arr = new int[]{2, 5, 63, 23, 12, 2, 44, 66, 21, 7, 65};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            LOGGER.log(Level.INFO, "Iteration {0}: {1}", new Object[]{i+1, Arrays.toString(arr)});
        }
        System.out.println(Arrays.toString(arr));
    }
}

