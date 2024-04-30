package com.ibsys.scs.services;

import com.ibsys.scs.dto.WaitingListDto;
import com.ibsys.scs.entities.WaitingList;
import com.ibsys.scs.repositories.WaitingListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WaitingListService {

    private final WaitingListRepository waitingListRepository;

    public List<WaitingList> findWaitingListsByPeriod(final Integer period) {
        return waitingListRepository.findWaitingListsByPeriod(period);
    }

    public void createWaitingList(final WaitingListDto waitingListDto) {
        var waitingList = waitingListDto.toWaitingList();
        waitingListRepository.save(waitingList);
    }

    public void createMultipleWaitingLists(final List<WaitingListDto> waitingListDtoList) {
        var waitingLists = waitingListDtoList.stream()
                .map(WaitingListDto::toWaitingList)
                .toList();
        waitingListRepository.saveAll(waitingLists);
    }
}
