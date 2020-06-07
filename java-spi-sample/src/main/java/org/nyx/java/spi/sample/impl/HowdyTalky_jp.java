package org.nyx.java.spi.sample.impl;

import org.nyx.java.spi.sample.spi.HowdyTalky;

/**
 *
 * @author nyx
 */
public class HowdyTalky_jp implements HowdyTalky {

    @Override
    public String sayHello() {
        return "こんにちは，世界";
    }

}
