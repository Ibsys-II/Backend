package com.ibsys.scs.config;

import com.ibsys.scs.entities.Article;
import com.ibsys.scs.entities.neu.SaleAndProductionProgram;
import com.ibsys.scs.repositories.ArticleRepository;
import com.ibsys.scs.repositories.neu.SaleAndProductionProgramRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            final ArticleRepository articleRepository,
            final SaleAndProductionProgramRepository saleAndProductionProgramRepository
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
                            .number("1P")
                            .description("Kinderfahrrad")
                            .usedFor(null)
                            .startAmount(100.0)
                            .price(156.13)
                            .build(),
                    Article.builder()
                            .number("2P")
                            .description("Damenfahrrad")
                            .usedFor(null)
                            .startAmount(100.0)
                            .price(163.33)
                            .build(),
                    Article.builder()
                            .number("3P")
                            .description("Herrenfahrrad")
                            .usedFor(null)
                            .startAmount(100.0)
                            .price(165.08)
                            .build(),
                    Article.builder()
                            .number("4E")
                            .description("Hinterradgruppe")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(40.85)
                            .build(),
                    Article.builder()
                            .number("5E")
                            .description("Hinterradgruppe")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(39.85)
                            .build(),
                    Article.builder()
                            .number("6E")
                            .description("Hinterradgruppe")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(40.85)
                            .build(),
                    Article.builder()
                            .number("7E")
                            .description("Vorderradgruppe")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .number("8E")
                            .description("Vorderradgruppe")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .number("9E")
                            .description("Vorderradgruppe")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(35.85)
                            .build(),
                    Article.builder()
                            .number("10E")
                            .description("Schutzblech h.")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(12.4)
                            .build(),
                    Article.builder()
                            .number("11E")
                            .description("Schutzblech h.")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .number("12E")
                            .description("Schutzblech h.")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .number("13E")
                            .description("Schutzblech v.")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(12.4)
                            .build(),
                    Article.builder()
                            .number("14E")
                            .description("Schutzblech v.")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .number("15E")
                            .description("Schutzblech v.")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(14.65)
                            .build(),
                    Article.builder()
                            .number("16E")
                            .description("lenker cpl.")
                            .usedFor("KDH")
                            .startAmount(300.0)
                            .price(7.02)
                            .build(),
                    Article.builder()
                            .number("17E")
                            .description("Sattel cpl.")
                            .usedFor("KDH")
                            .startAmount(300.0)
                            .price(7.16)
                            .build(),
                    Article.builder()
                            .number("18E")
                            .description("Rahmen")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(13.15)
                            .build(),
                    Article.builder()
                            .number("19E")
                            .description("Rahmen")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(14.35)
                            .build(),
                    Article.builder()
                            .number("20E")
                            .description("Rahmen")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(15.55)
                            .build(),
                    Article.builder()
                            .number("21 K")
                            .description("Kette")
                            .usedFor("K")
                            .startAmount(300.0)
                            .price(5.0)
                            .build(),
                    Article.builder()
                            .number("22 K")
                            .description("Kette")
                            .usedFor("D")
                            .startAmount(300.0)
                            .price(6.5)
                            .build(),
                    Article.builder()
                            .number("23 K")
                            .description("Kette")
                            .usedFor("H")
                            .startAmount(300.0)
                            .price(6.5)
                            .build(),
                    Article.builder()
                            .number("24 K")
                            .description("Mutter 3/8\"")
                            .usedFor("KDH")
                            .startAmount(6100.0)
                            .price(0.06)
                            .build(),
                    Article.builder()
                            .number("25 K")
                            .description("Scheibe 3/8\"")
                            .usedFor("KDH")
                            .startAmount(3600.0)
                            .price(0.06)
                            .build(),
                    Article.builder()
                            .number("26 E")
                            .description("Pedal cpl.")
                            .usedFor("KDH")
                            .startAmount(300.0)
                            .price(10.5)
                            .build(),
                    Article.builder()
                            .number("27 K")
                            .description("Schraube 3/8\"")
                            .usedFor("KDH")
                            .startAmount(1800.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("28 K")
                            .description("Rohr ¾\"")
                            .usedFor("KDH")
                            .startAmount(4500.0)
                            .price(1.2)
                            .build(),
                    Article.builder()
                            .number("29 E")
                            .description("Vorderrad mont.")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(69.29)
                            .build(),
                    Article.builder()
                            .number("30 E")
                            .description("Rahmen u. Räder")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(127.53)
                            .build(),
                    Article.builder()
                            .number("31 E")
                            .description("Fahrrad o. Ped.")
                            .usedFor("H")
                            .startAmount(100.0)
                            .price(144.42)
                            .build(),
                    Article.builder()
                            .number("32 K")
                            .description("Farbe")
                            .usedFor("KDH")
                            .startAmount(2700.0)
                            .price(0.75)
                            .build(),
                    Article.builder()
                            .number("33 K")
                            .description("Felge cpl.")
                            .usedFor("H")
                            .startAmount(900.0)
                            .price(22.0)
                            .build(),
                    Article.builder()
                            .number("34 K")
                            .description("Speiche")
                            .usedFor("H")
                            .startAmount(22000.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("35 K")
                            .description("Konus")
                            .usedFor("KDH")
                            .startAmount(3600.0)
                            .price(1.0)
                            .build(),
                    Article.builder()
                            .number("36 K")
                            .description("Freilauf")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(8.0)
                            .build(),
                    Article.builder()
                            .number("37 K")
                            .description("Gabel")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(1.5)
                            .build(),
                    Article.builder()
                            .number("38 K")
                            .description("Welle")
                            .usedFor("KDH")
                            .startAmount(300.0)
                            .price(1.5)
                            .build(),
                    Article.builder()
                            .number("39 K")
                            .description("Blech")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(1.5)
                            .build(),
                    Article.builder()
                            .number("40 K")
                            .description("Lenker")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(2.5)
                            .build(),
                    Article.builder()
                            .number("41 K")
                            .description("Mutter ¾\"")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(0.06)
                            .build(),
                    Article.builder()
                            .number("42 K")
                            .description("Griff")
                            .usedFor("KDH")
                            .startAmount(1800.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("43 K")
                            .description("Sattel")
                            .usedFor("KDH")
                            .startAmount(1900.0)
                            .price(5.0)
                            .build(),
                    Article.builder()
                            .number("44 K")
                            .description("Stange ½\"")
                            .usedFor("KDH")
                            .startAmount(2700.0)
                            .price(0.5)
                            .build(),
                    Article.builder()
                            .number("45 K")
                            .description("Mutter ¼\"")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(0.06)
                            .build(),
                    Article.builder()
                            .number("46 K")
                            .description("Schraube ¼\"")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("47 K")
                            .description("Zahnkranz")
                            .usedFor("KDH")
                            .startAmount(900.0)
                            .price(3.5)
                            .build(),
                    Article.builder()
                            .number("48 K")
                            .description("Pedal")
                            .usedFor("KDH")
                            .startAmount(1800.0)
                            .price(1.5)
                            .build(),
                    Article.builder()
                            .number("49 E")
                            .description("Vorderrad cpl.")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(64.64)
                            .build(),
                    Article.builder()
                            .number("50 E")
                            .description("Rahmen u. Räder")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(120.63)
                            .build(),
                    Article.builder()
                            .number("51 E")
                            .description("Fahrrad o. Pedal")
                            .usedFor("K")
                            .startAmount(100.0)
                            .price(137.47)
                            .build(),
                    Article.builder()
                            .number("52 K")
                            .description("Felge cpl.")
                            .usedFor("K")
                            .startAmount(600.0)
                            .price(22.0)
                            .build(),
                    Article.builder()
                            .number("53 K")
                            .description("Speiche")
                            .usedFor("K")
                            .startAmount(22000.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("54 E")
                            .description("Vorderrad cpl.")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(68.09)
                            .build(),
                    Article.builder()
                            .number("55 E")
                            .description("Rahmen u. Räder")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(125.33)
                            .build(),
                    Article.builder()
                            .number("56 E")
                            .description("Fahrrad o. Pedal")
                            .usedFor("D")
                            .startAmount(100.0)
                            .price(142.67)
                            .build(),
                    Article.builder()
                            .number("57 K")
                            .description("Felge cpl.")
                            .usedFor("D")
                            .startAmount(600.0)
                            .price(22.0)
                            .build(),
                    Article.builder()
                            .number("58 K")
                            .description("Speiche")
                            .usedFor("D")
                            .startAmount(22000.0)
                            .price(0.1)
                            .build(),
                    Article.builder()
                            .number("59 K")
                            .description("Schweißdraht")
                            .usedFor("KDH")
                            .startAmount(1800.0)
                            .price(0.15)
                            .build()
            );

            saleAndProductionProgramRepository.saveAll(saleAndProductionProgram);

            articleRepository.saveAll(articles);
        };
    }
}
