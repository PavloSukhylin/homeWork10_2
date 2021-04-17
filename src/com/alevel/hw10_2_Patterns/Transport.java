package com.alevel.hw10_2_Patterns;

public class Transport {

    protected int power;
    protected int widht;
    protected int lenght;
    protected int height;

    public static void main(String[] args) {
        LandTransport landTransport = LandTransport.builder().widht(4).wheelsQuantity(4).build();
        LandTransport landTransport2 = LandTransport.builder().widht(4).wheelsQuantity(4).height(10).lenght(99).build();
        System.out.println(landTransport);
        System.out.println(landTransport2);

    }

}
