package fatorial.src.test.java.com.breno;
import org.junit.jupiter.api.Test;

import fatorial.src.main.java.com.breno.Fatorial;

import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcularFatorial(0));
    }

    @Test
    void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcularFatorial(1));
    }

    @Test
    void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcularFatorial(5));
    }

    @Test
    void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcularFatorial(10));
    }
}