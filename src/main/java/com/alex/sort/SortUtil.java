package com.alex.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Classname SortUtil
 * @Description 排序通用工具
 * @Date 2022/1/30 19:40
 * @Author Alex
 */
public class SortUtil {

    /**
     * 判断v是否小于w
     * @param a
     * @param b
     * @return
     */
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0;
    }

    /**
     * 交换两个数
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

    /**
     * 打印数组
     * @param a
     */
    public static void show(Comparable[] a){
        for (Comparable comparable : a) {
            System.out.println(comparable);
        }
    }

    /**
     * 排序
     * @param a
     */
    public static Comparable[] sort(Comparable[] a){
        Arrays.sort(a);
        return a;
    }

    /**
     * 判断数组是否相等
     * @param a
     * @param b
     */
    public static boolean equals(Comparable[] a,Comparable[] b){
        return Arrays.equals(a,b);
    }

    /**
     * 生成长度固定的随机数组
     * @param size
     * @param maxValue
     * @return
     */
    public static Comparable[] generateArray(int size,int maxValue){
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * maxValue);
        }

        return array;
    }

    /**
     * 生成长度随机的随机数组
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static Comparable[] generateRandomArray(int maxSize,int maxValue){
        Integer[] array = new  Integer[(int)((maxSize + 1) * Math.random())];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((maxValue + 1) * Math.random())-(int) (maxValue * Math.random());
        }

        return array;
    }
}
