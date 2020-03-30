package com.xatu.Test;

import java.util.ArrayList;

/**
 * @Auther WeiLGHui
 * @Date 2020-03-30 14:48
 */

/**
 * 问题:最小的k个树
 * 问题描述：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class testGetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if(k<= 0 || k > input.length)return arrayList;
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input .length; j++) {
                if(input[i] >input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
