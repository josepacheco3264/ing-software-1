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
public class Iphone implements Mobile{
    
    private int ramSize;
    private String processor;
    private String GPU;

    public Iphone(int ramSize, String processor, String GPU) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
    }

    
    
}
