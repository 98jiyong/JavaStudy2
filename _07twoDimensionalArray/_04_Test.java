package _07twoDimensionalArray;

public class _04_Test {

	public static void main(String[] args) {
		/*
		 * 00 			- 합이 0
		 * 01 10 		- 합이 1
		 * 02 11 20 	- 합이 2
		 * 03 12 21 30 	- 합이 3
		 * 04 13 22 31 	- 합이 4
		 * 14 23 32 	- 합이 5
		 * 24 33		- 합이 6
		 * 43 			- 합이 7
		 */
		
		// 조건에 합을 기준으로 두고 반복문에 합에대한 값을 증가
		int[][] a = new int[4][5];
		int num = 1;
		
		for(int i=0; i<8; i++) {
			int newCol = i;
			for(int j=0; j<=i; j++) {
				if(j>3)continue;
				if(newCol < 5) {
					a[j][newCol] = num++;
				}
				
				newCol--;
			}
		}
		
//		for(int k = 0; k <= (a.length + a[0].length)-2; k++){
//			for(int i = 0; i < a.length; i++) {
//				for(int j = 0; j < a[0].length; j++) {									
//					if((i + j) == k) {
//						a[i][j] = num++;
//					}
//				}
//			}
//		}
		
		// 결과 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println("\n");
		}
	}

}
