package chapter7;

import chapter7.archery.ArcheryGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArcheryGameTest {
    private ArcheryGame game;

    @BeforeEach
    public void setUp(){
        game = new ArcheryGame(1);
    }

    @Test
    public void testThatArcheryGameExists(){
//        ArcheryGame game = new ArcheryGame();
        assertNotNull(game);
    }

    @Test
    public void testThatPlayersCanExistInArcheryGame(){
        Player[] players = game.getPlayers();
        assertNotNull(players);
        assertTrue(players.length>0);
    }
    @Test
    public void testThatGameHasPlayer(){
        Player[] players = game.getPlayers();
        Player player = players[0];
        assertNotNull(player);
}
}