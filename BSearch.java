public class BSearch {
    public static void main(String[] args) {
        BSearch solution = new BSearch();
        int[] nums = {2147483647, 5, 6, 0, 0, 2, 8};
        int target = 2;
        System.out.println(solution.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }

        return -1;
    }


    public int binarySearchQuick(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = (low +high)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }

        }
        return -1;
    }
}