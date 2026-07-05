import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int smallIndex = 0, largeIndex = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < smallest) {
                smallest = arr[i];
                smallIndex = i;
            }

            if (arr[i] > largest) {
                largest = arr[i];
                largeIndex = i;
            }
        }

        
        int temp = arr[smallIndex];
        arr[smallIndex] = arr[largeIndex];
        arr[largeIndex] = temp;

        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
