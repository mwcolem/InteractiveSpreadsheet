package dal.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Player;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 * Created by mattcoleman on 8/18/15.
 */
@Service("playerMapper")
public class PlayerMapper implements RowMapper<Player>{
    public Player mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Player player = new Player();
        System.out.println(resultSet.toString());
        player.setName(resultSet.getString("Player Name"));
        return player;
    }
}
