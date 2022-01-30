package com.alex.sort;

/**
 * @Classname SortUtil
 * @Description 排序通用工具
 * @Date 2022/1/30 19:40
 * @Author Alex
 */
public class SortUtil {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

    public static void show(Comparable[] a){
        for (Comparable comparable : a) {
            System.out.println(comparable);
        }
    }
}
