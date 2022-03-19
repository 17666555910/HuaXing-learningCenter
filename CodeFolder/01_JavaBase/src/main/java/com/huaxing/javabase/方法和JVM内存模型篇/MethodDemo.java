package com.huaxing.javabase.方法和JVM内存模型篇;

/**
 * @Auther: 华星详谈
 * @Date：2022/3/13 22:04
 * @Description: 代码地址：https://github.com/17666555910/HuaXing-learningCenter
 * 代码路径：华星详谈学习中心 -> CodeFolder文件夹 -> Java基础 -> 方法和JVM内存模型篇
 */
public class MethodDemo {
    //在同一个类中,分别定义求两个整数,小数之和的方法
    private int getSum(int a, int b) {
        return a + b;
    }

    private double getSum(double a, double b) {
        return a + b;
    }

    //同一个类中,定义分别打印String,int,double,boolean类型的方法
    private void printString(String s) {
        System.out.println("s = " + s);
    }

    private void printInt(int i) {
        System.out.println("i " + i);
    }

    private void printDouble(double d) {
        System.out.println("d = " + d);
    }

    private void printBoolean(boolean b) {
        System.out.println("b = " + b);
    }

    /**
     * 递归求斐波纳契数列，通项公式为：F（0）=0，F(1)=1，Fn=F(n-1) +F(n-2)（n>=3，n∈N*）
     *
     * @param n
     * @return
     */
    private int fn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fn(n - 1) + fn(n - 2);
        }
    }

    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        int fn = demo.fn(5);
        System.out.println("fn = " + fn);
    }
}
