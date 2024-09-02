package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(name = "垛位数据")
@Data
public class StackingPosition {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "STACKING_NO", description = "垛位号")
    private String stackingNo;

    @Schema(title = "AMOUNT", description = "堆存量")
    private BigDecimal amount;

    @Schema(title = "CARGO_NAME", description = "货种，CARGO_TYPE货种!A1")
    private String cargoName;

    @Schema(title = "CARGO_OWNER", description = "货主")
    private String cargoOwner;

    @Schema(title = "SOURCE", description = "来源")
    private String source;

    @Schema(title = "DIRECTION", description = "流向")
    private String direction;

    @Schema(title = "POSITION", description = "地理位置")
    private String position;

    @Schema(title = "SHIP_NO", description = "关联船舶，SHIP_FORECAST船舶预报!A1")
    private Integer shipNo;

    @Schema(title = "MAX_FLAG", description = "上限标记，1是；0否")
    private BigDecimal maxFlag;

    @Schema(title = "THEORETICAL_HEIGHT", description = "理论上限")
    private BigDecimal theoreticalHeight;

    @Schema(title = "CURRENT_HEIGHT", description = "当前高度")
    private BigDecimal currentHeight;

    @Schema(title = "HEIGHT_LIMIT", description = "限高")
    private BigDecimal heightLimit;

    @Schema(title = "CONBINE_FLAG", description = "合垛标记，1是；0否")
    private BigDecimal conbineFlag;

    @Schema(title = "IN_TIME", description = "堆存时间")
    private LocalDateTime inTime;

    @Schema(title = "PLAN_OUT_TIME", description = "预计出库时间")
    private LocalDateTime planOutTime;

}
