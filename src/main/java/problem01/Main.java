package problem01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {	
		String[] array_number; 	
		String pars_num = String.valueOf(number);
		int sum = 0;
		for(int i = 0; i < pars_num.length(); i++) {
		    int j = Character.digit(pars_num.charAt(i), 10);
		    if(j == 3 ||j == 6 ||j == 9) {
		    	sum++;
		    }
		}
			
//		return number;
		return sum;
	}
}