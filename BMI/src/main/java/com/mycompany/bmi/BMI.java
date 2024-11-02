package com.mycompany.bmi;

public class BMI {

    double bmi;
    
    void setBmi(double bb, double tb){
        bmi = bb/(tb*tb);
    }
    
    double getBmi(){
        
        if (bmi < 18){
            System.out.println("Berat Terlalu ringan !!!");
            System.out.println("Ayo makan lebih banyak");
        }
        else if(bmi > 18 && bmi <= 24){
            System.out.println("Beratmu Sudah Cukup !!!");
            System.out.println("Pertahankan pola makanmu");
        }
        else if(bmi > 24 && bmi <= 29){
            System.out.println("Beratmu Sedikit Terlalu Tinggi !!!");
            System.out.println("Lakukan diet");
        }
        else if(bmi > 29){
            System.out.println("Parah mennnnn Obesitas ini !!!");
            System.out.println("Olahraga woyyyy");
        }
        
        return bmi;
    };
}