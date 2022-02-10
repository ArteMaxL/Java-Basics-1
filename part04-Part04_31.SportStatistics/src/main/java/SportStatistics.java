
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String userFile = scan.nextLine();
        System.out.println("Team:");
        String userTeam = scan.nextLine();
        int numberOfGames = 0;
        int teamWins = 0;
        int teamLosses = 0;

        try {
            Scanner scanFile = new Scanner(Paths.get(userFile));

            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (row.contains(userTeam)) {
                    numberOfGames++;

                    String[] teamData = row.split(",");

                    if (teamData[0].equals(userTeam)) {
                        if (Integer.valueOf(teamData[2]) > Integer.valueOf(teamData[3])) {
                            teamWins++;
                        } else {
                            teamLosses++;
                        }
                    }
                    if (teamData[1].equals(userTeam)) {
                        if (Integer.valueOf(teamData[2]) > Integer.valueOf(teamData[3])) {
                            teamLosses++;
                        } else {
                            teamWins++;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }
}
