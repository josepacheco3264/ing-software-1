/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.patern;

import javax.swing.JOptionPane;

/**
 *
 * @author J-ALS
 */
public class Principal {

    public static void main(String[] args) {

        Mobile mobile = MobileFactory.createMobile(Mobile.IPHONE);
        JOptionPane.showMessageDialog(null, "Su dispositivo tiene las siguientes caracteristicas: "
                + "\n" + mobile.SAMSUNG
                + "\n" + mobile.IPHONE
                + "\n" + mobile.SONY
                + "\n" + mobile.HUAWUEI
                + "\n" + mobile.XIAOMI
                + "\n" + mobile.UMI);

    }

}
