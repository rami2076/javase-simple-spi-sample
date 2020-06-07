/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nyx.java.spi.sample.runtime;

import java.util.stream.Stream;
import org.nyx.java.spi.sample.spi.HowdyTalky;
import org.nyx.java.spi.sample.spi.HowdyTalkyManager;

/**
 *
 * @author nyx
 */
public class MessageWriter {
    
    public static void write() {
        HowdyTalky howdyTalky = HowdyTalkyManager.getHowdyTalky();
        String className = howdyTalky.getClass().getCanonicalName();
        String message = howdyTalky.sayHello();
        
        Stream.of(className, message).forEach(System.out::println);
    }
    
}
