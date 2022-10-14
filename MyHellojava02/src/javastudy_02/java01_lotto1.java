package javastudy_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java01_lotto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("�뼹留덈굹 �궡嫄닿��슂?");
		int count= s.nextInt()/1000;
		if(count>5||count<1)
		{
			System.out.println("湲덉븸�씠 �옒紐삳릺�뿀�뒿�땲�떎.");
			return;
		}
		for(int i=0; i<count; i++)
		{
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for(int j=0; j<6; j++)
			{
				int num=(int)(Math.random()*45)+1;
				boolean isDuplicate =false;
				for(int k=0; k<j;k++)
				{
					if(lotto.get(k)==num)
					{
						isDuplicate=true;
						j--;
						break;
					}
				}
				if(!isDuplicate)
					lotto.add(num);
			}
			
			Collections.sort(lotto);
			int bns=(int)(Math.random()*45)+1;
			for(int j=0; j<lotto.size(); j++)
			{
				if(bns==lotto.get(j))
				{
					bns=(int)(Math.random()*45)+1;
					j=-1;
				}
			}
			Collections.sort(lotto);			
			System.out.println(lotto.toString());
			System.out.println(" 보너스 "+bns);
		}
		
		
		
	}

}
