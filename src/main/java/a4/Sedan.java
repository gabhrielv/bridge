package a4;

public class Sedan extends Carro {

    public Sedan(float potenciaBase) {
        super(potenciaBase);
    }

    public float calcularPotencia() {
        return this.potenciaBase * (1 + this.upgrade.percentualAumento());
    }

}
