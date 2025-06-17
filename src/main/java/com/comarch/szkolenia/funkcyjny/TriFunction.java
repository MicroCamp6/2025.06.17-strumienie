package com.comarch.szkolenia.funkcyjny;

@FunctionalInterface
public interface TriFunction<T,U,W,X> {
    X apply(T t, U u, W w);
}
