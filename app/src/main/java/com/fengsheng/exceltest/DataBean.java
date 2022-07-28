package com.fengsheng.exceltest;

public class DataBean {
    private String arresterName;
    private float voltageLevel;
    private int testModeCode;
    private String testMode;
    private int referenceSourceCode;
    private String referenceSource;
    private int referencePhaseCode;
    private String referencePhase;

    private float[] allCurrent = new float[3];
    private float[] resistiveCurrent = new float[3];
    private float[] capacitiveCurrent = new float[3];
    private float[] angle = new float[3];
    private float[] lossPower = new float[3];
    private float[] capacity = new float[3];
    private float[] threeTimesHarmonic = new float[3];
    private float[] threeTimesHarmonicAngle = new float[3];
    private float[] fiveTimesHarmonic = new float[3];
    private float[] sevenTimesHarmonic = new float[3];

    private float temperature;
    private float frequency;
    private float aReferenceVoltage;
    private float aReferenceVoltageHarmonic;

    public DataBean(String arresterName, float voltageLevel, int testModeCode, String testMode,
                    int referenceSourceCode, String referenceSource, int referencePhaseCode,
                    String referencePhase, float[] allCurrent, float[] resistiveCurrent,
                    float[] capacitiveCurrent, float[] angle, float[] lossPower, float[] capacity,
                    float[] threeTimesHarmonic, float[] threeTimesHarmonicAngle, float[] fiveTimesHarmonic,
                    float[] sevenTimesHarmonic, float temperature, float frequency, float aReferenceVoltage,
                    float aReferenceVoltageHarmonic) {
        this.arresterName = arresterName;
        this.voltageLevel = voltageLevel;
        this.testModeCode = testModeCode;
        this.testMode = testMode;
        this.referenceSourceCode = referenceSourceCode;
        this.referenceSource = referenceSource;
        this.referencePhaseCode = referencePhaseCode;
        this.referencePhase = referencePhase;
        this.allCurrent = allCurrent;
        this.resistiveCurrent = resistiveCurrent;
        this.capacitiveCurrent = capacitiveCurrent;
        this.angle = angle;
        this.lossPower = lossPower;
        this.capacity = capacity;
        this.threeTimesHarmonic = threeTimesHarmonic;
        this.threeTimesHarmonicAngle = threeTimesHarmonicAngle;
        this.fiveTimesHarmonic = fiveTimesHarmonic;
        this.sevenTimesHarmonic = sevenTimesHarmonic;
        this.temperature = temperature;
        this.frequency = frequency;
        this.aReferenceVoltage = aReferenceVoltage;
        this.aReferenceVoltageHarmonic = aReferenceVoltageHarmonic;
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

    public float[] getAllCurrent() {
        return allCurrent;
    }

    public void setAllCurrent(float[] allCurrent) {
        this.allCurrent = allCurrent;
    }

    public float[] getResistiveCurrent() {
        return resistiveCurrent;
    }

    public void setResistiveCurrent(float[] resistiveCurrent) {
        this.resistiveCurrent = resistiveCurrent;
    }

    public float[] getCapacitiveCurrent() {
        return capacitiveCurrent;
    }

    public void setCapacitiveCurrent(float[] capacitiveCurrent) {
        this.capacitiveCurrent = capacitiveCurrent;
    }

    public float[] getAngle() {
        return angle;
    }

    public void setAngle(float[] angle) {
        this.angle = angle;
    }

    public float[] getLossPower() {
        return lossPower;
    }

    public void setLossPower(float[] lossPower) {
        this.lossPower = lossPower;
    }

    public float[] getCapacity() {
        return capacity;
    }

    public void setCapacity(float[] capacity) {
        this.capacity = capacity;
    }

    public float[] getThreeTimesHarmonic() {
        return threeTimesHarmonic;
    }

    public void setThreeTimesHarmonic(float[] threeTimesHarmonic) {
        this.threeTimesHarmonic = threeTimesHarmonic;
    }

    public float[] getThreeTimesHarmonicAngle() {
        return threeTimesHarmonicAngle;
    }

    public void setThreeTimesHarmonicAngle(float[] threeTimesHarmonicAngle) {
        this.threeTimesHarmonicAngle = threeTimesHarmonicAngle;
    }

    public float[] getFiveTimesHarmonic() {
        return fiveTimesHarmonic;
    }

    public void setFiveTimesHarmonic(float[] fiveTimesHarmonic) {
        this.fiveTimesHarmonic = fiveTimesHarmonic;
    }

    public float[] getSevenTimesHarmonic() {
        return sevenTimesHarmonic;
    }

    public void setSevenTimesHarmonic(float[] sevenTimesHarmonic) {
        this.sevenTimesHarmonic = sevenTimesHarmonic;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getaReferenceVoltage() {
        return aReferenceVoltage;
    }

    public void setaReferenceVoltage(float aReferenceVoltage) {
        this.aReferenceVoltage = aReferenceVoltage;
    }

    public float getaReferenceVoltageHarmonic() {
        return aReferenceVoltageHarmonic;
    }

    public void setaReferenceVoltageHarmonic(float aReferenceVoltageHarmonic) {
        this.aReferenceVoltageHarmonic = aReferenceVoltageHarmonic;
    }
}
