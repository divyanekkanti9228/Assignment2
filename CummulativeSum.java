import java.util.Arrays;

public class CummulativeSum {
    public static void main(String args[]) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        int Sum[] = new int[arr.length];

        Sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            Sum[i] = Sum[i - 1] + arr[i];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(cumSum));
    }
}

Task 2: Push the sum into the same array and print


import java.util.Arrays;

public class CummulativeSum {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(arr));
    }
}