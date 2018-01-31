package taller2;

public class Pepito {

    public static void main(String[] args) {
        int[] nums = {2, 4, 4};
        System.out.println(group(0, nums, 10));
    }

    public static boolean group(int start, int[] nums, int target) {
        return sumgroup(start, nums, target, 0);
    }

    public static boolean sumgroup(int start, int[] nums, int target, int count) {
        if (start <= nums.length - 1) {
            return sumgroup(start + 1, nums, target, count += nums[start]);
        }
        if (target == count) {
            return true;
        }
        return false;
    }
}
