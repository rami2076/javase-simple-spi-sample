/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nyx.java.spi.sample.impl.spi;

import org.nyx.java.spi.sample.spi.HowdyTalky;

/**
 *
 * @author nyx
 */
public class HowdyTalky_fr implements HowdyTalky {

    @Override
    public String sayHello() {
        return "Bonjour le monde!";
    }

}
