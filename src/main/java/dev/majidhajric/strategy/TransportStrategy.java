package dev.majidhajric.strategy;

public interface TransportStrategy {

    TransportCategory getCategory();

    int calculateSomething(int input);
}
