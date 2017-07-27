package club.bestchu.cleancode;

import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
