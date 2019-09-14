package com.home.logdemo.controller;


import com.alibaba.fastjson.JSONObject;
import com.home.logdemo.log.Log;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api")
public class RestContorller {

    @Log("查询部门")
    @GetMapping(value = "/rest")
    public JSONObject getReauest(@RequestParam Map<String, Object> paraMap){
        JSONObject obj = new JSONObject();
        obj.put("success",true);
        obj.put("message","操作成功！");
        return obj;
    }

}
