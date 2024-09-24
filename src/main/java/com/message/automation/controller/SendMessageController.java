package com.message.automation.controller;

import com.message.automation.model.EmailModel;
import com.message.automation.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/message")
public class SendMessageController {

    @Autowired
    public SendMessageService sendMessageService;

    @PostMapping("/mailSender")
    public String sendMail(@RequestBody EmailModel emailModel){

        sendMessageService.sendMail(emailModel.getReceiver(), emailModel.getAbout(), emailModel.getMessage());

            emailModel.setResponseMessage("Mensagem enviada com sucesso!");

            return String.valueOf(new ResponseEntity<>(emailModel, HttpStatus.OK));
        }
    }

