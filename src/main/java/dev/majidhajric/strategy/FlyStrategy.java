package dev.majidhajric.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FlyStrategy implements TransportStrategy {
    @Override
    public TransportCategory getCategory() {
        return TransportCategory.FLY;
    }

    @Override
    public int calculateSomething(int input) {
        log.info("fly strategy calculation");
        return input;
    }
}
