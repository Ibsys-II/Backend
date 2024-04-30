package com.ibsys.scs.controllers;

import com.ibsys.scs.dto.WaitingListDto;
import com.ibsys.scs.entities.WaitingList;
import com.ibsys.scs.services.WaitingListService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.WAITING_LISTS)
public class WaitingListController {

    private final WaitingListService waitingListService;

    @GetMapping
    public List<WaitingList> findWaitingListsByPeriod(@RequestParam(name = "period") final Integer period) {
        return waitingListService.findWaitingListsByPeriod(period);
    }

    @PostMapping
    public void createWaitingList(@RequestBody final WaitingListDto waitingListDto) {
        waitingListService.createWaitingList(waitingListDto);
    }

    @PostMapping("/many")
    public void createMultipleWaitingLists(@RequestBody final List<WaitingListDto> waitingListDtoList) {
        waitingListService.createMultipleWaitingLists(waitingListDtoList);
    }
}
