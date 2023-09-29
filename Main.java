import java.io.*;
import java.util.*;

class Main 
{
  // Driver code
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);

    // Creating a board of dimension 3x3 (row x col)
    char[][] board = new char[3][3];
    // Iterate row till board.length
    for(int row = 0; row < board.length; row++)
    {
      // Iterate column till board[row].length
      for(int col = 0; col < board[row].length; col++)
      {
          // Initialize each index of matric
          // with blank space
          board[row][col] = ' ';
      }
    }

    // Initialize the player, game_over & element_count
    char player = 'X';
    boolean game_over = false;
    int element_count = 0;

    // Iterate till game_over != true
    while(game_over != true)
    {
      // function to display the current Tic Tac Toe board
      printBoard(board);
      // Display initialized Tic Tac Toe board
      System.out.print("Player " + player + " enter : ");

      // Input row and column for 'X' or 'O'
      int row = in.nextInt();
      int col = in.nextInt();

      // Checks board[row][col] is initialized or not
      if (board[row][col] == ' ')
      {
        // Update index of matrix with player
        board[row][col] = player;
        element_count++;
        // Function to check player has won or not
        // Returns true if won
        game_over = haveWon(board, player);

        // Check if game is draw
        if (game_over == false && element_count == 9)
        {
          // function to display updated Tic Tac Toe board
          printBoard(board);
          // Display both players have not won
          System.out.println("None of the Players have won the game");
          break;
        }

        // Check if the player has won
        if (game_over == true)
        {
          // function to display updated Tic Tac Toe board
          printBoard(board);
          // Display player has won
          System.out.println("Player " + player + " has Won the game");
        }
        else
        {
          // Switch players
          player = (player == 'X') ? 'O' : 'X';
        }
      }
      else
      {
        // Display invalid move message
        System.out.println("Invalid Move. Try again!");
      }
    }
  }

  // Function to check if a player has won
  public static boolean haveWon(char[][] board, char player)
  {
    // check for each row
    for(int row = 0; row < board.length; row++)
    {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player)
        return true;
    }

    // check for each column
    for(int col = 0; col < board[0].length; col++)
    {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player)
        return true;
    }

    // check for left diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
      return true;

    // check for right diagonal
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
      return true;
    return false;
  }

  // Function to print the current state of the board
  public static void printBoard(char[][] board)
  {
    // Iterate row till board.length
    for(int row = 0; row < board.length; row++)
    {
      System.out.print(" | ");
      // Iterate column till board[row].length
      for(int col = 0; col < board[row].length; col++)
      {
        System.out.print(board[row][col] + " | ");
        // System.out.print("|" + "  " + "|" + "  " + "|" + "  " + "|");
      }
      System.out.println();
    }
  }
}
