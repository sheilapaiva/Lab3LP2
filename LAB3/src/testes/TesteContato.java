package testes;

/**
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Contato;

class TesteContato {
	
	Contato contato1;
	Contato contato2;
	Contato contato3;
	
	@BeforeEach
	void setUP() {
		contato1 = new Contato(3, "Isabeli", "Maria", "(83) 99999991");
		contato2 = new Contato(50, "Isabeli", "Maria", "(83) 99999992");
		contato3 = new Contato(1, "Mireli", "Almeida", "(71) 99998888");
	}
	
	@Test
	void testContato() {
		assertEquals(3, contato1.getPosicao());
		assertEquals("Isabeli", contato1.getNome());
		assertEquals("Maria", contato1.getSobrenome());
		assertEquals("(83) 99999991", contato1.getTelefone());
	}

	@Test
	void testToString() {
		assertEquals(contato1.toString(), "3 - Isabeli Maria\n");
	}

	@Test
	void testExibirNST() {
		assertEquals(contato1.exibirNST(), "\nIsabeli Maria - (83) 99999991\n");
	}

	@Test
	void testEquals1Object() {
		assertEquals(contato1, contato2);
	}
	
	@Test
	void testEquals2Object() {
		assertNotEquals(contato1, contato3);
	}
}
