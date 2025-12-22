import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice 
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner of a single game
    static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to calculate wins and winning percentages
    static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];
        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    // Method to display results
    static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\t\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Entity\t\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] gameResults = new String[games][3];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String playerChoice = sc.nextLine();
            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1).toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            if (winner.equals("Player"))playerWins++;
            else if (winner.equals("Computer"))computerWins++;
            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        String[][] stats = calculateStats(playerWins, computerWins, games);

        // Displaying the output
        displayResults(gameResults, stats);
    }
}
