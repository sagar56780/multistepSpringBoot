package edu.qsp.multistep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qsp.multistep.model.UserInfo;
import edu.qsp.multistep.service.InsertUserInfoService;



@CrossOrigin(origins = "http://localhost:3000")  // Enable CORS for React app
@RestController
public class InsertUserInfoController {
    @Autowired
    InsertUserInfoService insertuserInfoService;

    @PostMapping("/insertUserInfo")
    public String putMethodName(@RequestBody UserInfo entity) {
    
        if( insertuserInfoService.createUser(entity))
        {   
            return "data entered sucussfully";

        }
        else{
            return "something  went worong";
        }
       
    }
    @PostMapping("/")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        //  return entity;
        return "full nigh";
       
    }
    

    
}
