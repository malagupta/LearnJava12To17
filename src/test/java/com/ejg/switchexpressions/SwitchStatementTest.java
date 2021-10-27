package com.ejg.switchexpressions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchStatementTest {

    SwitchStatement statement = null;

    @BeforeEach
    void init() {
        statement = new SwitchStatement();
    }

    @Test
    @DisplayName("getDamage should return 10 for param SPOON")
    void getDamageShouldReturn10ForParamSpoon() {
        assertEquals(10, statement.getDamageToPlanet(SingleUsePlastic.SPOON));
    }

    @Test
    @DisplayName("getDamage should return 20 for param FORK")
    void getDamageShouldReturn20ForParamFork() {
        assertEquals(20, statement.getDamageToPlanet(SingleUsePlastic.FORK));
    }

    @Test
    @DisplayName("getDamage should return 30 for param STRAW")
    void getDamageShouldReturn30ForParamStraw() {
        assertEquals(30, statement.getDamageToPlanet(SingleUsePlastic.STRAW));
    }

    @Test
    @DisplayName("getDamage should return 400 for param BOTTLE")
    void getDamageShouldReturn400ForParamBottle() {
        assertEquals(400, statement.getDamageToPlanet(SingleUsePlastic.BOTTLE));
    }
}
