package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.WaitingliststockWaitinglist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface WaitingliststockWaitlinglistRepository extends JpaRepository<WaitingliststockWaitinglist, Long> {

    ArrayList<WaitingliststockWaitinglist> findByItem(final int item);

}
