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
public class Sony implements Mobile{
    private int ramSize;
    private String processor;

    

    public Sony(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
    }

    
}
