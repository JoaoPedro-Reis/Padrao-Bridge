public abstract class Veiculo {

    protected Equipamento equipamento;
    protected float valorBase;

    public Veiculo(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}