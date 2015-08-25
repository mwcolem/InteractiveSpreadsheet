package dal.orchestration;

import model.Player;

/**
 * Created by mattcoleman on 8/13/15.
 */
public interface PlayerDataService {
    public Player getAllPlayers();
    public Player getPlayerByRank(int rank);
    public Player getPlayerByBestRank(int rank);
    public Player getPlayerByWorstRank(int rank);
    public Player getPlayersByPosition(String position);
}
