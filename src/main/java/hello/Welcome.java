package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/")
    public String welcome_msg(){
        return "Hello Dude : ) ";
    }
}
