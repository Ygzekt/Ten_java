package javastudy01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_1004_Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> nums = new ArrayList<Integer>();
		
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println(i+1+"번째 숫자 입력하기");
			nums.add(s.nextInt());
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}

		System.out.println("몇 미만의 숫자를 지울까요?");
		int cutline=s.nextInt();
		for(int i= nums.size()-1; i>0; i--)
		{
			if(cutline>nums.get(i))
				nums.remove(i);
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		
		
		
	}

}
