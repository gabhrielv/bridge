package a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulaTest {

    @Test
    void deveRetornarPotenciaFormulaComAdesivo() {
        Upgrade upgrade = new Adesivo();
        Formula formula = new Formula(800.0f);
        formula.setUpgrade(upgrade);
        formula.setPotenciaHibrida(200.0f);
        assertEquals(1000.0f, formula.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaFormulaComRemap() {
        Upgrade upgrade = new Remap();
        Formula formula = new Formula(800.0f);
        formula.setUpgrade(upgrade);
        formula.setPotenciaHibrida(200.0f);
        assertEquals(1300.0f, formula.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaFormulaComTurbo() {
        Upgrade upgrade = new Turbo();
        Formula formula = new Formula(800.0f);
        formula.setUpgrade(upgrade);
        formula.setPotenciaHibrida(200.0f);
        assertEquals(1500.0f, formula.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaFormulaComSupercharger() {
        Upgrade upgrade = new Supercharger();
        Formula formula = new Formula(800.0f);
        formula.setUpgrade(upgrade);
        formula.setPotenciaHibrida(200.0f);
        assertEquals(1800.0f, formula.calcularPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaFormulaComNitro() {
        Upgrade upgrade = new Nitro();
        Formula formula = new Formula(800.0f);
        formula.setUpgrade(upgrade);
        formula.setPotenciaHibrida(200.0f);
        assertEquals(1900.0f, formula.calcularPotencia(), 0.01f);
    }

}
