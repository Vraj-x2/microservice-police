package ca.sheridancollege.contracv.web.rest;


import ca.sheridancollege.contracv.domain.Police;
import ca.sheridancollege.contracv.services.PoliceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/police")
@AllArgsConstructor
public class PoliceController {

    private PoliceService policeService;

    @GetMapping
    public List<Police> getAllPolice() {
        return policeService.findAll();
    }

    @GetMapping("/{id}")
    public Police getPoliceById(@PathVariable Long id) {
        return policeService.findById(id);
    }

    @PostMapping
    public Police addPolice(@RequestBody Police police) {
        return policeService.save(police);
    }
}

