package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
@Schema(name = "转运楼")
@Data
public class TransferTower {
    @Schema(title = "ID", description = "ID")
    private String id;



    @Schema(title = "BELT_IN", description = "输入皮带，BELT_INFO皮带信息!A1")
    private String beltIn;

    @Schema(title = "TOWER_NAME", description = "转运楼名称")
    private String towerName;

    @Schema(title = "TOWER_NO", description = "转运楼编号")
    private String towerNo;

    @Schema(title = "BELT_OUT", description = "输出皮带，BELT_INFO皮带信息!A1")
    private String beltOut;

}
