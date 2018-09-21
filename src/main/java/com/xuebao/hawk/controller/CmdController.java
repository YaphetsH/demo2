package com.xuebao.hawk.controller;

import com.xuebao.hawk.Entity.CmdEntity;
import com.xuebao.hawk.config.TcpConf;
import com.xuebao.hawk.hawkeye.DispatcherCmd;
import com.xuebao.hawk.model.ResultModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class CmdController {

    @RequestMapping("/cmd/test")
    public ResultModel cmdTestRequest(){

        ResultModel resultModel =  new ResultModel(false,"test");
        System.out.println("=====================  starting cmd test  =======================");
        resultModel.setSuccess(true);
        resultModel.setMessage("GoodJob");
        return  resultModel;

    }



    @PostMapping(value="/cmd_action")
    public ResultModel cmdDispatchRequest(@RequestBody CmdEntity cmdEntity){

        ResultModel resultModel =  new ResultModel(false,"test");
        int code = cmdEntity.getCode();
        String cmd = cmdEntity.getCmd();
        DispatcherCmd dispatcherCmd = new DispatcherCmd(cmd,code);
        dispatcherCmd.doAction();
        resultModel.setSuccess(true);
        resultModel.setMessage("GoodJob");
        return  resultModel;

    }



}
