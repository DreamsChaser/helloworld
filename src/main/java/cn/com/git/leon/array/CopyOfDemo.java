package cn.com.git.leon.array;

import java.util.Arrays;

/**
 * arrays.copyOf 和 system.copyOf
 * @author sirius
 * @since 2018/10/16
 */
public class CopyOfDemo {
    public static void main(String[] args) {
        int[] origin = {1,2,3,4,5};
        //1、arrays.copyOf
        int[] arr1 = Arrays.copyOf(origin,3);
        //2、system.arraycopy
        int[] arr2 = new int[]{0,0,0,0,0,0};
        System.arraycopy(origin,0,arr2,0,3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
