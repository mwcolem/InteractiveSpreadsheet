package dal.db;

import model.Player;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mattcoleman on 8/18/15.
 */
@Service("playerDao")
public class PlayerDaoImpl implements PlayerDao {

//    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    static final String DB_URL="jdbc:postgresql://mean.local:8080/player_db";

    static final String USER ="sql";
    static final String PASS ="sql";

    @Autowired
    PlayerMapper playerMapper;

    @Override
    public List<Player> getAllPlayers() {
        int rowCount = jdbcTemplate.queryForObject("select count(*) from players", Integer.class);
        List<Player> playerList = new ArrayList<Player>();

        for (int i = 0; i < rowCount; i++) {
            Player player = getPlayerByRank(i);
            playerList.add(player);
        }
        return playerList;
    }

    @Override
    public Player getPlayerByRank(int rank) {
//        Connection connection = null;
//        Statement statement = null;
//        String sql = "select * from players where Rank = " + rank;
//        ResultSet resultSet;
//        Player player = new Player();
//        try {
//            connection = DriverManager.getConnection(DB_URL, USER, PASS);
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//            player = playerMapper.mapRow(resultSet, 0);
//
//        } catch (SQLException e) {
//
//        } finally {
//            try {
//
//
//                if (statement != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//
//            }
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//
//            }
//        }
//        Player player = jdbcTemplate.queryForObject(sql, new PlayerMapper());

        Player testPlayer = new Player();
        testPlayer.setName("Test");
        return testPlayer;
    }

    @Override
    public Player getPlayerByBestRank(int rank) {
        return null;
    }

    @Override
    public Player getPlayerByWorstRank(int rank) {
        return null;
    }

    @Override
    public Player getPlayersByPosition(String position) {
        return null;
    }
}
