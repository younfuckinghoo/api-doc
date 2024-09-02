package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BeltInfo;
import com.hy.apidoc.igtos.entity.RelocateInfo;
import com.hy.apidoc.igtos.entity.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("relocateInfo")
@Tag(name = "搬倒数据")
@RestController
public class RelocateInfoController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<RelocateInfo> set(@RequestBody RelocateInfo relocateInfo){
        return Result.ok(relocateInfo,RelocateInfo.class);
    }

}
