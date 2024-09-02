package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.CityFreight;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.ShipForecast;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("cityFreight")
@Tag(name = "市入市提")
@RestController
public class CityFreightController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<CityFreight> set(@RequestBody CityFreight cityFreight){
        return Result.ok(cityFreight,CityFreight.class);
    }

}
