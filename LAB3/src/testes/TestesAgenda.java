package testes;

/**
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Agenda;
import lab3.Contato;

class TestesAgenda {
	
	Agenda novaAgenda;
	
	@BeforeEach
	void setUP() {
		novaAgenda = new Agenda();
		novaAgenda.cadastrarContato(1, "Sheila", "Paiva", "123456789");
		novaAgenda.cadastrarContato(45, "Isabeli", "Maria", "987654321");
	}

	@Test
	void testCadastrarContato() {
		Contato contato = new Contato(1, "Sheila", "Paiva", "123456789");
		assertEquals(novaAgenda.getContatos()[0], contato);
	}
	
	@Test
	void testCadastrarContatoPosicaoValida() {
		assertEquals(novaAgenda.cadastrarContato(3, "Maria", "Diniz", "54321"), "CADASTRO REALIZADO!\n");
	}
	
	@Test
	void testCadastrarContatoPosicaoInvalida() {
		assertEquals(novaAgenda.cadastrarContato(-3, "Maria", "Silva", "12345"), "POSIÇAO DE CADASTRO INVÁLIDA!\n");
	}
	
	@Test
	void testarNomeNulo() {
		try {
			novaAgenda.cadastrarContato(1, null, "Paiva", "123456789");
		}catch(NullPointerException nn) {
			assertEquals(nn.getMessage(), "CAMPO NOME NULO.");
			
		}
	}
	
	@Test
	void testarNomeVazio() {
		try {
			novaAgenda.cadastrarContato(1, "   ", "Paiva", "123456789");
		}catch(IllegalArgumentException nv) {
			assertEquals(nv.getMessage(), "CAMPO NOME VAZIO");
			
		}
	}
	
	@Test
	void testarSobrenomeNulo() {
		try {
			novaAgenda.cadastrarContato(1, "Sheila", null, "123456789");
		}catch(NullPointerException sn) {
			assertEquals(sn.getMessage(), "CAMPO SOBRENOME NULO.");
			
		}
	}
	
	@Test
	void testarSobrenomeVazio() {
		try {
			novaAgenda.cadastrarContato(1, "Sheila", "   ", "123456789");
		}catch(IllegalArgumentException sv) {
			assertEquals(sv.getMessage(), "CAMPO SOBRENOME VAZIO");
			
		}
	}
	
	@Test
	void testarTelefoneNulo() {
		try {
			novaAgenda.cadastrarContato(1, "Sheila", "Paiva", null);
		}catch(NullPointerException tn) {
			assertEquals(tn.getMessage(), "CAMPO TELEFONE NULO.");
			
		}
	}
	
	@Test
	void testarTelefoneVazio() {
		try {
			novaAgenda.cadastrarContato(1, "Sheila", "Paiva", "   ");
		}catch(IllegalArgumentException tv) {
			assertEquals(tv.getMessage(), "CAMPO TELEFONE VAZIO");
			
		}
	}

	@Test
	void testListarContatos() {
		assertEquals("1 - Sheila Paiva\n45 - Isabeli Maria\n", novaAgenda.listarContatos());
	}

	@Test
	void testExibirContato() {
		assertEquals("\nIsabeli Maria - 987654321\n", novaAgenda.exibirContato(45));
	}

}
