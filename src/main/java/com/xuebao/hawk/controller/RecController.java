package com.xuebao.hawk.controller;

import com.xuebao.hawk.model.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecController {

    @RequestMapping("/rec/st_mico")
    public ResultModel cmdTestRequest(String st){
        ResultModel resultModel =  new ResultModel(false,"test");
        System.out.println("Getting st is : "+ st);

        resultModel.setSuccess(true);
        resultModel.setMessage("GoodJob");
        return  resultModel;

    }

    @RequestMapping("/rec/ij_did")
    public ResultModel cmdDidRequest(String did){
        ResultModel resultModel =  new ResultModel(false,"test");
        System.out.println("Getting did is : "+ did);

        resultModel.setSuccess(true);
        resultModel.setMessage("GoodJob");
        return  resultModel;

    }
}
