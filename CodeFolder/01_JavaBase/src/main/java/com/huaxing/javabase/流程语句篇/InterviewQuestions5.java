package com.huaxing.javabase.流程语句篇;

/**
 * @Auther: 华星详谈
 * @Description: 代码地址：https://github.com/17666555910/HuaXing-learningCenter
 * 代码路径：华星详谈学习中心 -> CodeFolder文件夹 -> Java基础 -> 流程语句篇
 */
public class InterviewQuestions5 {
    /**
     * 题目：求出100以内前5个3的倍数的数字
     */
    public static void main(String[] args) {
        int index = 0;
        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                index++;
            }
            if (index == 5) {
                break;
            }
        }
    }
}
