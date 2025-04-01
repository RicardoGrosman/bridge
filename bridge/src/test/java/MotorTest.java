import org.junit.Test;
import static org.junit.Assert.*;

public class MotorTest {

    @Test
    public void testCalcularValorComModeloMoto() {
        Motor motor = new Motor(1000.0f);
        motor.setModelos(new Moto());
        assertEquals(3000.0f, motor.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComModeloOnibus() {
        Motor motor = new Motor(1000.0f);
        motor.setModelos(new Onibus());
        assertEquals(1400.0f, motor.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComModeloVan() {
        Motor motor = new Motor(1000.0f);
        motor.setModelos(new Van());
        assertEquals(1200.0f, motor.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComModeloUno() {
        Motor motor = new Motor(1000.0f);
        motor.setModelos(new Uno());
        assertEquals(1000.0f, motor.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComValorBaseZero() {
        Motor motor = new Motor(0.0f);
        motor.setModelos(new Moto());
        assertEquals(0.0f, motor.calcularValor(), 0.001);
    }
}