package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.entities.neu.Vertriebswunsch;
import com.ibsys.scs.services.neu.VertriebswunschService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/vertriebswunsch")
public class VertriebswunschController {

    private VertriebswunschService vertriebswunschService;

    @GetMapping
    public Vertriebswunsch getVertriebswunsch() {
        return vertriebswunschService.getVertriebswunsch();
    }

    @PutMapping
    public void updateVertriebswunsch(@RequestBody final Vertriebswunsch vertriebswunsch) {
        vertriebswunschService.updateVertriebswunsch(vertriebswunsch);
    }
}
