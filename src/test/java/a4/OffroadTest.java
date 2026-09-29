package a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OffroadTest {

    @Test
    void deveRetornarPotenciaOffroadComAdesivo() {
        Upgrade upgrade = new Adesivo();
        Offroad offroad = new Offroad(200.0f);
        offroad.setUpgrade(upgrade);
        offroad.setTracao4x4(true);
        assertEquals(170.0f, offroad.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaOffroadComRemap() {
        Upgrade upgrade = new Remap();
        Offroad offroad = new Offroad(200.0f);
        offroad.setUpgrade(upgrade);
        offroad.setTracao4x4(true);
        assertEquals(221.0f, offroad.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaOffroadComTurbo() {
        Upgrade upgrade = new Turbo();
        Offroad offroad = new Offroad(200.0f);
        offroad.setUpgrade(upgrade);
        offroad.setTracao4x4(true);
        assertEquals(255.0f, offroad.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaOffroadComSupercharger() {
        Upgrade upgrade = new Supercharger();
        Offroad offroad = new Offroad(200.0f);
        offroad.setUpgrade(upgrade);
        offroad.setTracao4x4(true);
        assertEquals(306.0f, offroad.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaOffroadComNitro() {
        Upgrade upgrade = new Nitro();
        Offroad offroad = new Offroad(200.0f);
        offroad.setUpgrade(upgrade);
        offroad.setTracao4x4(true);
        assertEquals(323.0f, offroad.calcularPotencia(), 0.01f);
    }

}
