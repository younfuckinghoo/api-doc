package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Schema(name = "堆场信息")
@Data
public class YardInfo {
    @Schema(title = "ID", description = "ID")
    private String id;


    @Schema(title = "YARD_NAME", description = "堆场")
    private String yardName;

    @Schema(title = "LOCATION_NO", description = "库位")
    private String locationNo;

    @Schema(title = "BOUNDED", description = "是否保税，1是；0否")
    private BigDecimal bounded;

    @Schema(title = "FLOWABLE", description = "是否流程，1是；0否")
    private BigDecimal flowable;

    @Schema(title = "UNFLOWABLE", description = "是否非流程，1是；0否")
    private BigDecimal unflowable;

    @Schema(title = "CARGO_MACHINE", description = "堆取料机，MACHINE_INFO机械设备信息!A1")
    private String cargoMachine;

    @Schema(title = "LENGTH", description = "长")
    private BigDecimal length;

    @Schema(title = "WIDTH", description = "宽")
    private BigDecimal width;

    @Schema(title = "AREA", description = "面积")
    private BigDecimal area;

    @Schema(title = "CAPACITY", description = "容量(万吨)")
    private BigDecimal capacity;

    @Schema(title = "YARD_TYPE", description = "堆场类型，1：前方堆场；2：外围堆场")
    private BigDecimal yardType;

    @Schema(title = "LOCATION_AREA", description = "库区")
    private String locationArea;

    @Schema(title = "LOCATION_COORDINATE", description = "地理位置，可按照特定格式拆解")
    private List<LocationCoordinate> locationCoordinate;

    @Schema(title = "COORDINATE_COLLECTION", description = "坐标顺集，可按照特定格式拆解")
    private List<LocationCoordinate> coordinateCollection;

    @Schema(title = "DEVIATION", description = "误差值")
    private BigDecimal deviation;

    @Schema(title = "RELOCATABLE", description = "搬倒标记，1是；0否")
    private BigDecimal relocatable;

}
