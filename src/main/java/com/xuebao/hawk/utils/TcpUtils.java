package com.xuebao.hawk.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpUtils {
    private ServerSocket serverSocket;
    private Socket socket;
    private int port;
    private  DataInputStream in;
    private DataOutputStream out;

    public TcpUtils(int port) {
        try {
            this.port = port;
            this.serverSocket = new ServerSocket(this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initConnect() {
        try {
            this.socket = this.serverSocket.accept();
            this.out = new DataOutputStream(this.socket.getOutputStream());
            this.in = new DataInputStream(this.socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg){
        try {
            this.out.writeUTF(msg);
            this.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void closeConnect(){
        try {
            this.out.close();
            this.in.close();
            this.socket.shutdownInput();
            this.socket.close();
            this.serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  String receiveMessage(){
        String msg = "";
        try {
            msg = this.in.readUTF();
            return  msg;
        } catch (IOException e) {
            e.printStackTrace();
            return msg;
        }


    }
}



