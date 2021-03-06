package Assignment_1;

public class ZhenHunters {
    public static void main(String[] args) {
        GameGrid board = new GameGrid();

        //introduce the players to the game.
        System.out.println("Welcome to Zhen Hunters!");
        System.out.println("Instructions:");
        System.out.println("Players must enter their names. Player 1 will control the hunters and the other controls the Zhens");
        System.out.println("The zhen-player will also be prompted to select the number of Zhens they wish to play with\n" +
                "(valid options: 16, 18 or 20). Hunter-player indicates characters to represent their two hunters\n" +
                "(valid options: any letter other than ‘Z’).\n Hunters each start with an energy level of 4. Their maximum level is 6.\n" +
                "A summary is displayed below the board indicating the energy level of each Hunter and the\n" +
                "number of Zhens left on the grid.\n\n\n");

        board.setupGrid();
        board.displayGrid();
    }
}
