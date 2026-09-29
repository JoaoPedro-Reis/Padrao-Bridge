public class Carro extends Veiculo {

    public Carro(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.equipamento.percentualAcrescimo());
    }
}