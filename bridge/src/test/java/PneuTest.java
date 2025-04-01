import org.junit.Test;
import static org.junit.Assert.*;

public class PneuTest {

    @Test
    public void testCalcularValorSemQuantidadeDefinida() {
        Pneus pneus = new Pneus(200.0f);
        assertEquals(200.0f, pneus.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComQuantidadeQuatro() {
        Pneus pneus = new Pneus(200.0f);
        pneus.setQuantidade(4);
        assertEquals(800.0f, pneus.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComQuantidadeZero() {
        Pneus pneus = new Pneus(200.0f);
        pneus.setQuantidade(0);
        assertEquals(0.0f, pneus.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComValorBaseZero() {
        Pneus pneus = new Pneus(0.0f);
        pneus.setQuantidade(4);
        assertEquals(0.0f, pneus.calcularValor(), 0.001);
    }

    @Test
    public void testCalcularValorComQuantidadeNegativa() {
        Pneus pneus = new Pneus(200.0f);
        pneus.setQuantidade(-2);
        assertEquals(-400.0f, pneus.calcularValor(), 0.001);
    }
}