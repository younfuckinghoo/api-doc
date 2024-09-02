package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BeltInfo;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.StackingPosition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("stackingPosition")
@Tag(name = "垛位信息")
@RestController
public class StackingPositionController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<StackingPosition> set(@RequestBody StackingPosition stackingPosition){
        return Result.ok(stackingPosition,StackingPosition.class);
    }

}
