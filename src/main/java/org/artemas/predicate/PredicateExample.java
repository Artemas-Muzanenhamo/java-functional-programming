package org.artemas.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public List<String> stringNotStartingWithLetterT(List<String> strings) {
        Predicate<String> filter = (String string) -> string.startsWith("t");
        strings.removeIf(filter);

        return strings;
    }
}
