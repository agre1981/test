package com.example.spring

import spock.lang.Specification

class MyTestSpec extends Specification {

    def setup() {
    }

    def "test service"() {
        setup:
          String st = "123 abc"
        when:
          String res = st.substring(4)
        then:
          res == "abc"
    }
}
