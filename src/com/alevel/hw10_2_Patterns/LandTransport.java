package com.alevel.hw10_2_Patterns;

public class LandTransport extends Transport {

    private int wheelsQuantity;

    @Override                                  // для распечатки результатов
    public String toString() {
        return "LandTransport{" +
                "wheelsQuantity=" + wheelsQuantity +
                ", power=" + power +
                ", widht=" + widht +
                ", lenght=" + lenght +
                ", height=" + height +
                '}';
    }

    public static LandTransportBuilder builder() {
        return new LandTransportBuilder();
    }

    private LandTransport() {


    }


    public static class LandTransportBuilder {
        LandTransport landTransport = new LandTransport();


        public LandTransportBuilder power(int power) {
            landTransport.power = power;
            return this;
        }

        public LandTransportBuilder widht(int widht) {
            landTransport.widht = widht;
            return this;
        }

        public LandTransportBuilder lenght(int lenght) {
            landTransport.lenght = lenght;
            return this;
        }

        public LandTransportBuilder height(int height) {
            landTransport.height = height;
            return this;
        }

        public LandTransportBuilder wheelsQuantity(int wheelsQuantity) {
            landTransport.wheelsQuantity = wheelsQuantity;
            return this;
        }

        public LandTransport build() {
            return landTransport;
        }
    }


}
