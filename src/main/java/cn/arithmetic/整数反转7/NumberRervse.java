package cn.arithmetic.整数反转7;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author sirius
 * @since 2018/12/21
 */
public class NumberRervse {

    /**
     * 暴力方法 放入数组 倒序输出
     * @param num
     */
    public static int reverse1(int num){
        String str = String.valueOf(num);
        String[] arr = str.split("");
        int length = arr.length;
        StringBuilder stringBuilder = new StringBuilder(length);
        for(int i = length - 1;i >= 0;i--){
            stringBuilder.append(arr[i]);
        }
        int reNum;
        try {
            if (arr[0].equals("-")){
                stringBuilder.deleteCharAt(stringBuilder.indexOf("-"));
                stringBuilder.insert(0,"-");
            }
            reNum = Integer.parseInt(stringBuilder.toString());
        }catch (Exception e){
            return 0;
        }
        return reNum;
    }

    /**
     * 利用stringBuilder的reverse
     * @param num
     * @return
     */
    public static int reverse2(int num){
        String str = String.valueOf(num);
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        stringBuilder.append(str);
        stringBuilder.reverse();
        if (str.contains("-")){
            stringBuilder.deleteCharAt(stringBuilder.indexOf("-"));
            stringBuilder.insert(0,"-");
        }
        int reNum;
        try {
            reNum = Integer.parseInt(stringBuilder.toString());
        }catch (Exception e){
            return 0;
        }
        return reNum;
    }

    /**
     * 数学方法 每次弹出最后一位 放到第一位（去余和除法）
     * @param num
     * @return
     */
    public static int reverse3(int num){
        //反转数
        int reNum = 0;
        while (num != 0) {
            //最后一位
            int right = num % 10;
            //原数
            num = num / 10;
            long temp = (long)10 * reNum;
            //int溢出 最后计算的时候如果超过了32位 那就只会取后32位的数据进行计算
            if (temp + right > Integer.MAX_VALUE || temp + right < Integer.MIN_VALUE){
                return 0;
            }
            reNum = 10 * reNum + right;
        }
        return reNum;
    }

    public static void main(String[] args) {
        Long before = System.currentTimeMillis();
        System.out.println(reverse3(1234567899));
        Long after = System.currentTimeMillis();
        System.out.println("cost：" + (after - before));
    }
}
