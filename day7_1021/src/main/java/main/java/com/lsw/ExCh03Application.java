package main.java.com.lsw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = { "com.skc.demo", "com.skc.mybatis", "com.skc.ex_thymleaf" })
@MapperScan("main.java.com.lsw.mybatis.mapper")
@SpringBootApplication
public class ExCh03Application {

	public static void main(String[] args) {
		SpringApplication.run(ExCh03Application.class, args);
	}

}
