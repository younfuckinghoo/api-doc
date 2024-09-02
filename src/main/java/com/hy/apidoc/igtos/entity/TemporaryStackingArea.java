package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
@Schema(name = "临时堆放区")
@Data
public class TemporaryStackingArea {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "BELONG_PLACE", description = "归属位置")
    private String belongPlace;

    @Schema(title = "AVAILABLE_RANGE", description = "可用范围")
    private String availableRange;

    @Schema(title = "LENGTH", description = "长度")
    private BigDecimal length;

    @Schema(title = "WIDTH", description = "宽度")
    private BigDecimal width;

    @Schema(title = "HEIGHT_LIMIT", description = "限高")
    private BigDecimal heightLimit;

    @Schema(title = "TIME_LIMIT", description = "限放时间")
    private BigDecimal timeLimit;

    @Schema(title = "AVAILABLE", description = "可用标记")
    private BigDecimal available;

    @Schema(title = "STOPPED", description = "停用标记")
    private BigDecimal stopped;

}
