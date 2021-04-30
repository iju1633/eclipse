package ch3class;

import java.util.Arrays;

public class Ex3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30}, {40,50}, {60,70,80}};
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			System.out.println(Arrays.toString(arr[i]));
		}
		
		String[] toppings = {"aa", "bb"};
		System.out.println(toppings);
		System.out.println(Arrays.toString(toppings));
		
		for(String e : toppings) {
			System.out.print(e + " ");
		}
	}

}
