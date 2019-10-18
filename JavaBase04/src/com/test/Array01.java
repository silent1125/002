package com.test;

import java.util.Random;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		//  数组的第一种创建方式，静态创建
		/*int[] b = {7,8};
		b[0] = 9;
		int[] b1 = {2};//声明的字节数为0，数组是空
		//b1[0] = 90;//下标越界  错误！！！
		
		// 第二种创建方式 动态创建
		//此时 数组中的10个元素值 默认为0
		int[] array = new int[10];
		array[0]=1;
		//string 数组中默认是null
		String[] names = new String[32];
		
		
		// 下标：快速准确找到数组中的某一元素
		// 下标值从0开始，最大是数组个数-1
		array[0] = 89;
		array[1] = 89;
		array[2] = 89;
		//...
		array[9] = 89;
		// 数组和for循环搭配使用！
		Random random = new Random();
		// length 计算数组长度
		for (int i = 0; i < 10; i++) {
		array[i] = random.nextInt(41)+20;	
		}
		// 注意：不要直接输出数组！===默认是输出数组在内存中的地址！！！
		// 数组也不可以参与运算！！但是数组中的元素可以
		//------------------
		//数组练习
		/*1.定义整型数组，长度为10，取值范围[20,70]。
		  获取最大值和最小值的下标
		  */
		/*int max = 0,min = 71,max_index = 0,min_index=0;
		int[] array1 = new int[10];
		for (int i = 0; i < 10; i++) {
			array1[i] = random.nextInt(51)+20;
			System.out.print(array1[i] + " ");
			if (array1[i]<min) {
				min=array1[i];
				min_index = i;
			}
			if (array1[i]>max) {
				max = array1[i];
				max_index = i;
			}
		}System.out.println();
		System.out.println("最大值下标:" + max_index);
		 System.out.println("最小值下标:" + min_index);
		
		  
		/*  2.定义两个整型数组，长度都为5，取值范围[20,60]
		  把这两个数组拼接成一个长度为10的数组！
		*
		*/
	/*	int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[10];
		for (int i = 0; i < 5; i++) {
			arr1[i] = random.nextInt(41)+20;
			arr2[i] = random.nextInt(41)+20;
			arr3[i] = arr1[i];
			arr3[i+5] = arr2[i];
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		//练习3：输入年月日 计算此日期本年第几天
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt(); 
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		System.out.println("请输入日期：");
		int day = scanner.nextInt();
		int sum = day;
		int[] months = {31, 28, 31, 30, 31, 30, 31,
				31, 30, 31, 30, 31};
		if (year % 4 ==0 && year % 100 != 0 || year % 400==0) {
			months[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {
			sum += months[i];
		}
		System.out.println(sum);
		
		// 练习4：定义数组，长度为10，取值[30,80]将数组中元素对调！
		int[] array4 = new int [10];
			for (int i = 0; i < array4.length; i++) {
				array4[i] = random.nextInt(51) + 30;
				System.out.print(array4[i] + " ");
			}
		for (int i = 0; i < array4.length/2; i++) {
			int temp = array4[i];
			array4[i] = array4[9 - i];
			array4[9 - i] = temp;
			
		}
		System.out.println();
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		int[] arr = {52, 32, 6, 18, 15, 22};
		// 外层负责比较的趟数
		for (int i = 0; i < arr.length - 1; i++) {
			// 内层负责每一趟比较的次数
			// 注意，内层-1必须要减，避免下标越界
			for (int j = 0; j < 6 - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= t;
				}
			}
		}
			System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
		//----------------
		//1  7个元素，6+1 6个红球[1--33]  一个蓝球 [1--16]
		//2   保证6个红球 数值不重复
		//3  6红球升序+1蓝球
		//4  用户输入要购买的注数
		Random random = new Random();
		int t = 0;
		int[] red = new int [6];
		for (int i = 0; i < red.length; i++) {
			red[i]= random.nextInt(32)+1;
				for (int j = i; j < red.length-1; j++) {
					if (red[i]==red[j+1]) {
						  i--;
				}
			}
				
				for (int j = i; j < red.length-1; j++) {
					if (red[j+1]>red[j]) {
						t=red[j];
						red[j]=red[j+1];
						red[j+1]=t;
					}
				}
				
				
				
				System.out.print(red[i]+" ");
				}
			
		int[] one = new int[7];
		for (int i = 0; i < 6; i++) {
			boolean isExits = false;
			int temp = random.nextInt(33)+1;
			// 判断 t 在不在数组中
			for (int j = 0; j < 6; j++) {
				if (t==one[j]) {
					isExits = true;
				}
			}
			if (isExits == false) {
				one[i] = t;
			}else {
				i--;
			}
		}
		
		
		
		
		
		
		
	}

}
