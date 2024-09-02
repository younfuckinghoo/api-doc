package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.CityFreight;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.ShipCabin;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("shipCabin")
@Tag(name = "舱口")
@RestController
public class ShipCabinController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<ShipCabin> set(@RequestBody ShipCabin shipCabin){
        return Result.ok(shipCabin,ShipCabin.class);
    }

}
