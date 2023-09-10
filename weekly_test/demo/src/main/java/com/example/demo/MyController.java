import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Person person; // Spring autowires the Person bean

    @Autowired
    private Address address; // Spring autowires the Address bean

    @Autowired
    private EmailService emailService; // Inject the EmailService

    @GetMapping("/getMappings")
    public String getMappings() {
        String response = "Person: " + person.toString() + "\nAddress: " + address.toString();

        // Send the email here
        String emailSubject = "Object Data";
        String emailText = response;

        emailService.sendEmail("shubhampokharkar3070@gmail.com", "Test","JAI SHRI RAM" );

        return response;
    }
}