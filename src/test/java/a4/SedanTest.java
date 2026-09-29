package a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SedanTest {

    @Test
    void deveRetornarPotenciaSedanComAdesivo() {
        Upgrade upgrade = new Adesivo();
        Sedan sedan = new Sedan(100.0f);
        sedan.setUpgrade(upgrade);
        assertEquals(100.0f, sedan.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSedanComRemap() {
        Upgrade upgrade = new Remap();
        Sedan sedan = new Sedan(100.0f);
        sedan.setUpgrade(upgrade);
        assertEquals(130.0f, sedan.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSedanComTurbo() {
        Upgrade upgrade = new Turbo();
        Sedan sedan = new Sedan(100.0f);
        sedan.setUpgrade(upgrade);
        assertEquals(150.0f, sedan.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSedanComSupercharger() {
        Upgrade upgrade = new Supercharger();
        Sedan sedan = new Sedan(100.0f);
        sedan.setUpgrade(upgrade);
        assertEquals(180.0f, sedan.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSedanComNitro() {
        Upgrade upgrade = new Nitro();
        Sedan sedan = new Sedan(100.0f);
        sedan.setUpgrade(upgrade);
        assertEquals(190.0f, sedan.calcularPotencia(), 0.01f);
    }

}
