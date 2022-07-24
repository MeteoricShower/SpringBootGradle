package control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    String sayHallo(){
        return "HelloWorld";
    }
}
