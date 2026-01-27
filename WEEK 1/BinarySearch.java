class Function {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}

class BinarySearch {
    public static void main(String[] args) {
        Function function = new Function();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = function.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
    }
}