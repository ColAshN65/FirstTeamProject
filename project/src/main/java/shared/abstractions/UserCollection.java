package shared.abstractions;

import java.util.List;

import shared.User;

public interface UserCollection {

    public Iterable<User> getUsers();
    public List<User> getUsersList();
}
