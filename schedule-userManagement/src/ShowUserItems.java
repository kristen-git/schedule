import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-13  17:04
 * @Description: TODO
 */

public class ShowUserItems {
    public ArrayList<User> showUserManager(){
        ArrayList<User> userItems = new ArrayList<>();

        User user1 = new User(1, "Angel", "123456", new Date(1670977192000L),false);
        User user2 = new User(2, "Steve", "111111", new Date(1688977192000L),false);
        User user3 = new User(3, "Kevin", "222222", new Date(1698977192000L),false);

        userItems.add(user1);
        userItems.add(user2);
        userItems.add(user3);

        return userItems;
    }
}
