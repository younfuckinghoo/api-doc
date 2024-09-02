package com.hy.apidoc.igtos.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(name = "市入市提")
@Data
public class CityFreight {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "CAR_PLATE", description = "车牌号")
    private String carPlate;

    @Schema(title = "FREIGHT_TYPE", description = "类型，1市入；2市提")
    private BigDecimal freightType;

    @Schema(title = "MAX_WEIGHING", description = "最大承载量")
    private BigDecimal maxWeighing;

    @Schema(title = "RELATE_SHIP", description = "关联船舶，SHIP_FORECAST船舶预报")
    private String relateShip;

    @Schema(title = "RELATE_CABIN", description = "关联仓号")
    private String relateCabin;

    @Schema(title = "RELATE_PLAN", description = "关联计划号")
    private String relatePlan;

    @Schema(title = "WEIGHING_NEED", description = "是否需称重，1是；0否")
    private BigDecimal weighingNeed;

    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
    @Schema(title = "EXCEPT_ARRIVE_DATE", description = "预抵时间",defaultValue = "2024-01-01 08:01:59",format =   "YYYY-MM-dd hh:mm:ss")
    private LocalDateTime exceptArriveDate;

    @Schema(title = "MIN_HANDLE_TIME", description = "最小接触时间")
    private BigDecimal minHandleTime;

    @Schema(title = "MAX_WAIT_TIME", description = "最大等待时间")
    private BigDecimal maxWaitTime;

    @Schema(title = "TARGET_WORKING_TIME", description = "目标作业时间")
    private BigDecimal targetWorkingTime;

    @Schema(title = "AVG_WAIT_TIME", description = "平均等待时间")
    private BigDecimal avgWaitTime;

}
