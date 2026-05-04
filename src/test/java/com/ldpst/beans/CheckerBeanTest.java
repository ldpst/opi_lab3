package com.ldpst.beans;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CheckerBeanTest {

    private CheckerBean checkerBean;

    @BeforeEach
    void setUp() {
        checkerBean = new CheckerBean();
    }

    @ParameterizedTest(name = "[{index}] Ожидается {0} для x={1}, y={2}, r={3}")
    @CsvSource({

            "true,  -0.5,  -1,    1",
            "true,  -0.5,   0,    1",
            "true,  -0.3,   0.3,  1",
            "true,   0,     0.5,  1",
            "true,   1,     0,    1",
            "true,   0.5,  -0.5,  1",
            "true,   0,    -1,    1",
            "true,  -0.25, -0.5,  1",
            "true,  -0.25,  0.25, 1",
            "false, -0.6,   0.6,  1",
            "false,  0.1,   0.1,  1",
            "false,  0.6,  -0.6,  1",

            "true,  -1.25, -2.5,  2.5",
            "true,  -1.25,  0,    2.5",
            "false, -1.0,   1.0,  2.5",
            "true,   0,     1.25, 2.5",
            "true,   2.5,   0,    2.5",
            "true,   1.25, -1.25, 2.5",
            "true,   0,    -2.5,  2.5",
            "true,  -0.625,-1.25, 2.5",
            "true,  -0.625, 0.625,2.5",
            "false, -1.5,   1.5,  2.5",
            "false,  0.25,  0.25, 2.5",
            "false,  1.5,  -1.5,  2.5"
    })
    void testCheck(boolean expected, BigDecimal x, BigDecimal y, BigDecimal r) {
        assertEquals(expected, checkerBean.check(x, y, r));
    }
}