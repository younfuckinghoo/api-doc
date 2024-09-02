package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "货种")
@Data
public class CargoType {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "CARGO_NO", description = "货种编号")
    private String cargoNo;

    @Schema(title = "CARGO_GRADE", description = "货种级别")
    private BigDecimal cargoGrade;

    @Schema(title = "FIRST_GRADE", description = "一级货种")
    private String firstGrade;

    @Schema(title = "SECOND_GRADE", description = "二级货种")
    private String secondGrade;

    @Schema(title = "CARGO_NAME", description = "货种名称")
    private String cargoName;

    @Schema(title = "FLOWABLE", description = "是否可流程，1是；0否")
    private BigDecimal flowable;

}
