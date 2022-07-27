package com.fengsheng.exceltest;

/**
 * 参考的bean，可以参照这个数据库格式创建一个符合新项目的数据库，之后删掉此类
 */
//@Entity
public class DeviceDataBean {
    //    @Id(autoincrement = true)
    private Long id;

    //    @Index()
    private String situation;
    private String date;
    private int deviceNum;
    private int identity;
    private float temperature;
    private int power;
    private int distance;
    private int voltageLevel;

    //    @Generated(hash = 1569667546)
    public DeviceDataBean(Long id, String situation, String date, int deviceNum, int identity, float temperature,
                          int power, int distance, int voltageLevel) {
        this.id = id;
        this.situation = situation;
        this.date = date;
        this.deviceNum = deviceNum;
        this.identity = identity;
        this.temperature = temperature;
        this.power = power;
        this.distance = distance;
        this.voltageLevel = voltageLevel;
    }

    //    @Generated(hash = 475741313)
    public DeviceDataBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(int deviceNum) {
        this.deviceNum = deviceNum;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(int voltageLevel) {
        this.voltageLevel = voltageLevel;
    }
}
