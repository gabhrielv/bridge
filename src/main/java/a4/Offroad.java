package a4;

public class Offroad extends Carro {

    private boolean tracao4x4;

    public Offroad(float potenciaBase) {
        super(potenciaBase);
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    public float calcularPotencia() {
        float potencia = this.potenciaBase * (1 + this.upgrade.percentualAumento());
        if (this.tracao4x4) {
            return potencia * 0.85f;
        }
        return potencia;
    }
}
