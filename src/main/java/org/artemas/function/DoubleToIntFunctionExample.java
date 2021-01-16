package org.artemas.function;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {
    public int getIntValueBy(double input) {
        DoubleToIntFunction intFunction = value -> (int) value * 2;
        return intFunction.applyAsInt(input);
    }
}
