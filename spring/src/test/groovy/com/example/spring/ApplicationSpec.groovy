package com.example.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class ApplicationSpec extends Specification {

    @Autowired
    ApplicationContext applicationContext

    def contextLoads() {
        expect:
          applicationContext
    }

}
