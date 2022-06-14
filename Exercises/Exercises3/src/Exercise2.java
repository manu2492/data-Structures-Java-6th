import java.util.Random;

public class Exercise2 {
    static int[] arr = {1, 2, 3, 4, 3, 4, 23, 4, 2, 5};
    //Define the randomRemove() method
    public static void randomRemove(int[] arr) {
        //Declare and initialize the variable
        boolean n = true;
        int val = 0;

        //Create an object for Random() class
        Random rValue = new Random();

        //Loop executes until true

        while(n) {

            /*Select the random number from length of array and assign into "val" variable. */
            val = rValue.nextInt(arr.length);

            //Initialize the index of array as "0"
            arr[val] = 0;

            //Loop executes until length of array
            for(int i = 0;i < arr.length; i++) {
                //Check whether "arr[i]" is not equal to "0'
                if(arr[i]!= 0) {
                    //Set the "n" as "true"
                    n = true;

                    //Exit the if statement
                    break;
                }

                //Otherwise set the "n" as "false"
                else {
                    n = false;
                }

            }

        }

    }

    public static void main(String[] args) {
        randomRemove(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
