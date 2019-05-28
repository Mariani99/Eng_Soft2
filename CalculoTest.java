import static org.junit.jupiter.api.Assertions.*;
public class CalculoTest {
	void testExecutaCalculo() {
		
		float passaValor1 = 10;
		float passaValor2 = 5;
		float retornoEsperado = 15;
		
		Calculo c = new Calculo();
		float retornoFeito = c.soma(passaValor1, passaValor2);
		
		assertEquals(retornoEsperado, retornoFeito);
		
	}

}
