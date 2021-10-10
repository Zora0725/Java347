
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class hw03
{

	// 建立亂數
	static int [] CreateRandom( int num )
	{
		int ret[] = new int[num] ;
		Random random = new Random();
		int i ;
		for( i = 0 ; i < num ; ++i )
			ret[i] = random.nextInt(100000);
		return ret ;
	}

	//
	//
	static long ArraysSort( int num )
	{
		int[] arr = CreateRandom( num );
		long btime = new Date().getTime();

		// 排序( 小到大
		Arrays.sort( arr );
		// 計時
		long runTime = new Date().getTime() - btime ;
		return  runTime  ;
	}

	//
	//
	static long Insertion( int num )
	{
		int[] arr = CreateRandom( num );
		long btime = new Date().getTime();

		// 排序( 小到大
		for (int j = 1; j < num ; j++)
		{
			int key = arr[j];
			int i = j - 1;
			while ( (i > -1) && ( arr[i] > key ) )
			{
				arr [i+1] = arr[i] ;
				i--;
			}
			arr[i+1] = key;
		}
		// 計時
		long runTime = new Date().getTime() - btime ;
		return  runTime  ;
	}



	//
	//
	static long Selection( int num )
	{
		int[] arr = CreateRandom( num );
		long btime = new Date().getTime();

		int i ;
		// 排序( 小到大
		for ( i = 0; i < num -1; i++)
		{
			// 目前排的位置
			int min = i;
			for (int j = i + 1 ; j < num ; j++)
				if (arr[j] < arr[min])
					min = j;


			// 交換目前值最小
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		// 計時
		long runTime = new Date().getTime() - btime ;
		return  runTime  ;	}

	//
	//
	static long Bubble( int num )
	{
		int[] arr = CreateRandom( num );
		long btime = new Date().getTime();
		int i , b ;
		while( num > 0 )
		{
			for( i = 1 ; i < num ; ++i )
				if( arr[i-1] > arr[i] )
				{
					b = arr[i-1] ;
					arr[i-1] = arr[i] ;
					arr[i] = b ;
				}
			num -- ;
		}
		// 計時
		long runTime = new Date().getTime() - btime ;
		return  runTime  ;

	}



	// 排序
	public static void main( String[] arge )
	{
		int i ;
		int num = 1000 ;
		System.out.println( "          Size \t Bubble sort \tSelection sort\tInsertion sort\tArrays.sort" );
		for( i = 0 ; i < 6 ; ++i )
		{
			System.out.print( String.format( "% 14d" , num ));
			System.out.print( String.format( "% 14d" , Bubble( num )));
			System.out.print( String.format( "% 18d" , Selection( num )));
			System.out.print( String.format( "% 16d" , Insertion( num )));
			System.out.print( String.format( "% 13d" , ArraysSort( num )));
			System.out.println();
			num *= 2 ;
		}
	}
}
