package com.huaxing.javabase.finals;

/**
 * @description：数组单例模式
 * @author: yaogx
 * @time: 2022/6/22 20:02
 */
public class ArrayUtil {
    /**
     * step 1 创建一个实例
     */
    private static final ArrayUtil arrayUtil = new ArrayUtil();

    /**
     * step 2 私有化构造器
     */
    private ArrayUtil() {
    }

    /**
     * step 3 暴露一个公共方法获取该类的唯一实例
     * @return
     */
    public static ArrayUtil getInstance() {
        return arrayUtil;
    }
}
