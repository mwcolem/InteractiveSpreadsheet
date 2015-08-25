package webservices;

import bl.PlayerService;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mattcoleman on 8/20/15.
 */
public class PlayerController implements org.springframework.web.servlet.mvc.Controller{
    @Autowired
    @Qualifier("playerService")
    PlayerService playerService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
//        Player player = playerService.getPlayerByRank(1);
        Player player = new Player();
        player.setName("test name");
        modelAndView.addObject("player", player);
        return modelAndView;
    }
}
