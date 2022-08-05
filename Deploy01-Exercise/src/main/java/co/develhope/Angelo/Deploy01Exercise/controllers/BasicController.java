package co.develhope.Angelo.Deploy01Exercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    //get devName variable from application.yml
    @Value("${myCustomVarTree.devName}")
    String myCustomVar;

    //method that return a property devName
    @GetMapping("/dev-name")
    public String mainEndpoint(){
        String var = environment.getProperty("myCustomVarTree.devName");
        return var;
    }

    //another method that return a property devName
    @GetMapping("/other-dev-name")
    public String mainEndpointII(){
        return myCustomVar;
    }

}
