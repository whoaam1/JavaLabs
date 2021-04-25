package com.company;

public class Squeezer{

    private static double weight;

    private String name;
    private int maxNumber;
    private int volume;
    private String color;
    private int power;

    private String producer;
    private int noiseLevel;
    private double cordLength;
    private String bodyMaterial;
    private int voltage;

    protected int height;
    protected int width;

    public Squeezer(){
        this(null, 0, 0, null, 0, null, 0, 0,
                null, 0, 0, 0);
    }

    public Squeezer(String name, int maxNumber, int volume, String color, int power,
                  String producer, int noiseLevel, double cordLength, String bodyMaterial,
                  int voltage, int height, int width) {

        setValues(name, maxNumber, volume, color, power, producer, noiseLevel, cordLength,
                bodyMaterial, voltage, height, width);
    }


    public Squeezer(String name, int maxNumber, int volume, String color){
        this(name, maxNumber, volume, color, 0, null, 0, 0,
                null, 0, 0, 0);
    }


    private void setValues(String name, int maxNumber, int volume, String color, int power,
                           String producer, int noiseLevel, double cordLength, String bodyMaterial,
                           int voltage, int height, int width){
        this.name = name;
        this.maxNumber = maxNumber;
        this.volume = volume;
        this.color = color;
        this.power = power;
        this.producer = producer;
        this.noiseLevel = noiseLevel;
        this.cordLength = cordLength;
        this.bodyMaterial = bodyMaterial;
        this.voltage = voltage;
        this.height = height;
        this.width = width;
    }


    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Squeezer.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Squeezer" + '\n' +
                "name = '" + name + '\'' + '\n' +
                "maxNumber = " + maxNumber + '\n' +
                "volume = " + volume + '\n' +
                "color = '" + color + '\'' + '\n' +
                "power = " + power + '\n' +
                "producer = '" + producer + '\'' + '\n' +
                "noiseLevel = " + noiseLevel + '\n' +
                "cordLength = " + cordLength + '\n' +
                "bodyMaterial = '" + bodyMaterial + '\'' + '\n' +
                "voltage = " + voltage + '\n' +
                "height = " + height + '\n' +
                "width = " + width + '\n'
                ;
    }

    public static void printStaticWeight(){
        System.out.println("Squeezer's weight is:  " + weight);
    }


    public void printWeight() {
        System.out.println("Squeezer's weight is:  " + weight);
    }


    public void resetValues(String name, int maxNumber, int volume, String color, int power,
                            String producer, int noiseLevel, double cordLength, String bodyMaterial,
                            int voltage, int height, int width){

        setValues(name, maxNumber, volume, color, power, producer, noiseLevel, cordLength,
                bodyMaterial, voltage, height, width);

    }
}