package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest;

@RestController
@RequestMapping("/headers")
public class HeaderController{
    @GetMapping("/")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return "Host name: "+headers.getHost().getHostName()
                +" Host port: "+ headers.getHost().getPort();
    }
}