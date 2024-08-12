package com.ibsys.scs.services.neu;

import com.ibsys.scs.entities.neu.Vertriebswunsch;
import com.ibsys.scs.repositories.neu.VertriebswunschRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VertriebswunschService {

    private VertriebswunschRepository vertriebswunschRepository;

    public Vertriebswunsch getVertriebswunsch() {
        return vertriebswunschRepository.findAll().get(0);
    }

    public void updateVertriebswunsch(final Vertriebswunsch vertriebswunsch) {
        vertriebswunschRepository.save(vertriebswunsch);
    }
}
