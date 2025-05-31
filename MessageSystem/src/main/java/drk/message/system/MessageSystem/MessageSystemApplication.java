package drk.message.system.MessageSystem;

import drk.message.system.MessageSystem.App.MessageSystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSystemApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(MessageSystem messageSystem) throws Exception{
		return args -> {
			messageSystem.welcome();
			messageSystem.sendAccepted();
		};
	}
}
