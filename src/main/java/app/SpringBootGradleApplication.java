package app;

import control.CityController;
import control.HelloController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan(basePackages = {"service","control"})
@MapperScan("mapper")
public class SpringBootGradleApplication {
    @Resource
    private HelloController helloController; //程序启动自动注入HelloController，处理用户的Web请求
    @Resource
    private CityController cityController;//程序启动自动注入cityController，处理用户的Web请求
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleApplication.class, args);
    }

}
