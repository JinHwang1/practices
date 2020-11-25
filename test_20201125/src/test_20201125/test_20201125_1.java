package test_20201125;

import java.util.Scanner;

public class test_20201125_1 {
	
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while ( T > 0) {
			count = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			boolean[] visited = new boolean[N];
			boolean[][] N_arr = new boolean[10][10];
			for ( int i=0; i<M ; i++) {
				int first = sc.nextInt();
				int second = sc.nextInt();
				N_arr[first][second] = true;
				N_arr[second][first] = true;
			}
			
//			System.out.println(" T : "+ T);
			check(N_arr, 0, visited, 0, N);
			System.out.println(count);
//			for ( int i=0; i<N ; i++) {
//				System.out.println(check(N_arr, i, visited, 0, N));
//			}
			T--;
		}
		
		//int n = sc.nextInt();
		
		
		
	}
	
	public static void check( boolean[][] N_arr, int start, boolean[] visited, int complete, int length ) {
		//boolean result = false;
		if ( complete == length ) {
			count++;
			return;
			//return true;
		}
		for ( int i=start; i<length; i++) {
			if ( !visited[i] ) {
				for ( int j=0; j<10; j++) {
					if ( N_arr[i][j] ) {
						N_arr[i][j] = false;
						N_arr[j][i] = false;
						visited[i] = true;
						visited[j] = true;
						check(N_arr, i+1 , visited, complete+2, length);
//						N_arr[i][j] = true;
//						visited[i] = false;
//						visited[j] = false;
					}
				}
			}
		}
		
		//return result;
		
	}
}
