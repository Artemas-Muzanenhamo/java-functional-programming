package org.artemas.function;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class FunctionExample {
    public List<String> getNames(List<User> users) {
        Function<User, String> userNames = User::getName;

//        for (User user: users) {
//            List<String> names = new ArrayList<>(); // store names here...
//            String name = userNames.apply(user);
//            names.add(name);
//        }
        return users.stream()
                .map(userNames)
                .collect(toList());
    }
}
