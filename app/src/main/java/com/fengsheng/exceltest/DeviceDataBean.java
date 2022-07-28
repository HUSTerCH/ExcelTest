package com.fengsheng.exceltest;

/**
 * 参考的bean，可以参照这个数据库格式创建一个符合新项目的数据库，之后删掉此类
 */
//@Entity
public class DeviceDataBean {
    private String arresterName;
    private float voltageLevel;
    private int testModeCode;
    private String testMode;
    private int referenceSourceCode;
    private String referenceSource;
    private int referencePhaseCode;
    private String referencePhase;

    public DeviceDataBean(
            String arresterName, float voltageLevel, int testModeCode, String testMode,
            int referenceSourceCode, String referenceSource, int referencePhaseCode,
            String referencePhase) {
        this.arresterName = arresterName;
        this.voltageLevel = voltageLevel;
        this.testModeCode = testModeCode;
        this.testMode = testMode;
        this.referenceSourceCode = referenceSourceCode;
        this.referenceSource = referenceSource;
        this.referencePhaseCode = referencePhaseCode;
        this.referencePhase = referencePhase;
    }

    public String getArresterName() {
        return arresterName;
    }

    public void setArresterName(String arresterName) {
        this.arresterName = arresterName;
    }

    public float getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(float voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public int getTestModeCode() {
        return testModeCode;
    }

    public void setTestModeCode(int testModeCode) {
        this.testModeCode = testModeCode;
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode;
    }

    public int getReferenceSourceCode() {
        return referenceSourceCode;
    }

    public void setReferenceSourceCode(int referenceSourceCode) {
        this.referenceSourceCode = referenceSourceCode;
    }

    public String getReferenceSource() {
        return referenceSource;
    }

    public void setReferenceSource(String referenceSource) {
        this.referenceSource = referenceSource;
    }

    public int getReferencePhaseCode() {
        return referencePhaseCode;
    }

    public void setReferencePhaseCode(int referencePhaseCode) {
        this.referencePhaseCode = referencePhaseCode;
    }

    public String getReferencePhase() {
        return referencePhase;
    }

    public void setReferencePhase(String referencePhase) {
        this.referencePhase = referencePhase;
    }
}
