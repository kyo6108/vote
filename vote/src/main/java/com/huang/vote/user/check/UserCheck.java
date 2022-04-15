package com.huang.vote.user.check;

import com.huang.vote.arms.exception.VoteException;
import com.huang.vote.dos.vo.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UserCheck {
  private static final Logger log = LoggerFactory.getLogger(UserCheck.class);

  public Object checkUserInfomation(User user) {
    if (ObjectUtils.isEmpty(user)) {
      log.error("帳號創建資料不可為空值!");
      return Exception.class;
    }

    return null;
  }
  ;
}
