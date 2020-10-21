import java.util.Arrays;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left = left_bound(nums, target);
        int right = right_bound(nums, target);
        if(left==-1)
        {
            return new int[]{-1,-1};
        }

        return new int[]{left, right};
    }

    public int left_bound(int[] nums, int target) {
        if(nums.length==0)
        {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target)
            {
                left = mid + 1;
            }else if(nums[mid] > target)
            {
                right = mid - 1;
            }else if(nums[mid]==target)
            {
                right = mid - 1;
            }

        }

        if(left >= nums.length || nums[left]!=target)
        {
            return -1;
        }

        return left;
    }

    public int right_bound(int[] nums, int target) {
        if(nums.length==0)
        {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target)
            {
                left = mid + 1;
            }else if(nums[mid] > target)
            {
                right = mid - 1;
            }else if(nums[mid]==target)
            {
                left = mid + 1;
            }

        }

        if(right < 0 || nums[right]!=target)
        {
            return -1;
        }

        return right;
    }
}


public class FindFirstandLasPositionofElementinSortedArray34 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int[] ints = solution34.searchRange(new int[]{1}, 0);
        System.out.println(Arrays.toString(ints));
    }

}
