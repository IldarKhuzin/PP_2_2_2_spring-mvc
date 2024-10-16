package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserDAOImpl implements UserDAO {
    private List<User> users;
    {
        users = new ArrayList<>();

        User user1 = new User("Tom", 34);
        User user2 = new User("Bill", 28);
        User user3 = new User("Ron", 24);

        users.add(user1);
        users.add(user2);
        users.add(user3);


    }

    @Override
    public List<User> getUsers(int count) {
        if (count == 0) {
            return users;
        }
        return users.stream().limit(count).collect(Collectors.toList());
    }
}
