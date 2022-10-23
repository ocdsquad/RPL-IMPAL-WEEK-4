/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl.impal.minggu.pkg4;

/**
 *
 * @author assan
 */
public class no2 {
    public void hitungFee(int comp_amount){
        double base_fee;
        double additional_fee;
        
        if(comp_amount==1||comp_amount == 2){
            base_fee = 50;
            additional_fee=0;
            
        }else if(comp_amount>=3&&comp_amount<= 10){
            base_fee = 100;
            additional_fee = 10;
        }else if(comp_amount>10){
            base_fee=500;
            additional_fee = 10;
            
        }
        
        if(!contains(service_time, business_hour)) base_fee *= base_fee;
        if(willDropOff(costumer)&&willPickUp(customer)) base_fee = base_fee -(base_fee*0.5);
        
    }
}
