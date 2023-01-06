package com.qicong.sboot;

import com.qicong.sboot.s08.S08Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class S08ControllerTests {

    @Autowired
    S08Controller s08Controller;

    @Test
    public void testIndex(){
        s08Controller.index();
    }

}
