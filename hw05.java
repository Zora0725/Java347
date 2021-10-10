public class hw05
{

	// OOP
	public static void main( String[] arge )
	{
		// 建遊戲，看要帶什麼 AI 玩家，就 new 那一種
		Game game = new Game( new HumanPlayer());
		// 執行
		do
		{
			// 遊戲執行
			game.Run();
		}while( game.hasWon()); //直到有人贏才結束
	}

	//
	// super
	static public class Player
	{
		public int Next()
		{
			return 0 ;
		}
	}

	//
	// 人工智慧
	static public class HumanPlayer extends Player
	{
		@Override
		public int Next()
		{
			return 0 ;
		}
	}

	static public class NaiveAI extends Player
	{
		@Override
		public int Next()
		{
			return 0 ;
		}
	}

	static public class BinarySearchAI extends NaiveAI
	{
		@Override
		public int Next()
		{
			return 0 ;
		}
	}

	static public class SuperAI extends NaiveAI
	{
		@Override
		public int Next()
		{
			return 0 ;
		}
	}

	// 遊戲
	static public class Game
	{
		int secret_number = 0 ;
		int high = 0  ;
		int low = 0 ;
		boolean win_flag = false ;
		Player player ;
		// 建構子
		Game( Player player )
		{
			this.player = player ;
		}

		// 執行
		void Run()
		{
			// 可能會需要下一標
			player.Next() ;
			// 這裡要要做什麼事都可以
			// 這裡要贏的話就設旗標為 true 吧
			win_flag = true ;
		}

		// 是否結束
		boolean hasWon()
		{
			return win_flag ;
		}
	}



}
