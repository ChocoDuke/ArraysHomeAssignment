import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("enter index to remove:");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove < 0 || indexToRemove >= arr.length) {
            System.out.println("nivalid index");
        } else {
            int[] updated = new int[arr.length - 1];
            int newIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    updated[newIndex] = arr[i];
                    newIndex++;
                }
            }
            System.out.print("Updated:");
            for (int num : updated) {
                System.out.print(num + " ");
            } System.out.println();
        }
    }
}
