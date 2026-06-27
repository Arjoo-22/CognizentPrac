package Week1.Day7;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Email Sent Successfully");
    }
}
