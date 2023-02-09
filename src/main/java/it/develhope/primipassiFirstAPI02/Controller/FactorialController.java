package it.develhope.primipassiFirstAPI02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping(value = "/{n}")
    public Integer getFactorial(@PathVariable(required = false) int n){
        int ris = 1;
        for (int i = 1; i <= n; i++){
            ris = ris*i;
        }
        return ris;
    }
}
