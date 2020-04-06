package com.atguigu.gmall.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GmallUserWebApplication {
	private static Logger logger = LoggerFactory.getLogger(GmallUserWebApplication.class);
	public static ApplicationContext applicationContext;
	public static void main(String[] args) {

		SpringApplication.run(GmallUserWebApplication.class, args);
		logger.info("########## 应用启动成功 ###################");
		logger.info("                                                      ");
		logger.info("                    _ooOoo_                           ");
		logger.info("                   o8888888o                          ");
		logger.info("                  88\" . \"88                        ");
		logger.info("                   (| -_- |)                          ");
		logger.info("                    O\\ = /O                          ");
		logger.info("                ____/`---'\\____                      ");
		logger.info("              .   ' \\| |// `.                        ");
		logger.info("               / \\||| : |||// \\                     ");
		logger.info("             / _||||| -:- |||||- \\                   ");
		logger.info("               | | \\\\ - /// | |                     ");
		logger.info("             | \\_| ''\\---/'' | |                    ");
		logger.info("              \\ .-\\__ `-` ___/-. /                  ");
		logger.info("           ___`. .' /--.--\\ `. . __                  ");
		logger.info("        .\"\" '< `.___\\_<|>_/___.' >'\"\".           ");
		logger.info("       | | : `- \\`.;`\\ _ /`;.`/ - ` : | |           ");
		logger.info("         \\ \\ `-. \\_ __\\ /__ _/ .-` / /            ");
		logger.info(" ======`-.____`-.___\\_____/___.-`____.-'======       ");
		logger.info("                    `=---='                           ");
		logger.info("                                                      ");
		logger.info(" ...............................................      ");
		logger.info("################### 应用启动成功 ########################");
	}

}
