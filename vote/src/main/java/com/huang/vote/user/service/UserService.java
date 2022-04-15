package com.huang.vote.user.service;

import com.huang.vote.dos.vo.user.User;
import com.huang.vote.user.check.UserCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private static final Logger log = LoggerFactory.getLogger(UserService.class);
  @Autowired UserCheck userCheck;

  // 開始創建
  protected void createUser(User user) {}
}
