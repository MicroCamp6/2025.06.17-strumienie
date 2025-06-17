package com.comarch.szkolenia.funkcyjny;

import java.util.function.UnaryOperator;

public class UO implements UnaryOperator<String> {
    @Override
    public String apply(String string) {
        return string + "cos";
    }
}
