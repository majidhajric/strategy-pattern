package dev.majidhajric.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WalkStrategy implements TransportStrategy {
    @Override
    public TransportCategory getCategory() {
        return TransportCategory.WALK;
    }

    @Override
    public int calculateSomething(int input) {
        log.info("walk strategy calculation");
        return 10 * input;
    }
}
