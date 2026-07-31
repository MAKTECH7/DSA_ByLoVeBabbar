public class Intersection {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 5, 6, 7, 8 };
        int i = 0;
        int j = 0;
        while (i < arr1.length && i < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}