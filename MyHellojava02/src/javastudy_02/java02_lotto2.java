package javastudy_02;

import java.util.ArrayList;
import java.util.Scanner;

public class java02_lotto2 {

	public static void main(String[] args) {
		ArrayList<Integer>lotto = new ArrayList<Integer>();
		Scanner s= new Scanner(System.in);
		System.out.println("��ŭ?");
		int price = s.nextInt();
		if(price%1000 !=0)
		{
			System.out.println("�Ž����� : "+price%1000);
			price -= (price%1000);
			System.out.println("���ݾ� : "+ price);
		}
		int count = price/1000;
		if(count>5 || count<1)
		{
			System.out.println("�߸��� �ݾ�");
			return;
		}
		for(int i =0; i<count; i++)
		{
			while(lotto.size()!=6)
			{
				int num = (int)(Math.random()*45)+1;
				lotto.remove((Integer)num);
				lotto.add(num);
			}
			Collections.sort(lotto);
			
			System.out.println(lotto.toString());
			int bns =(int)(Math.random()*45)+1;
			while(lotto.contains(bns))
			{
				bns =(int)(Math.random()*45)+1;
			}
			System.out.println("���ʽ� "+ bns);
			lotto.clear();
		}
		
	}

}