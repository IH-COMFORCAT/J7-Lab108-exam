import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 5, 7, 2, 5};
        int num = 53;

        int[] result = balancer(array, num);
        System.out.println(Arrays.toString(result));

        IntArrayList intArrayList = new IntArrayList();

        for (int i = 0; i < 11; i++) {
            intArrayList.add(i);
        }

        System.out.println(Arrays.toString(intArrayList.getNumbers()));

    }

    private static int[] balancer(int[] array, int num) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        while (sum < num) {
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    index = i;
                }
            }
            array[index]++;
            sum++;

        }

        return array;
    }


}