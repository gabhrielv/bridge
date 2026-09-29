package a4;

public class Formula extends Carro {

    private float potenciaHibrida;

    public Formula(float potenciaBase) {
        super(potenciaBase);
    }

    public void setPotenciaHibrida(float potenciaHibrida) {
        this.potenciaHibrida = potenciaHibrida;
    }

    public float calcularPotencia() {
        return (this.potenciaBase + this.potenciaHibrida) * (1 + this.upgrade.percentualAumento());
    }
}
