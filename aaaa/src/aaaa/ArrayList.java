package aaaa;

public class ArrayList {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 1 };         // 최대값 초기값 세팅       
		int max = arr[0];         // 최대값 구하기       
		for (int num : arr) {            
			if (num > max) {                
				max = num;            
				}        
			}         
		// 최대값 출력       
		System.out.println(max);
		
	}

}
