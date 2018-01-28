package com.sust.java.chapter3.demo;

/**
 * 演示多维数组
 */
public class SimpleDemo18 {

    public static void main(String[] args) {
        int[][] arr; //定义一个二维数组
        arr = new int[3][]; //把arr当成一维数组初始化，arr的长度是3，arr的数组元素又是引用

        //把arr当成一维数组遍历
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); //arr[i]=null;
        }

        //初始化arr的每一个元素
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[3];

        //给arr数组的第三个元素指向的数组赋值
        arr[2][0] = 1;
        arr[2][1] = 2;
        arr[2][2] = 3;

        //遍历二维数组中的每一个值
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
