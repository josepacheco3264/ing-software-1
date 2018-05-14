/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.patern;

/**
 *
 * @author J-ALS
 */
public class Samsung implements Mobile{
    private int ramSize;
    private String processor;
    public String name =   Mobile.SAMSUNG;

    public Samsung(int ramSize) {
        this.ramSize    =   ramSize;
    }
    
    public Samsung(String processor){
        this.processor  =   processor;
        this.ramSize    =   2;
    }

}
