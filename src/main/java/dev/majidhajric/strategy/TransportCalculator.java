package dev.majidhajric.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class TransportCalculator {

    private final Map<TransportCategory, TransportStrategy> strategyMap;

    public int calculate(TransportCategory category, int input) {
        TransportStrategy strategy = strategyMap.get(category);
        if (strategy == null) {
            throw new RuntimeException("no strategy");
        }
        int result = strategy.calculateSomething(input);
        log.info("calculated resul {} using {}", result, strategy);
        return result;
    }
}
