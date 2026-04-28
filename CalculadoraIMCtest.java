
import SERVICE.CalculadoraIMC;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraIMCtest{
    
    @Test
    public void testeCalculoIMC(){
        CalculadoraIMC calc = new CalculadoraIMC();
        double resultado = calc.calcular(70, 1.75);
        assertEquals(22.85, resultado, 0.1);
    }
    
    @Test
    public void testeClassificacao(){
        CalculadoraIMC calc = new CalculadoraIMC();
        String resultado = calc.classificar(22);
        assertEquals("Peso normal", resultado);
    }
}