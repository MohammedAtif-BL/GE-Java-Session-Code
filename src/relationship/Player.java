package relationship;

import java.util.List;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }
}

class Team{
    String teamName;
    List<Player> players;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    void showTeam(){
        System.out.println("Team name: "+teamName);

        for (Player player : players) {
            System.out.println("Player name: "+player.name);
        }
    }
}
