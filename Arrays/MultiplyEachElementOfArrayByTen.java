// package Arrays;

public class MultiplyEachElementOfArrayByTen {

    static int[] MultiplyByTen(int[] arr, int n) {
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) { // traverse kiya
            int CurrentElement = arr[i]; // fr current element ko hold kiya ek variable me
            int newElement = CurrentElement * 10; // fr uss element ko 10 se multiply kiya aur new variable me store
                                                  // kiya
            newArr[i] = newElement; // fr uss variable se uss element ko new array me store krwaado current index se
        }
        return newArr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int[] multiplied = MultiplyByTen(arr, n);
        for (int elements : multiplied) {
            System.out.print(elements + " ");
        }
    }
}
