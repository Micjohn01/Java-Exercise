package chapter7.archery;

import chapter7.Player;

public class ArcheryGame {

    private  Player[] players;

    public ArcheryGame(int numberOfArchers){
        players = new Player[numberOfArchers];
    }

    public Player[] getPlayers() {
        return players;
    }

}
