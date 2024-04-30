package com.ibsys.scs.controllers;

import com.ibsys.scs.dto.BatchDto;
import com.ibsys.scs.entities.Batch;
import com.ibsys.scs.services.BatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.BATCHES)
public class BatchController {

    private final BatchService batchService;

    @GetMapping
    public List<Batch> findBatchByItemNumber(@RequestParam(name = "itemNumber") final Integer orderId) {
        return batchService.findBatchByItemNumber(orderId);
    }

    @PostMapping
    public void createBatch(@RequestBody final BatchDto batchDto) {
        batchService.createBatch(batchDto);
    }

    @PostMapping("/many")
    public void createMultipleBatches(@RequestBody final List<BatchDto>  batchDtoList) {
        batchService.createMultipleBatches(batchDtoList);
    }
}
