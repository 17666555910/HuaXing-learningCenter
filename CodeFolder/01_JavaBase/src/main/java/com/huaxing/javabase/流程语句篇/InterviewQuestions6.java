package com.huaxing.javabase.流程语句篇;

/**
 * @Auther: 华星详谈
 * @Description: 代码地址：https://github.com/17666555910/HuaXing-learningCenter
 * 代码路径：华星详谈学习中心 -> CodeFolder文件夹 -> Java基础 -> 流程语句篇
 */
public class InterviewQuestions6 {
    /**
     * 题目：输出100~200之间不能够被3整除的数
     */
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
