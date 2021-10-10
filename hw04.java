import java.util.Scanner;

public class hw04
{

	// power
	public static void main( String[] arge )
	{
		Scanner sc = new Scanner( System.in );
		int num ; // 底數
		int pow ; // 指數
		System.out.println( "key in number" );
		num = sc.nextInt() ;

		while( true )
		{
			System.out.println( "key in power" );
			pow = sc.nextInt() ;
			// 限定 1 - 99 人
			if( pow > 0 )
				break ;

			//
			System.out.println( "key in error ( > 0 )" );
		}
		// 算，
		long base = num ;
		long ppbase = pow ;
		long pp = 1 ;
		long ass = 1 ;
		while( pow > 0 )
		{
			// 算餘數
			int mod = pow % 2 ;//
			// 底數相同，指教相加
			if( mod > 0 )
				ass *= num ;
			//
			num *= num ;
			// 指數 *
			pp <<= 1 ;
			pow >>= 1 ;
		}

		// 負數修正
		if( base < 0 )
		{
			if( ass < 0 )
				ass = -ass ;
			if(( ppbase % 2 ) != 0 )
				ass = -ass ;
		}
		System.out.println( "ass: " + ass );
	}
}
