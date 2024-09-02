package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "皮带信息")
@Data
public class BeltInfo {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "BELT_NO", description = "皮带编号")
    private String beltNo;

    @Schema(title = "LENGTH", description = "皮带长度")
    private BigDecimal length;

    @Schema(title = "BELT_BEFORE", description = "前置")
    private String beltBefore;

    @Schema(title = "BELT_AFTER", description = "后置")
    private String beltAfter;

    @Schema(title = "REVERSIBLE", description = "转向-可反向，1是；0否")
    private BigDecimal reversible;

    @Schema(title = "WEIGHT_LIMIT", description = "限重")
    private Integer weightLimit;

    @Schema(title = "WEIGHING_ABLE", description = "是否可称重，1是；0否")
    private BigDecimal weighingAble;

    @Schema(title = "WEIGHING_DEVIATION", description = "称重误差")
    private BigDecimal weighingDeviation;

    @Schema(title = "WEIGHING_PRIORITY", description = "称重优先级")
    private BigDecimal weighingPriority;

}
