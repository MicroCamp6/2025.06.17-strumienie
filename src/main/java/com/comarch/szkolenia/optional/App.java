package com.comarch.szkolenia.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<User> userBox = findUserByLogin("amadeusz");
        if(userBox.isPresent()) {
            System.out.println(userBox.get().getName());
        } else {
            System.out.println("Nie ma takiego usera !!!");
        }

        userBox.orElse(new User("default", "default"));
        userBox.orElseGet(App::getDefaultUser);
        userBox.ifPresent(u -> System.out.println(u.getName()));
        userBox.ifPresentOrElse(
                u -> System.out.println(u.getName()),
                () -> System.out.println("Nie ma takiego usera !!!")
        );

        /*Optional<String> nameBox;
        if(userBox.isPresent()) {
            nameBox = Optional.of(userBox.get().getName());
        } else {
            nameBox = Optional.empty();
        }*/

        Optional<String> nameBox = userBox.map(User::getName);

        /*try {
            userBox.get();
        } catch (NoSuchElementException e) {
            throw new UserNotFoundException();
        }*/

        userBox.orElseThrow(UserNotFoundException::new);

        //??
        //??
        //??
    }

    public static Optional<User> findUserByLogin(String login) {
        List<User> list = new ArrayList<>();
        list.add(new User("Janusz", "janusz"));
        list.add(new User("Wiesiek", "wiesiek"));
        list.add(new User("Mateusz", "mateusz"));
        list.add(new User("Bogdan", "bogdan"));
        list.add(new User("Zbyszek", "zbyszek"));

        for(User u : list) {
            if(u.getLogin().equals(login)) {
                return Optional.of(u);
            }
        }

        return Optional.empty();
    }

    public static User getDefaultUser() {
        return new User("default", "default");
    }
}
