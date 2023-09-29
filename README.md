# TicTacToe-Game
Tic-Tac-Toe involves applying data structures to manage the game state, implement the logic, and determine the winner efficiently.

Overview:
The Tic-Tac-Toe project is a classic game implementation in Java that aims to demonstrate your proficiency in using data structures to manage the game state, implement game logic, and determine the winner efficiently. In this project, you will create a console-based Tic-Tac-Toe game where two players can take turns to play, and the program will determine the winner or declare a draw.

Key Objectives:
1. Implement the game's core logic using data structures.
2. Develop a user-friendly console interface for player interactions.
3. Efficiently determine the winner or declare a draw.
4. Handle invalid inputs and edge cases gracefully.

Features:
1. The game will be a two-player version of Tic-Tac-Toe, where Player 1 will be "X," and Player 2 will be "O."
2. The game board will be represented as a 3x3 grid.
3. Players will take turns making their moves until there is a winner or a draw.
4. The program will check for valid moves, ensuring that players cannot overwrite existing moves or make moves outside the grid.
5. The program will determine the winner (if any) or declare a draw based on the game's rules.
6. The game will have a clear and user-friendly console interface for player input and display of the game state.

Technical Requirements:
1. Java programming language.
2. Use of appropriate data structures (e.g., arrays, lists, or custom objects) to represent the game board.
3. Logic for checking the game's state (win, lose, or draw) efficiently.
4. Proper error handling for invalid inputs and edge cases.
5. A well-structured and commented codebase.
6. A user-friendly console interface with clear instructions.

Key components and functionalities of the Tic-Tac-Toe project:
1. Game Board Representation: Use a 2D array (e.g., char[][]) to represent the Tic-Tac-Toe game board. Initialize it with empty spaces to represent vacant positions. You can use a simple 3x3 grid or choose a different size to make the game more challenging.
2. Player Input: Allow players to input their moves using row and column coordinates. Ensure that the input is within the valid range (1-3 for both row and column) and that the chosen position is not already occupied.
3. Player Turns: Alternate between Player 1 (X) and Player 2 (O) for turns. Display the current player's symbol and prompt them for their move.
4. Game Logic: Implement the core game logic to check for a win, loss, or draw. Check for win conditions horizontally, vertically, and diagonally. Determine the winner when one player has three of their symbols in a row, column, or diagonal.Declare a draw if all positions are filled, and there is no winner.
5. User Interface: Create a console-based interface that displays the current state of the game board after each move. Provide clear instructions to the players, such as how to input their moves. Display messages when a player wins, loses, or when the game ends in a draw.
6. Error Handling: Handle invalid inputs gracefully. If a player enters an invalid input, provide an error message and prompt them to try again. Ensure that players cannot overwrite existing moves or make moves outside the grid.
7. Optional Enhancements: Single-Player Mode with AI: Implement a simple AI opponent for single-player mode, making it more challenging for players to win. Score Tracking: Keep track of each player's wins, losses, and draws, and display the score at the end of each game. Game Restart: Allow players to restart the game after it ends. Graphical User Interface (GUI): Implement a graphical interface using JavaFX or Swing for a more visually appealing and interactive experience.
8. Testing: Thoroughly test the game to ensure that it functions correctly under various scenarios, including different win conditions, draws, and edge cases. Test both the player vs. player and player vs. AI modes (if implemented). Consider automated unit tests for critical functions like win-checking.
9. Documentation: Create documentation that explains the code structure, algorithms used, and the purpose of each function or class. Include instructions on how to compile and run the game. If you added optional features, document them as well.
10. Project Completion: Once you've implemented all the features, thoroughly tested the game, and documented your work, you can consider your project complete. Remember to keep your code clean, well-organized, and well-documented throughout the development process. Breaking down the project into smaller tasks, as mentioned in the initial timeline, can help you manage your progress effectively.

Anyone can Run/Folk a public repository, and then submit a pull request that proposes changes to the repository's GitHub Actions workflows.
Replit Link : https://replit.com/@ankitkumaar0515/TicTacToe#Main.java
