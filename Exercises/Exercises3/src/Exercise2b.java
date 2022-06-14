import java.util.Random;

public class Exercise2b {
    public static void removeRandom (int[] arr) {

        Random value = new Random();
        boolean dowhile = true;
        

        while (dowhile) {
            int index = value.nextInt(arr.length);
            arr[index] = 0;
            int count = 0;
            

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    break;
                }
                else {
                    count += 1;
                }
            }
            if (count == arr.length) {
                dowhile = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        removeRandom(arr);
    }
}
