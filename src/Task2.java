public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 30, 15, 30 };
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int largest = arr[0];
        int secondLargest = arr[0];
        boolean hasSecond = false;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                hasSecond = true;
            } else if (num != largest && (!hasSecond || num > secondLargest)) {
                secondLargest = num;
                hasSecond = true;
            }
        }
        if (!hasSecond) {
            System.out.println("no second largest distinct number");
        } else {
            System.out.println("largest:" + largest);
            System.out.println("second largest: " + secondLargest);
        }
    }
}