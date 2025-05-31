package drk.message.system.MessageSystem.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem {
    @Autowired
    private Sender noReply;

    @Autowired
    private Sender techTeam;

    public void sendAccepted() {
        System.out.println(noReply);
        System.out.println("your registration is done");
    }

    public void welcome() {
        techTeam.setEmail("techTeam@gmail.com");
        System.out.println(techTeam.getEmail());
    }
}
