package java03;

import java.util.Scanner;

public class HellojavaQ1 {

	public static void main(String[] args) {
		//1. 3에서 8사이의 숫자 중 홀수만 더하기
		int sum=0;
		for(int i=3;i<=8;i++)
		{
			if(i%2!=0) {
				sum+=i;				
			}
		}
		System.out.println(sum);
		
		//2. 문자열 입력 후 역출력하기
		Scanner s= new Scanner(System.in);
		System.out.println("문자열 입력");
		String sentense=s.nextLine();
		for(int i= sentense.length()-1;i>=0;i--)
		{
			System.out.println(sentense.charAt(i));
		}
		
		//3.바이트 값 입력 시 비트값 출력
		System.out.println("몇 바이트니?");
		try {
			int num=s.nextInt();
			System.out.println(num+"바이트="+(num*8)+"비트");
		} catch (Exception e) {
			System.out.println("값 잘못 입력함.");
		}
		
		
		
		
		
	}

}
