import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Data
public class Job {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Location is required")
    private String location;

    @NotNull(message = "Salary is required")
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;

    @NotBlank(message = "Company email is required")
    @Email(message = "Invalid email format")
    private String companyEmail;

    @NotBlank(message = "Company name is required")
    private String companyName;

    @NotBlank(message = "Employer name is required")
    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @NotNull(message = "Applied date is required")
    @PastOrPresent(message = "Applied date cannot be in the future")
    public LocalDate appliedDate;

    public Job(Long id, String title, String description, Double salary, JobType jobType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.jobType = jobType;
    }

    // Getters and setters (generated by Lombok)

    // You can define your custom enum for JobType here, for example:
    // public enum JobType {
    //     IT, HR, SALES, MARKETING
    // }
}
