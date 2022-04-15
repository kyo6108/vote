package com.huang.vote.dos.vo.fee;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ManagementFee {
  // 戶號流水
  private Long houseHoldAuto;
  private Bool isPay;
  private Integer year;
  private Integer date;
  private Long userAuto;
  private Long updateUser;
  private String lastUpdateBy;

  public Long getHouseHoldAuto() {
    return houseHoldAuto;
  }

  public void setHouseHoldAuto(Long houseHoldAuto) {
    this.houseHoldAuto = houseHoldAuto;
  }

  public Bool getIsPay() {
    return isPay;
  }

  public void setIsPay(Bool isPay) {
    this.isPay = isPay;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public Long getUserAuto() {
    return userAuto;
  }

  public void setUserAuto(Long userAuto) {
    this.userAuto = userAuto;
  }

  public Long getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(Long updateUser) {
    this.updateUser = updateUser;
  }

  public String getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(String lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }
}
