package com.hzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzit.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller

public class MainController {
    @Autowired
    private UploadService uploadService;
    @RequestMapping("query")
    public String query() {
        return "main";
    }

    @RequestMapping(value="product/upload" ,method= RequestMethod.POST)
    @ResponseBody
    public String pictureUpload(@RequestParam(value = "files") MultipartFile[] uploadFile) {
        long begin = System.currentTimeMillis();
        System.out.println(uploadFile.length);
        String json = "";
        try {
            Map result=new HashMap();
            for(MultipartFile f: uploadFile){
              result = uploadService.uploadPicture(f);
            }
            // 浏览器擅长处理json格式的字符串，为了减少因为浏览器内核不同导致的bug，建议用json
            json = new ObjectMapper().writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
       // log.info("定时任务结束，共耗时：[" + (end - begin) + "]毫秒");
        return json;

// git commit 提交到本地分支   push 推动远程分支      在git提交的时候 默认commit and pusth  如果commit成功le
//但是远程仓库没有，这是要手动push
    }
    @RequestMapping("product/add")
    public String addProduct(){
      return "addProduct";
    }
}