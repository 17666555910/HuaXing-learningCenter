package com.huaxing.javabase.流程语句篇;

/**
 * @Auther: 华星详谈
 * @Description: 代码地址：https://github.com/17666555910/HuaXing-learningCenter
 * 代码路径：华星详谈学习中心 -> CodeFolder文件夹 -> Java基础 -> 流程语句篇
 */
public class InterviewQuestions3 {
    /**
     * 题目：要求使用嵌套循环输出三角形图案
     * *
     * **
     * ***
     * ****
     * *****
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                //输出到一行中
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
