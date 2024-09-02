package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BerthInfo;
import com.hy.apidoc.igtos.entity.CityFreight;
import com.hy.apidoc.igtos.entity.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("berthInfo")
@Tag(name = "泊位信息")
@RestController
public class BerthInfoController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<BerthInfo> set(@RequestBody BerthInfo berthInfo){
        return Result.ok(berthInfo,BerthInfo.class);
    }

}
