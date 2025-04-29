package ca.sheridancollege.contracv.bootstrap;

import ca.sheridancollege.contracv.domain.Police;
import ca.sheridancollege.contracv.services.PoliceService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private PoliceService policeService;

    @Override
    public void run(String... args) {
        policeService.save(new Police("Jake Peralta"));
        policeService.save(new Police("Amy Santiago"));
        policeService.save(new Police("Terry Jeffords"));
    }
}
