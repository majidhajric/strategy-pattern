package dev.majidhajric.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DriveStrategy implements TransportStrategy {
    @Override
    public TransportCategory getCategory() {
        return TransportCategory.DRIVE;
    }

    @Override
    public int calculateSomething(int input) {
        log.info("drive strategy calculation");
        return 5 * input;
    }
}
