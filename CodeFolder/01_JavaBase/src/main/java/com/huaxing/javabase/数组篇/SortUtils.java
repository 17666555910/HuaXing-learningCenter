package com.huaxing.javabase.数组篇;

/**
 * @description：07_星仔带你学Java之数组算法篇
 * @author: yaogx
 * @time: 2022/4/1 22:15
 */
public class SortUtils {

    /**
     * 冒泡算法
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     *
     * @param arr
     * @return
     */
    public static int[] electionSort(int[] arr) {
        int temp;
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 从arr数组中搜索key的元素,找到返回其索引,否则返回-1
     *
     * @param arr 排序后的数组
     * @param key 需要查询的元素
     * @return
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;//最小的索引
        int high = arr.length - 1;//最大的索 引
        while (low <= high) {
            int mid = (low + high) >> 1;//中间索引
            int midVal = arr[mid];//中间的元索,猜测的值
            if (midVal > key) {//猪大了
                high = mid - 1;
            } else if (midVal < key) {//猪小了
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 7, 0};
//        SortUtils.bubbleSort(arr);
        SortUtils.electionSort(arr);
        System.out.println(SortUtils.binarySearch(arr, 7));
    }
}
