package dal.db;

import model.Player;

import javax.sql.DataSource;

import java.util.List;

/**
 * Created by mattcoleman on 8/13/15.
 */
public interface PlayerDao {
    public List<Player> getAllPlayers();
    public Player getPlayerByRank(int rank);
    public Player getPlayerByBestRank(int rank);
    public Player getPlayerByWorstRank(int rank);
    public Player getPlayersByPosition(String position);
}
