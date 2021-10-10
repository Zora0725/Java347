import java.util.Random;
import java.util.Scanner;

public class hw02
{
	public static void main( String[] arge )
	{
		System.out.println( "Enter number of citizens:" );
		Scanner sc = new Scanner( System.in );
		int num ;
		while( true )
		{
			num = sc.nextInt() ;
			// 限定 1 - 99 人
			if(( num > 1 )&&( num < 100 ))
				break ;

			//
			System.out.println( "key in error ( 2 - 99 )" );
		}

		int i , b , r ;
		Random random = new Random();
		// 產生陣列
		int arr[] = new int[num] ;
		for( i = 0 ; i < num ; ++i )
			arr[i] = i ;

		// 產生亂數交換
		for( i = 0 ; i < num ; ++i )
		{
			r = random.nextInt( num );
			b = arr[i] ;
			arr[i] = arr[r] ;
			arr[r] = b ;
		}

		// 印id
		System.out.print( "       id" );
		for( i = 0 ; i < num ; ++i )
			System.out.print( String.format( "% 4d" , i ));
		System.out.println();

		// 印傳染
		System.out.print( "Contactee" );
		for( i = 0 ; i < num ; ++i )
			System.out.print( String.format( "% 4d" , arr[i] ));
		System.out.println();

		// 輸入開始
		int start ;
		System.out.println( "Enter id of infected citizen:" );
		while( true )
		{
			start = sc.nextInt() ;
			// 限定 1 - 99 人
			if(( start >= 0 )&&( start < num ))
				break ;

			//
			System.out.println( String.format( "key in error ( 0 - %d )" , num - 1 ));
		}
		// 開始
		i = start ;
		System.out.println( "These citizens are to be self-isolated in the following da14 days:" );
		while( true )
		{
			System.out.print( " " + i );
			i = arr[i] ;
			if( i == start )
				break ;
		}
		System.out.println();
	}
}
