package com.xuebao.hawk;

import com.xuebao.hawk.config.TcpConf;
import com.xuebao.hawk.utils.TcpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HawkApplication {

	public static void main(String[] args) {
		TcpConf.tcp = new TcpUtils(12345);
		SpringApplication.run(HawkApplication.class, args);
	}
}
