package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.ShipForecast;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RequestMapping("shipForecast")
@Tag(name = "船舶预报")
@RestController
public class ShipForecastController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<ShipForecast> set(@RequestBody ShipForecast shipForecast){
        shipForecast.setShipName("first immortal");
        return Result.ok(shipForecast,ShipForecast.class);
    }

}
