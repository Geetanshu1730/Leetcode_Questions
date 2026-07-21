import java.util.*;

public class Question4 {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                arr.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Question4 obj = new Question4();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDuplicates(nums);

        System.out.println(result);
    }
}