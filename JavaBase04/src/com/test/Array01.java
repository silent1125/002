package com.test;

import java.util.Random;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		//  ����ĵ�һ�ִ�����ʽ����̬����
		/*int[] b = {7,8};
		b[0] = 9;
		int[] b1 = {2};//�������ֽ���Ϊ0�������ǿ�
		//b1[0] = 90;//�±�Խ��  ���󣡣���
		
		// �ڶ��ִ�����ʽ ��̬����
		//��ʱ �����е�10��Ԫ��ֵ Ĭ��Ϊ0
		int[] array = new int[10];
		array[0]=1;
		//string ������Ĭ����null
		String[] names = new String[32];
		
		
		// �±꣺����׼ȷ�ҵ������е�ĳһԪ��
		// �±�ֵ��0��ʼ��������������-1
		array[0] = 89;
		array[1] = 89;
		array[2] = 89;
		//...
		array[9] = 89;
		// �����forѭ������ʹ�ã�
		Random random = new Random();
		// length �������鳤��
		for (int i = 0; i < 10; i++) {
		array[i] = random.nextInt(41)+20;	
		}
		// ע�⣺��Ҫֱ��������飡===Ĭ��������������ڴ��еĵ�ַ������
		// ����Ҳ�����Բ������㣡�����������е�Ԫ�ؿ���
		//------------------
		//������ϰ
		/*1.�����������飬����Ϊ10��ȡֵ��Χ[20,70]��
		  ��ȡ���ֵ����Сֵ���±�
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
		System.out.println("���ֵ�±�:" + max_index);
		 System.out.println("��Сֵ�±�:" + min_index);
		
		  
		/*  2.���������������飬���ȶ�Ϊ5��ȡֵ��Χ[20,60]
		  ������������ƴ�ӳ�һ������Ϊ10�����飡
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
		//��ϰ3������������ ��������ڱ���ڼ���
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt(); 
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		System.out.println("���������ڣ�");
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
		
		// ��ϰ4���������飬����Ϊ10��ȡֵ[30,80]��������Ԫ�ضԵ���
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
		// ��㸺��Ƚϵ�����
		for (int i = 0; i < arr.length - 1; i++) {
			// �ڲ㸺��ÿһ�˱ȽϵĴ���
			// ע�⣬�ڲ�-1����Ҫ���������±�Խ��
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
		//1  7��Ԫ�أ�6+1 6������[1--33]  һ������ [1--16]
		//2   ��֤6������ ��ֵ���ظ�
		//3  6��������+1����
		//4  �û�����Ҫ�����ע��
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
			// �ж� t �ڲ���������
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
