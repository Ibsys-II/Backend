package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.WaitingListWorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface WaitinglistWorkplaceRepository extends JpaRepository<WaitingListWorkPlace, UUID> {

    ArrayList<WaitingListWorkPlace> findByItem(final int item);
}
