package ca.sheridancollege.contracv.services;

import ca.sheridancollege.contracv.domain.Police;
import ca.sheridancollege.contracv.repositories.PoliceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PoliceServiceImpl implements PoliceService {

    private PoliceRepository policeRepository;

    @Override
    public List<Police> findAll() {
        return policeRepository.findAll();
    }

    @Override
    public Police findById(Long id) {
        return policeRepository.findById(id).orElse(null);
    }

    @Override
    public Police save(Police police) {
        return policeRepository.save(police);
    }
}
