//Natalie, MaryKate, Izzy, and Haley
import java.util.*;

public class game {
	public static void main(String[] args){
	System.out.println("Welcome to the Array Game! Move your sprite 'X' to the '*' to win.");
	System.out.println(" ");
	System.out.println("Initial Board:");
	
	char[][] board = new char[4][4];
	board[0][0] = 'X';
	board[0][1] = 'O';
	board[0][2] = 'O';
	board[0][3] = 'O';
	board[1][0] = 'O';
	board[1][1] = 'O';
	board[1][2] = 'O';
	board[1][3] = 'O';
	board[2][0] = 'O';
	board[2][1] = 'O';
	board[2][2] = 'O';
	board[2][3] = 'O';
	board[3][0] = 'O';
	board[3][1] = 'O';
	board[3][2] = 'O';
	board[3][3] = 'O';
	
Random random = new Random();
int randomNum = random.nextInt(4);
int randomNum1 = random.nextInt(4);

while(randomNum == 0 && randomNum1 == 0) {
	randomNum = random.nextInt(4);
	randomNum1 = random.nextInt(4);
}

board[randomNum][randomNum1] = '*';
	for(char row = 0; row < board.length; row++){
		
	
		for(char col = 0; col < board[0].length; col++){
			System.out.print(board[row][col] + " ");

		
		
		}
		System.out.println("");

        }
	
	while( X != *) {
		Systen.out.println("Which direction would you like to move?");
		Scanner kin = new Scanner(System.in);
			int direction = kin.nextInt();
	}
	
	System.out.println("Which direction would you like to move? Up, Down, Left, or Right?");
	string first = keyboard.nextInt();
	int b = row
	int c = col
	if (first = right){
		b + 1;
	if else (first = left)
		b - 1;
	if else (first = down)
		c-1;
	if else (first = up)
		c + 1;
}
		
	
}
}
