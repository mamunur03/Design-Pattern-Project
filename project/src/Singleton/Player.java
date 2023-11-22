package Singleton;

public class Player {
    private static Player instance;
    private String playerName;

    private Player() {
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
        System.out.println("Player name set to: " + playerName);
    }

    public String getPlayerName() {
        return playerName;
    }
}
