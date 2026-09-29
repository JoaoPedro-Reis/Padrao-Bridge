import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    public void deveCalcularValorComGPS() {
        Carro carro = new Carro(50000.0f);
        carro.setEquipamento(new GPS());

        assertEquals(52500.0f, carro.calcularValor(), 0.01f);
    }

    @Test
    public void deveCalcularValorComCameraRe() {
        Carro carro = new Carro(50000.0f);
        carro.setEquipamento(new CameraRe());

        assertEquals(54000.0f, carro.calcularValor(), 0.01f);
    }

    @Test
    public void deveCalcularValorComArCondicionado() {
        Carro carro = new Carro(50000.0f);
        carro.setEquipamento(new ArCondicionado());

        assertEquals(55000.0f, carro.calcularValor(), 0.01f);
    }

    @Test
    public void deveCalcularValorComSom() {
        Carro carro = new Carro(50000.0f);
        carro.setEquipamento(new Som());

        assertEquals(53000.0f, carro.calcularValor(), 0.01f);
    }
}