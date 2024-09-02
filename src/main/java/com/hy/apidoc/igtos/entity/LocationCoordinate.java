package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "位置坐标")
@Data
public class LocationCoordinate {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "LONGITUDE", description = "经度")
    private String longitude;

    @Schema(title = "LATITUDE", description = "纬度")
    private String latitude;

    @Schema(title = "LOCATION_NO", description = "关联库位")
    private String locationNo;

    @Schema(title = "ORDER", description = "顺序")
    private Integer order;

}
