package org.artemas.predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class PredicateExampleTest {

    private PredicateExample predicateExample;

    @BeforeEach
    void setup () {
        predicateExample = new PredicateExample();
    }

    @Test
    @DisplayName("Should return strings that do not start with the letter T")
    void returnStringsThatDoNotStartWithTheLetterT() {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

        List<String> filteredStrings =  predicateExample.stringNotStartingWithLetterT(strings);

        assertThat(filteredStrings)
                .containsExactly("one", "four", "five")
                .hasSize(3);
    }
}
