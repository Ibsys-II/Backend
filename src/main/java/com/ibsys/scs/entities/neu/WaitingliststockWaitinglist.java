package com.ibsys.scs.entities.neu;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "waitingliststock_waitinglist")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WaitingliststockWaitinglist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "period")
    private int period;
    @Column(name = "order_number")
    private int orderNumber;
    @Column(name = "firstbatch")
    private int firstbatch;
    @Column(name = "lastbatch")
    private int lastbatch;
    @Column(name = "item")
    private int item;
    @Column(name = "amount")
    private int amount;
    @Column(name = "time_need")
    private int timeNeed;
}

