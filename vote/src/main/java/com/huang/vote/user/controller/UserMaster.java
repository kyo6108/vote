package com.huang.vote.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.huang.vote.dos.vo.user.User;

@RestController
@RequestMapping("/user/api/v1")
public class UserMaster {

  private static final Logger log = LoggerFactory.getLogger(UserMaster.class);

  /** user點選創建帳號，便開始執行 */
  @PostMapping
  public void createUser(User user) {
    log.info("開始創建user");
  }
}
