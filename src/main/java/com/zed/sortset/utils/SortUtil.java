package com.zed.sortset.utils;

/**
 * @author Zed
 * @date 2020/3/4 下午6:32
 * @contact shadowl91@163.com
 */
public class SortUtil {

    /**
     * bubble sort
     * @param a
     */
    public void BubbleSort(int[] a) {
        int temp = 0;
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (a[j-1] > a[j]) {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * add flag if flag does not change represents sort is finished
     * @param a
     */

    public void BubbleSortFlag(int[] a) {
        int temp = 0;
        int length = a.length;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < length; i++) {
                for (int j = 1; j < length; j++) {
                    if (a[j-1] > a[j]) {
                        temp = a[j-1];
                        a[j-1] = a[j];
                        a[j] = temp;
                        flag = true;
                    }
                }
            }
        }
    }


}
