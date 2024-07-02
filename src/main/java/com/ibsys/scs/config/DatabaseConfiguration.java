package com.ibsys.scs.config;

import com.ibsys.scs.entities.neu.Article;
import com.ibsys.scs.entities.neu.CapacityPlan;
import com.ibsys.scs.entities.neu.CapacityPlanSumUp;
import com.ibsys.scs.entities.neu.SaleAndProductionProgram;
import com.ibsys.scs.repositories.ArticleRepository;
import com.ibsys.scs.repositories.neu.CapacityPlanRepository;
import com.ibsys.scs.repositories.neu.CapacityPlanSumUpRepository;
import com.ibsys.scs.repositories.neu.SaleAndProductionProgramRepository;
import com.ibsys.scs.services.neu.StuecklistenGroup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            final ArticleRepository articleRepository,
            final SaleAndProductionProgramRepository saleAndProductionProgramRepository,
            final CapacityPlanRepository capacityPlanRepository,
            final CapacityPlanSumUpRepository capacityPlanSumUpRepository
    ) {
        return args -> {
            // Sale and production program
            var saleAndProductionProgram = List.of(
                    SaleAndProductionProgram.builder()
                            .pN(0)
                            .pNPlusOne(0)
                            .pNPlusTwo(0)
                            .pNPlusThree(0)
                            .article("P1")
                            .build(),
                    SaleAndProductionProgram.builder()
                            .pN(0)
                            .pNPlusOne(0)
                            .pNPlusTwo(0)
                            .pNPlusThree(0)
                            .article("P2")
                            .build(),
                    SaleAndProductionProgram.builder()
                            .pN(0)
                            .pNPlusOne(0)
                            .pNPlusTwo(0)
                            .pNPlusThree(0)
                            .article("P3")
                            .build()

            );


            var articles = List.of(
                    Article.builder()
                            .id(1)
                            .number("P1")
                            .description("Kinderfahrrad")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(156.13)
                            .build(),
                    Article.builder()
                            .id(2)
                            .number("P2")
                            .description("Damenfahrrad")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(163.33)
                            .build(),
                    Article.builder()
                            .id(3)
                            .number("P3")
                            .description("Herrenfahrrad")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(165.08)
                            .build(),
                    Article.builder()
                            .id(4)
                            .number("E4")
                            .description("Hinterradgruppe")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(40.85)
                            .build(),
                    Article.builder()
                            .id(5)
                            .number("E5")
                            .description("Hinterradgruppe")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(39.85)
                            .build(),
                    Article.builder()
                            .id(6)
                            .number("E6")
                            .description("Hinterradgruppe")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(40.85)
                            .build(),
                    Article.builder()
                            .id(7)
                            .number("E7")
                            .description("Vorderradgruppe")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .id(8)
                            .number("E8")
                            .description("Vorderradgruppe")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .id(9)
                            .number("E9")
                            .description("Vorderradgruppe")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .id(10)
                            .number("E10")
                            .description("Schutzblech h.")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(12.4)
                            .build(),
                    Article.builder()
                            .id(11)
                            .number("E11")
                            .description("Schutzblech h.")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .id(12)
                            .number("E12")
                            .description("Schutzblech h.")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .id(13)
                            .number("E13")
                            .description("Schutzblech v.")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(12.4)
                            .build(),
                    Article.builder()
                            .id(14)
                            .number("E14")
                            .description("Schutzblech v.")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .id(15)
                            .number("E15")
                            .description("Schutzblech v.")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .id(16)
                            .number("E16")
                            .description("lenker cpl.")
                            .usedFor(StuecklistenGroup.ALLE)
                            .startAmount(300.0)
                            .price(7.02)
                            .build(),
                    Article.builder()
                            .id(17)
                            .number("E17")
                            .description("Sattel cpl.")
                            .usedFor(StuecklistenGroup.ALLE)
                            .startAmount(300.0)
                            .price(7.16)
                            .build(),
                    Article.builder()
                            .id(18)
                            .number("E18")
                            .description("Rahmen")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(13.15)
                            .build(),
                    Article.builder()
                            .id(19)
                            .number("E19")
                            .description("Rahmen")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(14.35)
                            .build(),
                    Article.builder()
                            .id(20)
                            .number("E20")
                            .description("Rahmen")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(15.55)
                            .build(),
                    Article.builder()
                            .id(26)
                            .number("E26")
                            .description("Pedal cpl.")
                            .usedFor(StuecklistenGroup.ALLE)
                            .startAmount(300.0)
                            .price(10.5)
                            .build(),
                    Article.builder()
                            .id(29)
                            .number("E29")
                            .description("Vorderrad mont.")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(69.29)
                            .build(),
                    Article.builder()
                            .id(30)
                            .number("E30")
                            .description("Rahmen u. Räder")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(127.53)
                            .build(),
                    Article.builder()
                            .id(31)
                            .number("E31")
                            .description("Fahrrad o. Ped.")
                            .usedFor(StuecklistenGroup.P3)
                            .startAmount(100.0)
                            .price(144.42)
                            .build(),
                    Article.builder()
                            .id(49)
                            .number("E49")
                            .description("Vorderrad cpl.")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(64.64)
                            .build(),
                    Article.builder()
                            .id(50)
                            .number("E50")
                            .description("Rahmen u. Räder")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(120.63)
                            .build(),
                    Article.builder()
                            .id(51)
                            .number("E51")
                            .description("Fahrrad o. Pedal")
                            .usedFor(StuecklistenGroup.P1)
                            .startAmount(100.0)
                            .price(137.47)
                            .build(),
                    Article.builder()
                            .id(54)
                            .number("E54")
                            .description("Vorderrad cpl.")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(68.09)
                            .build(),
                    Article.builder()
                            .id(55)
                            .number("E55")
                            .description("Rahmen u. Räder")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(125.33)
                            .build(),
                    Article.builder()
                            .id(56)
                            .number("E56")
                            .description("Fahrrad o. Pedal")
                            .usedFor(StuecklistenGroup.P2)
                            .startAmount(100.0)
                            .price(142.67)
                            .build()
            );


            var capacityPlanList = List.of(
                    CapacityPlan.builder()
                            .articleNumber(1)
                            .article("P1")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(2)
                            .article("P2")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(3)
                            .article("P3")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(4)
                            .article("E4")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(5)
                            .article("E5")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(6)
                            .article("E6")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(7)
                            .article("E7")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(8)
                            .article("E8")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(9)
                            .article("E9")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(10)
                            .article("E10")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(11)
                            .article("E11")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(12)
                            .article("E12")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(13)
                            .article("E13")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(14)
                            .article("E14")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(15)
                            .article("E15")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(16)
                            .article("E16")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(17)
                            .article("E17")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(18)
                            .article("E18")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(19)
                            .article("E19")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(20)
                            .article("E20")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(26)
                            .article("E26")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(29)
                            .article("E29")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(30)
                            .article("E30")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(31)
                            .article("E31")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(49)
                            .article("E49")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(50)
                            .article("E50")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(51)
                            .article("E51")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(54)
                            .article("E54")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(55)
                            .article("E55")
                            .quantity(0)
                            .build(),
                    CapacityPlan.builder()
                            .articleNumber(56)
                            .article("E56")
                            .quantity(0)
                            .build()

            );

            var capacityPlanSumUpList = List.of(
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(1)
                            .setupTime(60)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(2)
                            .setupTime(80)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(3)
                            .setupTime(60)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(4)
                            .setupTime(80)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(6)
                            .setupTime(90)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(7)
                            .setupTime(200)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(8)
                            .setupTime(175)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(9)
                            .setupTime(135)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(10)
                            .setupTime(120)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(11)
                            .setupTime(100)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(12)
                            .setupTime(0)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(13)
                            .setupTime(0)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(14)
                            .setupTime(0)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build(),
                    CapacityPlanSumUp.builder()
                            .workPlaceNumber(15)
                            .setupTime(0)
                            .capacityRequirementBacklogPrevPeriod(0)
                            .setupTimeBacklogPrevPeriod(0)
                            .build()
            );


            saleAndProductionProgramRepository.saveAll(saleAndProductionProgram);

            // articleRepository.saveAll(articles);

            capacityPlanRepository.saveAll(capacityPlanList);

            capacityPlanSumUpRepository.saveAll(capacityPlanSumUpList);


        };
    }
}
