import java.util.Scanner;

public class Main{
    public static int majority(int[] arr, int n){
        int maxCount = 0;
        int majorityElement = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majorityElement = arr[i];
            }
        }
        if (majorityElement >= 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Majority element is: " + majority(arr, n));
    }
}
