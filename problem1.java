//Time complexity is O(n) and SC is O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }
        for (int num = 1; num <= nums.length; num++) {
            if (nums[num - 1] > 0)
                res.add(num);
        }

        return res;
    }
}