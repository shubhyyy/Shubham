import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController<Job> {

    @Autowired
    private JobRepository jobRepository;

    @PostMapping("/")
    public <S> S createJob(@Valid @RequestBody BatchProperties.Job job) {
        S save;
        save = (S) jobRepository.save(job);
        return save;
    }

    @GetMapping("/")
    public List<Job> getAllJobs() {
        return (List<Job>) jobRepository.findAll();
    }

    // Implement other CRUD methods (get by ID, update, delete) similarly

    // Implement custom queries or search endpoints as needed
}
