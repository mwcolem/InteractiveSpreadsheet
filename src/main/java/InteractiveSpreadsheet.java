import bl.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mattcoleman on 8/18/15.
 */
public class InteractiveSpreadsheet {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
//        PlayerService playerService = (PlayerService)context.getBean("playerService");
//        playerService.getAllPlayers();
    }
}
