package com.huang.vote.arms.exception;

public class VoteException extends Exception {

  private String errMsg;

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  public void addErrMsg(String errMsg) {

    this.errMsg = errMsg;
  }
}
