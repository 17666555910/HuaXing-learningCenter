package com.huaxing.javabase.流程语句篇;

/**
 * @Auther: 华星详谈
 * @Date：2022/3/13 22:04
 * @Description: 代码地址：https://github.com/17666555910/HuaXing-learningCenter
 *               代码路径：华星详谈学习中心 -> CodeFolder文件夹 -> Java基础 -> 流程语句篇
 */
public class InterviewQuestions2 {
    /**
     * 题目：要求使用嵌套循环输出成以下矩形图案
     * *****
     * *****
     * *****
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String result = "";
            for (int j = 0; j < 5; j++) {
                result += "*";
            }
            System.out.println(result);
        }
    }
}
