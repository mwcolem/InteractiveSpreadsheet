package bl;

import dal.db.PlayerDao;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mattcoleman on 8/18/15.
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
//    @Autowired
//    @Qualifier("playerDao")
//    PlayerDao playerDao;

    @Override
    public Player getPlayerByRank(int rank) {

//        return playerDao.getPlayerByRank(rank);
        Player player = new Player();
        player.setName("testing service layer");
        return player;
    }

    @Override
    public List<Player> getAllPlayers() {
//        return playerDao.getAllPlayers();
        return null;
    }
}
