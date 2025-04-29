package ca.sheridancollege.contracv.services;


import ca.sheridancollege.contracv.domain.Police;
import java.util.List;

public interface PoliceService {
    List<Police> findAll();
    Police findById(Long id);
    Police save(Police police);
}
