package com.ibsys.scs.entities.neu.importentities;

import com.ibsys.scs.dto.neu.ArticleDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseStock {
    private List<ArticleDto> article;
    private String totalstockvalue;
}
