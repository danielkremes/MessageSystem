package drk.message.system.MessageSystem.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Sender sender() {
        System.out.println("Message created");
        Sender sender = new Sender();
        sender.setEmail("tech@gmail.com");
        sender.setNome("DRK_Corp");
        return sender;
    }
}
