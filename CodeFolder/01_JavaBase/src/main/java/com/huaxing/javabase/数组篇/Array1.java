package com.huaxing.javabase.数组篇;

import java.util.Arrays;

/**
 * @Auther: yaogx
 * @Date：2022/3/19 23:07
 * @Description: 星仔带你学Java之数组篇（一）
 */
public class Array1 {


    /**
     * 求数组最大值
     *
     * @param nums
     * @return
     */
    public static int getMax(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (result < num) {
                result = num;
            }
        }
        return result;
    }

    /**
     * 求数据最小值
     *
     * @param nums
     * @return
     */
    public static int getMin(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i == 0) {
                result = num;
            }
            if (result > num) {
                result = num;
            }
        }
        return result;
    }

    /**
     * 逆转数组
     */
    public static String[] reversedOrder(String[] nums) {
        String[] result = new String[nums.length];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[index] = nums[i];
            index++;
        }
        return result;
    }

    /**
     * 获取数组中指定元素第一次出现的索引
     *
     * @param nums
     * @param element
     * @return
     */
    public static int indexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取数组中指定元素最后一次出现的索引
     *
     * @param nums
     * @param element
     * @return
     */
    public static int lastIndexOf(int[] nums, int element) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (element == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50, -30, 10};
        
        System.out.println("indexOf: " + Array1.indexOf(arr, 10));
        System.out.println("lastIndexOf: " + Array1.lastIndexOf(arr, 10));
    }
}
