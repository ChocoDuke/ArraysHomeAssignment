public class Task1 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int replacements = 0;
        System.out.print("rriginal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
                replacements++;
            }
        }
        System.out.print("modified: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nreplacements: " + replacements);
    }
}
