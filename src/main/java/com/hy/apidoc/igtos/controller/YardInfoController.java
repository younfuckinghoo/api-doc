package com.hy.apidoc.igtos.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.hy.apidoc.igtos.entity.BeltInfo;
import com.hy.apidoc.igtos.entity.Result;
import com.hy.apidoc.igtos.entity.YardInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("yardInfo")
@Tag(name = "库场信息")
@RestController
public class YardInfoController {

    @Operation(summary = "同步数据")
    @ApiOperationSupport(order = 1)
    @PostMapping("set")
    public Result<YardInfo> set(@RequestBody YardInfo yardInfo){
        return Result.ok(yardInfo,YardInfo.class);
    }

}
