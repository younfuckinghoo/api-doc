package com.hy.apidoc.igtos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(name = "流程信息")
@Data
public class FlowInfo {
    @Schema(title = "ID", description = "ID")
    private String id;

    @Schema(title = "FLOW_IDX", description = "序号")
    private String flowIdx;

    @Schema(title = "ORIGIN_POINT", description = "起点")
    private String originPoint;

    @Schema(title = "END_POINT", description = "终点")
    private String endPoint;

    @Schema(title = "FLOW_TYPE", description = "流程类型，1卸船流程；2排料流程；3混矿流程；4装车流程；5装船流程")
    private BigDecimal flowType;

    @Schema(title = "FLOW", description = "流程")
    private String flow;

    @Schema(title = "DISTANCE", description = "距离长短（米）")
    private BigDecimal distance;

}
