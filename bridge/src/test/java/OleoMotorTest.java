import org.junit.Test;
import static org.junit.Assert.*;

public class OleoMotorTest {

    @Test
    public void testCalcularValorBasico() {
        OleoMotor oleo = new OleoMotor(50.0f);
        assertEquals(50.0f, oleo.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComValorBaseZero() {
        OleoMotor oleo = new OleoMotor(0.0f);
        assertEquals(0.0f, oleo.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComValorBaseNegativo() {
        OleoMotor oleo = new OleoMotor(-30.0f);
        assertEquals(-30.0f, oleo.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComAlteracaoDeValorBase() {
        OleoMotor oleo = new OleoMotor(50.0f);
        oleo.setValorbase(60.0f);
        assertEquals(60.0f, oleo.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorNaoAfetadoPorModelo() {
        OleoMotor oleo = new OleoMotor(50.0f);
        oleo.setModelos(new Moto());
        assertEquals(50.0f, oleo.calcularValor(), 0.001);
    }
}