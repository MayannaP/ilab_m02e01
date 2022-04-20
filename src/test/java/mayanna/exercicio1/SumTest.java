package mayanna.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import services.Operations;

@SpringBootTest
public class SumTest {
	
	@Test
	public void shouldReturnSum() throws Exception{
		assertEquals(4, Operations.Sum(2, 2));
	}
}
