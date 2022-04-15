package com.huang.vote.dos.vo.houseHold;

public class HouseHold {
  private Integer houseHold;
  private Integer floor;
  private Integer permission;
  private Long houseHoldAuto;

  public Long getHouseHoldAuto() {
    return houseHoldAuto;
  }

  public void setHouseHoldAuto(Long houseHoldAuto) {
    this.houseHoldAuto = houseHoldAuto;
  }

  public Integer getHouseHold() {
    return houseHold;
  }

  public void setHouseHold(Integer houseHold) {
    this.houseHold = houseHold;
  }

  public Integer getFloor() {
    return floor;
  }

  public void setFloor(Integer floor) {
    this.floor = floor;
  }

  public Integer getPermission() {
    return permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }
}
