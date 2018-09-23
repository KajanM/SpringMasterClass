package guru.springframework.config;

import guru.springframework.services.GreetingServiceFactory;
import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    private GreetingRepository greetingRepository;

    @Bean
    GreetingServiceFactory greetingServiceFactory() {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService() {
        return greetingServiceFactory().createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService() {
        return greetingServiceFactory().createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService() {
        return greetingServiceFactory().createGreetingService("es");
    }

    @Autowired
    public void setGreetingRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
}
