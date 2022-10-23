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
public class no1 {
    void telkomServis(String a){
        if(a=="*364#")buyquota();
        else if(a=="*858#")pulsaTransfer();
        else if(a=="*888#")checkPulsa();
    }
}
