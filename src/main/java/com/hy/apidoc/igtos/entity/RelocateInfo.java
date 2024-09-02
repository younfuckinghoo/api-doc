package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
@Schema(name = "搬倒数据")
@Data
public class RelocateInfo {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "ORIGIN_POINT", description = "起点")
    private String originPoint;

    @Schema(title = "END_POINT", description = "终点")
    private String endPoint;

    @Schema(title = "DISTANCE", description = "单程距离（km）")
    private String distance;

    @Schema(title = "REMARK", description = "备注")
    private String remark;

    @Schema(title = "LOAD_UNLOAD_DURATION", description = "装+卸车时间")
    private BigDecimal loadUnloadDuration;

    @Schema(title = "ROUND_DURATION", description = "往返行车时间(分钟) 平均时速20KM/H")
    private String roundDuration;

    @Schema(title = "RUNNING_DURATION", description = "运行总时长 不过磅/过磅")
    private String runningDuration;

    @Schema(title = "TIMES_PER_SHIFT", description = "单班运行趟数 10.5小时(630分钟) 不过磅/过磅")
    private String timesPerShift;

    @Schema(title = "WITH_WEIGHING", description = "作业吨数 不过磅 矿/铝/煤 60/47/27")
    private String withWeighing;

    @Schema(title = "WITHOUT_WEIGHING", description = "作业吨数 过磅 矿/铝/煤 60/47/27")
    private String withoutWeighing;

}
