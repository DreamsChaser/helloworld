package cn.arithmetic;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 快排就是填坑分区算法
 * 取出最左边的数据然后在右边找比取出来的数小的填左边的坑
 * 然后在左边找小的数填右边的然后剩下的两个区递归自身
 * @author sirius
 * @since 2018/8/30
 */
public class QuickSort {

    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr,int left,int right){
        if (left < right) {
            int i = left;
            int j = right;
            int middle = arr[i];
            while (i < j) {
                //从最左处取出第一条数据，从右遍历填到左边的坑
                while (i < j && arr[j] < middle) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                //从左边取数据填右边的坑
                while (i < j && arr[i] > middle) {
                    i++;
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            //填入中间数据
            arr[i] = middle;
            sort(arr,left,i-1);
            sort(arr,i+1,right);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,34,65,8,0,32};
        System.out.println(JSON.toJSONString(arr));
        sort(arr);
        System.out.println(JSON.toJSONString(arr));
    }
}
