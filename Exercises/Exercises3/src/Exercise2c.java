import java.util.Random;

public class Exercise2c {

    public static int[] deleteRandom (int[] arr) {
        boolean dowhile = true;
        Random sc = new Random();


        while (dowhile) {
            int count = 0;
            
            int index = sc.nextInt(arr.length);
            if (arr[index] != 0) {
                arr[index] = 0;
            }

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
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        deleteRandom(arr);
    }
    
}
