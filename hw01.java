import java.util.Random;
import java.util.Scanner;

public class hw01
{

	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int max = 99 ;
		int min = 1 ;
		// 亂數取 2 - 98 ，共 97 個數
		int ass = new Random().nextInt( 98 ) + 1 ;
		while( true )
		{
			System.out.println( "(" + min + ", " + max + ")?" + ass );
			int kk = sc.nextInt();
			if( kk == ass )
			{
				System.out.println( "Bingo." );
				break ;
			}
			// 輸入錯誤
			if(( kk < min )||( kk > max ))
			{
				System.out.println( "Out of range. Try again?" );
				continue;
			}
			// 更新，答案小於最大值
			if( kk < ass )
				min = kk ;
			else
				max = kk ;
			// 只剩一個數
			if(( max - min ) == 2 )
			{
				System.out.println( "GG." );
				break ;
			}
		}
	}
}
