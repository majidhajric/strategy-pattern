package dev.majidhajric.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);
    }

    @Bean
    public Map<TransportCategory, TransportStrategy> transportStrategies(Collection<TransportStrategy> transportStrategies) {
        Map<TransportCategory, TransportStrategy> result = new EnumMap<>(TransportCategory.class);
        transportStrategies.forEach(transportStrategy -> result.put(transportStrategy.getCategory(), transportStrategy));
        return result;
    }
}
