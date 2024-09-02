package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BerthInfo;
import com.hy.apidoc.igtos.entity.CargoType;
import com.hy.apidoc.igtos.entity.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("cargoType")
@Tag(name = "货种")
@RestController
public class CargoTypeController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<CargoType> set(@RequestBody CargoType cargoType){
        return Result.ok(cargoType,CargoType.class);
    }

}
