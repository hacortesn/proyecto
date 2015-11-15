package net.kyo.ruto.social.mentions.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by familia on 14/11/2015.
 */
@RestController
public class PushController {

    @Autowired
    RabbitTemplate template;


    @RequestMapping(value = "/push/send/{message}", method = RequestMethod.GET)
    public ResponseEntity<String> sendMessage(@PathVariable("message") String message) {
        System.out.println(message);
        template.convertAndSend(message);
        return new ResponseEntity<String>("Mensaje enviado", HttpStatus.CREATED);
    }

}
