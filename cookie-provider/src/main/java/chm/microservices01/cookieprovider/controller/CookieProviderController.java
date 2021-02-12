package chm.microservices01.cookieprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieProviderController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/free-cookies")
    public String getCookie() {
        return "Here, have a cookie from " + port;
    }
}
