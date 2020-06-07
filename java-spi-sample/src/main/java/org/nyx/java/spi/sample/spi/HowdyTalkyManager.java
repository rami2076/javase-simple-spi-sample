/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nyx.java.spi.sample.spi;

import java.util.Objects;
import java.util.ServiceLoader;
import org.nyx.java.spi.sample.impl.HowdyTalky_jp;

/**
 *
 * @author nyx
 */
public class HowdyTalkyManager {

    private static HowdyTalky talky;

    public static HowdyTalky getHowdyTalky() {

        if (Objects.isNull(talky)) {
            ServiceLoader<HowdyTalky> loader = ServiceLoader.load(HowdyTalky.class);
            talky = loader.findFirst().orElseGet(HowdyTalky_jp::new);
            return talky;
        } else {
            return talky;
        }

    }

}
