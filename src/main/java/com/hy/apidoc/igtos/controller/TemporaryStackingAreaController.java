package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BeltInfo;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.TemporaryStackingArea;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("temporaryStackingArea")
@Tag(name = "临时堆放区")
@RestController
public class TemporaryStackingAreaController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<TemporaryStackingArea> set(@RequestBody TemporaryStackingArea temporaryStackingArea){
        return Result.ok(temporaryStackingArea,TemporaryStackingArea.class);
    }

}
