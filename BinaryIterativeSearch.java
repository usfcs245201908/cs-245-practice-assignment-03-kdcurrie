public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Binary iterative";
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0;
        int high = (arr.length - 1);
        while (low <= high) {
            int mid = ((low + high)/2);
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid]>target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
