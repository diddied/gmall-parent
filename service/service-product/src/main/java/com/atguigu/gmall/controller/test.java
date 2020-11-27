package com.atguigu.gmall.controller;

import com.atguigu.gmall.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pbc
 * @Description:
 * @date 2020/11/27 18:07
 */

//@RequestMapping("service/product")
@RequestMapping("admin/product")
@RestController
public class test {

    @GetMapping("getCategory1")
    public Result<Object> getResult(){
        return Result.ok();
    }

}
