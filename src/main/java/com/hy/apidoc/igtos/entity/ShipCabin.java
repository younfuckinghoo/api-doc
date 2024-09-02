package com.hy.apidoc.igtos.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(name = "舱口")
@Data
public class ShipCabin {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "SHIP_ID", description = "船舶ID，用于标识特定的船只")
    private String shipId;

    @Schema(title = "CABIN_NO", description = "舱口号，用于指示货物的装载位置")
    private String cabinNo;

    @Schema(title = "CARGO_NAME", description = "货名，用于描述货物的名称，货种信息-货种名称")
    private String cargoName;

    @Schema(title = "CARGO_NAME_IN", description = "上港货种，用于指示货物的来源地，货种信息-货种名称")
    private String cargoNameIn;

    @Schema(title = "MIDDLE_DRAFT", description = "中间水尺，用于测量货物的装载高度")
    private String middleDraft;

}
