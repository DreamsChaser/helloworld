package cn.arithmetic.两数之和;

import com.alibaba.fastjson.JSON;

/**
 * 暴力法 遍历两遍数组
 * @author sirius
 * @since 2018/12/7
 */
public class TwoNumSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        int[] result = twoNumSum.twoSum(new int[]{1,4,6,2,7,32,43,13},9);
        System.out.println(JSON.toJSONString(result));
    }
}
