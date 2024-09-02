package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "系榄桩")
@Data
public class BollardInfo {
    @Schema(title = "ID", description = "ID")
    private String id;


    @Schema(title = "BERTH_ID", description = "泊位ID")
    private String berthId;

    @Schema(title = "BERTH_NO", description = "泊位编号")
    private String berthNo;

    @Schema(title = "BOLLARD_NO", description = "缆桩编号")
    private String bollardNo;

    @Schema(title = "BOLLARD_NAME", description = "缆桩名称")
    private String bollardName;

    @Schema(title = "SHORELINE_DISTANCE", description = "缆桩距岸线位置")
    private BigDecimal shorelineDistance;

    @Schema(title = "LAST_BOLLARD_DISTANCE", description = "与上一缆桩距离")
    private BigDecimal lastBollardDistance;

}
