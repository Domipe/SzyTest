package sort;

import java.util.Arrays;

public class BbSort {
	public static void main(String[] args) {
		int[] a = {8,4,2,4,7,6,9};
		int[] sory = sort(a);
		System.out.println(Arrays.toString(sory));
	}
	public static int[] sort(int[] array){
		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < array.length-1 ; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j+1]<array[j]){
					temp = array[j];
					array[j] = array[j+1];
				 array[j+1] =	temp ;
				}
			}
				if(flag==false){
				break;
			}
		}
		return array;
	}
}