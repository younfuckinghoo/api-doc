package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "机械设备")
@Data
public class MachineInfo {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "MACHINE_NO", description = "机械编号")
    private String machineNo;

    @Schema(title = "MACHINE_TYPE", description = "机械类型")
    private String machineType;

    @Schema(title = "WORKING_RANGE", description = "作业范围")
    private String workingRange;

    @Schema(title = "POWER", description = "额定功率")
    private BigDecimal power;

    @Schema(title = "PILE_EFFICIENCY", description = "堆料效率")
    private BigDecimal pileEfficiency;

    @Schema(title = "EXTRACT_EFFICIENCY", description = "取料效率")
    private BigDecimal extractEfficiency;

    @Schema(title = "CAR_PER_CIRCULATION", description = "每循环翻车节数")
    private Integer carPerCirculation;

    @Schema(title = "WORK_FREQUENCY", description = "作业频率")
    private BigDecimal workFrequency;

    @Schema(title = "ADJUSTABLE", description = "是否可调节，1是；0否")
    private BigDecimal adjustable;

    @Schema(title = "ADJUST_RANGE", description = "调节范围")
    private String adjustRange;

    @Schema(title = "BELT_LENGTH", description = "皮带长度")
    private BigDecimal beltLength;

    @Schema(title = "BELT_VELOCITY", description = "带速")
    private BigDecimal beltVelocity;

}
