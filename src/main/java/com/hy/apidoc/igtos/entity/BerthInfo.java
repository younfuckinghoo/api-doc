package com.hy.apidoc.igtos.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(name = "泊位")
@Data
public class BerthInfo {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "BERTH_NO", description = "泊位编号")
    private String berthNo;

    @Schema(title = "BERTH_NAME", description = "泊位名称")
    private String berthName;

    @Schema(title = "FLOW_LOAD", description = "流程装船，1是；0否")
    private BigDecimal flowLoad;

    @Schema(title = "FLOW_UNLOAD", description = "流程卸船，1是；0否")
    private BigDecimal flowUnload;

    @Schema(title = "MOVE_LOAD", description = "搬倒装船，1是；0否")
    private BigDecimal moveLoad;

    @Schema(title = "MOVE_UNLOAD", description = "搬倒卸船，1是；0否")
    private BigDecimal moveUnload;

    @Schema(title = "BERTH_LENGTH", description = "泊位长度")
    private BigDecimal berthLength;

    @Schema(title = "BERTH_FRONT_WIDTH", description = "泊位前沿宽度")
    private BigDecimal berthFrontWidth;

    @Schema(title = "QUAY_TOP_HEIGHT", description = "码头面顶高度")
    private BigDecimal quayTopHeight;

    @Schema(title = "FRONT_DATUM", description = "前沿设计底标高")
    private BigDecimal frontDatum;

    @Schema(title = "TURNING_DIAMETER", description = "回旋水域直径（米）")
    private BigDecimal turningDiameter;

    @Schema(title = "DESIGN_GRADE", description = "设计靠泊等级")
    private BigDecimal designGrade;

    @Schema(title = "ACCEPTANCE_GRADE", description = "验收靠泊等级")
    private BigDecimal acceptanceGrade;

    @Schema(title = "DEBALLASTING_GRADE", description = "减载靠泊等级")
    private BigDecimal deballastingGrade;

}
