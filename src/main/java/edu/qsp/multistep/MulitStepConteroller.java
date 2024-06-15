package edu.qsp.multistep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MulitStepConteroller {
    @GetMapping("/")
    public String getMethodName() {
        
        return  "hello";
    }
    
}
