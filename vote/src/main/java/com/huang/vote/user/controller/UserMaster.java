package com.huang.vote.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/api/v1")
public class UserMaster {

  private static final Logger log = LoggerFactory.getLogger(UserMaster.class);

    @PostMapping
    public void createUser(){

    }
}
