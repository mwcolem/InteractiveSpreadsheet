package bl;

import model.Player;

import java.util.List;

/**
 * Created by mattcoleman on 8/13/15.
 */
public interface PlayerService {
    public Player getPlayerByRank(int rank);

    public List<Player> getAllPlayers();
}
