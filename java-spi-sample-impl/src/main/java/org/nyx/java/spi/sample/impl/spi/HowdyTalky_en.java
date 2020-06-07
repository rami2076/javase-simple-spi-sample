package org.nyx.java.spi.sample.impl.spi;

import org.nyx.java.spi.sample.spi.HowdyTalky;

/**
 *
 * @author nyx
 */
public class HowdyTalky_en implements HowdyTalky {

    @Override
    public String sayHello() {
        return "Hello, World!";
    }

}
