package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.CraneFeasibleRegion;
import com.hy.apidoc.igtos.entity.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("craneFeasibleRegion")
@Tag(name = "门机行走极限")
@RestController
public class CraneFeasibleRegionController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<CraneFeasibleRegion> set(@RequestBody CraneFeasibleRegion craneFeasibleRegion){
        return Result.ok(craneFeasibleRegion, CraneFeasibleRegion.class);
    }

}
