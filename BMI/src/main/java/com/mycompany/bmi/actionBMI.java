package com.mycompany.bmi;

public class actionBMI {
    
    public static void main(String[] args) {
        BMI bmiKu = new BMI();
        bmiKu.setBmi(53, 1.60);
        System.out.println("BMI anda adalah " + Math.round(bmiKu.getBmi()));
    }
    
}