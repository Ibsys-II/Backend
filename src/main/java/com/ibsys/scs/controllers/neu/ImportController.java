package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.ImportData;
import com.ibsys.scs.services.neu.ImportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.IMPORT)
public class ImportController {

    private final ImportService importService;

    @PostMapping
    void importData(@RequestBody final ImportData importData) {
        importService.processImport(importData);
    }
}
