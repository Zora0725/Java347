import java.util.Scanner;
public class test5 {
	
	public static void main(String[] args) {

	// 隨機亂數假設(0,99)之間的亂數相加
	int x = (int) (Math.random() *100);
	
	//OUTPUT隨機亂數相加請USER輸入答案
	System.out.println("Guess number game (0-99)");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
	
	if (answer == x) {
		System.out.println("Correct.");
		
	} else {
		System.out.println("Wrong.");
		
	// 答錯時
	while (answer != x) {
		System.out.println("Wrong, Try again?");
		answer = input.nextInt();
	}
	
	
	System.out.println("The answer is " + x + ".");
	System.out.println("Correct.");
	
	
		input.close();
		
	}
	
	 }
	 
}
