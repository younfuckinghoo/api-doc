package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "门机行走极限")
@Data
public class CraneFeasibleRegion {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "REGION_IDX", description = "序号")
    private Integer regionIdx;

    @Schema(title = "BERTH_NO", description = "泊位，BERTH_INFO泊位信息!A1")
    private String berthNo;

    @Schema(title = "CABLE_HOLE", description = "电缆孔")
    private String cableHole;

    @Schema(title = "CRANE_NO", description = "门机，MACHINE_INFO机械设备信息!A1")
    private String craneNo;

    @Schema(title = "CABLE_HOLE_LOCATION", description = "电缆孔位置")
    private String cableHoleLocation;

    @Schema(title = "MOVE_RANGE", description = "移动区间")
    private String moveRange;

    @Schema(title = "TYPHOON_PREVENTION_PLAN", description = "防台方案")
    private String typhoonPreventionPlan;

    @Schema(title = "TEMP_ANCHORING_PLAN1", description = "临时锚定方案1（35柱以南）")
    private String tempAnchoringPlan1;

    @Schema(title = "TEMP_ANCHORING_PLAN2", description = "临时锚定方案2（42柱以南）")
    private String tempAnchoringPlan2;

    @Schema(title = "REGION_BEFORE", description = "未改造前移动区间")
    private String regionBefore;

    @Schema(title = "REMARK", description = "备注")
    private String remark;

}
