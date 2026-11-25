public class Task4 {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        boolean hasDuplicates = false;
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("\nduplicate numbers: ");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.print("no duplicates found");
        }
        System.out.println();
    }
}
