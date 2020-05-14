package spring5.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service("i18nService")
//@Profile("ES")
@Profile({"ES","default"}) //if there is no profile set on properties, default will run
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
