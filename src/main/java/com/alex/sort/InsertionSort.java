package com.alex.sort;

/**
 * @Classname SelectionSort
 * @Description 插入排序
 * 1.保证0-0位置上有序
 * 2.保证0-1位置上有序
 * 3.以此类推，直到保证0-(n-1)位置上有序
 * @Date 2022/1/11 20:07
 * @Author Alex
 */
public class InsertionSort {
    public static void main(String[] args) {
        Integer[] a = {3,2,5,4,1};

        SortUtil.show(InsertionSort(a));
    }

    public static Comparable[] InsertionSort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            //比较
            for (int j = i; j > 0 && SortUtil.less(a[j],a[j-1]); j--) {
                SortUtil.exch(a,j,j-1);
            }
        }
        return a;
    }


}
