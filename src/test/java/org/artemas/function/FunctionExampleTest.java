package org.artemas.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionExampleTest {

    private FunctionExample functionExample;

    @BeforeEach
    void setup() {
        functionExample = new FunctionExample();
    }

    @Test
    @DisplayName("Should return names of users given a User object")
    void returnUserNames() {
        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);

        List<String> names = functionExample.getNames(users);

        assertThat(names)
                .hasSize(4)
                .containsExactly("Sarah", "James", "Mary", "John");
    }
}