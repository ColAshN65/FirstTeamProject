package model.abstractions;

import shared.abstractions.UserCollection;

public interface AgeSorter {

    public UserCollection sortUsersByAgeHash(UserCollection users);
}
