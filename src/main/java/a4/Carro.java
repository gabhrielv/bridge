package a4;

public abstract class Carro {

    protected Upgrade upgrade;

    protected float potenciaBase;

    public Carro(float potenciaBase) {
        this.potenciaBase = potenciaBase;
    }

    public void setUpgrade(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    public void setPotenciaBase(float potenciaBase) {
        this.potenciaBase = potenciaBase;
    }

    public abstract float calcularPotencia();
}
