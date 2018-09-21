package com.xuebao.hawk.hawkeye;

import com.xuebao.hawk.config.TcpConf;
import com.xuebao.hawk.utils.TcpUtils;

public class DispatcherCmd {
    private  String action;
    private int code;
    public DispatcherCmd(String action,int code){

        this.action = action;
        this.code = code;

    }




    public void doAction(){
        switch (this.code)
        {
            case 0:
                if(this.action.equals("On")) {
                    System.out.println(this.code);
                    TcpConf.tcp.initConnect();
                }
                break;
            case 1:
                String msg = TcpConf.tcp.receiveMessage();
                System.out.println(msg);
                break;
            case 2:
                actionWithCmd(this.action);
                System.out.println(this.action);
                break;
            case -1:
                if(this.action.equals("Off")) {
                    TcpConf.tcp.closeConnect();
                }
                break;

        }
    }


    private void actionWithCmd(String cmd){
        TcpConf.tcp.sendMessage(cmd);

    }
}
