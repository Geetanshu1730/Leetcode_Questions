import java.util.*;

public class Question3 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Question3 obj = new Question3();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDisappearedNumbers(nums);

        System.out.println(result);
    }
}