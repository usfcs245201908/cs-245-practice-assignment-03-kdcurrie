public class BinaryRecursiveSearch implements Practice03Search {
    int low;
    int high;
    int mid;
    int flag = 0;
    @Override
    public String searchName() {
        return "Binary recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        if (flag == 0) {
            low = 0;
            high = (arr.length - 1);
            flag = 1;
        }
        if (low > high) {
            return -1;
        }
        mid = ((low + high) / 2);
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            high = mid - 1;
            return search(arr, target);
        }
        else {
            low = mid + 1;
            return search(arr, target);
        }
    }
}
