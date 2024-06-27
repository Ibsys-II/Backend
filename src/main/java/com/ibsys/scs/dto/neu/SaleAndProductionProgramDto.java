package com.ibsys.scs.dto.neu;

import com.ibsys.scs.entities.neu.SaleAndProductionProgram;

public record SaleAndProductionProgramDto(
        Integer pN,
        Integer pNPlusOne,
        Integer pNPlusTwo,
        Integer pNPlusThree,
        String article
) {

    public SaleAndProductionProgram toSaleAndProductionProgram() {
        return SaleAndProductionProgram.builder()
                .id(null)
                .pN(pN)
                .pNPlusOne(pNPlusOne)
                .pNPlusTwo(pNPlusTwo)
                .pNPlusThree(pNPlusThree)
                .article(article)
                .build();
    }
}
