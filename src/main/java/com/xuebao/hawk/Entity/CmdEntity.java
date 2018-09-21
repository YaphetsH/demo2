package com.xuebao.hawk.Entity;

public class CmdEntity {
    private String cmd;
    private int code;

    public CmdEntity(String cmd, int code) {
        this.cmd = cmd;
        this.code = code;
    }

    public CmdEntity() {
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CmdEntity{" +
                "cmd='" + cmd + '\'' +
                ", code=" + code +
                '}';
    }
}
