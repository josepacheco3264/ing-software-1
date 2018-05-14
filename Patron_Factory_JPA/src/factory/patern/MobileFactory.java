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
public class MobileFactory {
    
    
    public static Mobile createMobile(String type){
        if (type.equals(Mobile.IPHONE)) {
            return new Iphone(2, "A9", "A9 GPU");
        } else if(type.equals(Mobile.SONY)){
            return new Sony(2, "ARM");
        }else if(type.equals(Mobile.SAMSUNG)){
            return new Samsung("Intel");
        }else if(type.equals(Mobile.HUAWUEI)){
            return new Huawei(3, "AMD", " G6 AMD");
        }else if(type.equals(Mobile.XIAOMI)){
            return new Xiaomi(4, "SnapDragon", " 410 GPU");
        }else if(type.equals(Mobile.UMI)){
            return new UMI(3, "Intel", "A15 GPU");
        }else{
            return null;
        }
    }

}
