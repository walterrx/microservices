package br.com.walterrx.sleuthclient.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello")
public class SleuthAPI {

    private static Logger LOGGER = LoggerFactory.getLogger(SleuthAPI.class);

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/client")
    public String hello(){
        //log.info("Manipulando a home !");

        LOGGER.info ("Antes de chamar o server ");

        String response =   restTemplate.getForObject("http://localhost:8081/rest/hello/server", String.class);

        LOGGER.info("Depois de chamar o server");

        return response ;


}

}
