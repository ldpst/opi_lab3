package com.ldpst.beans;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CheckerBeanTest {
    public CheckerBeanTest() {}
    
    @Test
    public void testCheck() {

        CheckerBean checkerBean = new CheckerBean();
        
        assertTrue(checkerBean.check(
            new BigDecimal(-0.5), 
            new BigDecimal(-1), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(-0.5), 
            new BigDecimal(0), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(-0.3), 
            new BigDecimal(0.3), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(0), 
            new BigDecimal(0.5), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(1), 
            new BigDecimal(0), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(0.5), 
            new BigDecimal(-0.5), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(0), 
            new BigDecimal(-1), 
            new BigDecimal(1))
        );
        
        assertTrue(checkerBean.check(
            new BigDecimal(-0.25), 
            new BigDecimal(-0.5), 
            new BigDecimal(1))
        );

        assertTrue(checkerBean.check(
            new BigDecimal(-0.25), 
            new BigDecimal(0.25), 
            new BigDecimal(1))
        );

        assertFalse(checkerBean.check(
            new BigDecimal(-0.6), 
            new BigDecimal(0.6), 
            new BigDecimal(1))
        );

        assertFalse(checkerBean.check(
            new BigDecimal(-0.6), 
            new BigDecimal(0.6), 
            new BigDecimal(1))
        );

        assertFalse(checkerBean.check(
            new BigDecimal(0.1), 
            new BigDecimal(0.1), 
            new BigDecimal(1))
        );

        assertFalse(checkerBean.check(
            new BigDecimal(0.6), 
            new BigDecimal(-0.6), 
            new BigDecimal(1))
        );
        
        assertTrue(checkerBean.check(
                new BigDecimal(-1.25),
                new BigDecimal(-2.5),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(-1.25),
                new BigDecimal(0),
                new BigDecimal(2.5)
        ));

        assertFalse(checkerBean.check(
                new BigDecimal(-1.0),
                new BigDecimal(1.0),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(0),
                new BigDecimal(1.25),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(2.5),
                new BigDecimal(0),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(1.25),
                new BigDecimal(-1.25),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(0),
                new BigDecimal(-2.5),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(-0.625),
                new BigDecimal(-1.25),
                new BigDecimal(2.5)
        ));

        assertTrue(checkerBean.check(
                new BigDecimal(-0.625),
                new BigDecimal(0.625),
                new BigDecimal(2.5)
        ));

        assertFalse(checkerBean.check(
                new BigDecimal(-1.5),
                new BigDecimal(1.5),
                new BigDecimal(2.5)
        ));

        assertFalse(checkerBean.check(
                new BigDecimal(-1.5),
                new BigDecimal(1.5),
                new BigDecimal(2.5)
        ));

        assertFalse(checkerBean.check(
                new BigDecimal(0.25),
                new BigDecimal(0.25),
                new BigDecimal(2.5)
        ));

        assertFalse(checkerBean.check(
                new BigDecimal(1.5),
                new BigDecimal(-1.5),
                new BigDecimal(2.5)
        ));
    }
}
