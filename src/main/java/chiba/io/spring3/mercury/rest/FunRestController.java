package chiba.io.spring3.mercury.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String helloWorld(){
        return "hello Chiba.";
    }

}
