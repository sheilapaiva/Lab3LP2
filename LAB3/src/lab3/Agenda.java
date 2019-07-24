package lab3;

/**
 * Representação de uma agenda de contatos, responsável por controlar e gerenciar contatos, manter o 
 * registro dos contatos, cadastra novos contatos, exibe um contato pela posicao e lista todos os contatos. 
 * Cada agenda possui a posibilidade de cadastro de 100 contatos com posicão na agenda, nome, sobrenome e telefone.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */

public class Agenda {
	
	/**
	* Array de Contato.
	*/
	private Contato [] contatos;
	
	/**
	* Constrói uma agenda, com um array de 100 contatos.
	*/
	public Agenda() {
		this.contatos = new Contato [100];
	}
	
	/**
	* Retorna um array de contatos na agenda.
	* 
	* @return a um array de contatos.
	* */
	public Contato[] getContatos() {
		return contatos;
	}
	
	/**
	* Cadastra um novo contato na agenda na posição desejada. 
	* A partir da posição, nome, sobrenome e telefone do contato, 
	* se esses campos estiverem preenchidos e não nulos. 
	* 
	* @param posicao, a posição do contato na agenda
	* @param nome, o nome do contato
	* @param sobrenome, o sobrenome do contato
	* @param telefone, o número de telefone do contato
	* @throws campo nome nulo, lança a exceção NullPointerException
	* @throws campo nome vazio, lança a exceção IllegalArgumentException
	* @throws campo sobrenome nulo, lança a exceção NullPointerException
	* @throws campo sobrenome vazio, lança a exceção IllegalArgumentException
	* @throws campo telefone nulo, lança a exceção NullPointerException
	* @throws campo telefone vazio, lança a exceção IllegalArgumentException
	*/
	public String cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {
		if (posicao < 1 || posicao > 100) {
			return "POSIÇAO DE CADASTRO INVÁLIDA!\n";
		}else if (nome == null) {
			throw new NullPointerException("CAMPO NOME NULO.");
		}else if ("".equals(nome.trim())) {
			throw new IllegalArgumentException("CAMPO NOME VAZIO");
		}else if (sobrenome == null) {
			throw new NullPointerException("CAMPO SOBRENOME NULO.");
		}else if ("".equals(sobrenome.trim())) {
		    throw new IllegalArgumentException("CAMPO SOBRENOME VAZIO");
		}else if (telefone == null) {
			throw new NullPointerException("CAMPO TELEFONE NULO.");
		}else if ("".equals(telefone.trim())) {
		    throw new IllegalArgumentException("CAMPO TELEFONE VAZIO");
		}else {
			Contato dadosContato = new Contato(posicao, nome, sobrenome, telefone);
			this.contatos[posicao - 1] = dadosContato;	
			return "CADASTRO REALIZADO!\n";
		}
	}
	
	/**
	* Retorna a String que representa todos os contatos registrados 
	* na agenda em ordem crescente de posição. 
	* A representação segue o formato “posição - nome sobrenome”.
	* 
	* @return a representação em String da posição, nome e sobrenome de todos contato.
	*/
	public String listarContatos() {	
		String contato = "";
		for (int i = 0; i < 100; i++) {
			if (this.contatos[i] != null) {
				contato += this.contatos[i].toString();
			}
		}
		return contato;
	}
	
	/**
	* Retorna a String que representa o nome, sobrenome e telefone do 
	* contato, de acordo com a posição desejada. 
	* A representação segue o formato “nome sobrenome - telefone”.
	* 
	* @return a representação em String do nome, sobrenome e telefone do contato.
	*/
	public String exibirContato(int posicao) {
		if (this.contatos[posicao - 1] == null) {
			return "POSIÇÃO INVÁLIDA!\n";
		}else {
			return this.contatos[posicao - 1].exibirNST();
		}
	}
	
}
