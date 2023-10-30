package com.ll;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")
    void t1() {
        Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 => 20")
    void t2() {
        int rs = Calc.run("10 + 10");
        Assertions.assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 => 30")
    void t3() {
        int rs = Calc.run("10 + 20");
        Assertions.assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10 + 30 => 40")
    void t4() {
        int rs = Calc.run("10 + 30");
        Assertions.assertThat(rs).isEqualTo(40);
    }

    @Test
    @DisplayName("10 + 40 => 50")
    void t5() {
        int rs = Calc.run("10 + 40");
        Assertions.assertThat(rs).isEqualTo(50);
    }
}
