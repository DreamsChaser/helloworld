package cn.arithmetic.两数之和;


import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * 两遍hashmap
 * @author sirius
 * @since 2018/12/7
 */
public class TwoNumSum2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i<nums.length;i++){
            if (map.containsKey(target - nums[i])&& nums[i] != target - nums[i]){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = new TwoNumSum2().twoSum(new int[]{2,3,5,7,9,11,43,23,15},26);
        System.out.println(JSON.toJSONString(result));
    }
}
