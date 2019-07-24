package lab3;

/**
 * Representação de um contato. Um contato é representado por um nome, sobrenome e telefone.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */
public class Contato {
	
	/**
	* Posição do determinado contato.
	*/
	private int posicao;
	/**
	* Nome do contato.
	*/
	private String nome;
	/**
	* Sobrenome do contato.
	*/
	private String sobrenome;
	/**
	* Número do telefone do contato.
	*/
	private String telefone;
	
	/**
	* Retorna um inteiro que representa a posição do contato na agenda.
	* 
	* @return a um inteiro que representa a posição.
	* */
	public int getPosicao() {
		return posicao;
	}
	
	/**
	* Seta um inteiro que representa a posição do contato na agenda.
	* 
	* @param psc, a posição de um contato na agenda.
	* */
	public void setPosicao(int psc) {
		this.posicao = psc;
	}
	
	/**
	* Retorna uma String que representa o nome do contato.
	* 
	* @return a uma String que representa o nome.
	* */
	public String getNome() {
		return nome;
	}
	
	/**
	* Seta uma String que representa o nome do contato.
	* 
	* @param nom, o nome do contato.
	* */
	public void setNome(String nom) {
		this.nome = nom;
	}
	
	/**
	* Retorna uma String que representa o sobrenome do contato.
	* 
	* @return a uma String que representa o sobrenome.
	* */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	* Seta uma String que representa o sobrenome do contato.
	* 
	* @param snom, o sobrenome do contato.
	* */
	public void setSobrenome(String snom) {
		this.sobrenome = snom;
	}
	
	/**
	* Retorna uma String que representa o ntelefone do contato.
	* 
	* @return a uma String que representa o telefone.
	* */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	* Seta uma String que representa o telefone do contato.
	* 
	* @param tel, o telefone do contato.
	* */
	public void setTelefone(String tel) {
		this.telefone = tel;
	}
	
	/**
	* Constrói um contato, a partir da sua posição, nome, sobrenome e número do telefone.
	* 
	* @param posicao, a posição do contato na agenda
	* @param nome, o nome do contato
	* @param sobrenome, o sobrenome do contato
	* @param telefone, o número de telefone do contato
	*/
	public Contato(int posicao, String nome, String sobrenome, String telefone) {
		this.setPosicao(posicao);
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setTelefone(telefone);
	}
	
	/**
	* Retorna a String que representa a posição, nome e sobrenome do contato. A representação segue o 
	* formato “posição - nome sobrenome”.
	* 
	* @return a representação em String da posição, nome e sobrenome do contato.
	*/
	public String toString() {
		return getPosicao() + " - " + getNome() + " " +  getSobrenome() + "\n";
	}
	
	/**
	* Retorna a String que representa o nome, sobrenome e telefone do contato. A representação segue o 
	* formato “nome sobrenome - telefone”.
	* 
	* @return a representação em String do nome, sobrenome e telefone do contato.
	*/
	public String exibirNST() {
		return "\n" + getNome() + " " + getSobrenome() + " - " + getTelefone() + "\n";
	}
	
	/**
	* Retorna a um inteiro referente a representação númerica do objeto.
	* 
	* @return a um valor inteiro que representa o objeto.
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}

	/**
	* Retorna a um boolean referente a comparação de um novo objeto Contato a ser 
	* criado com os outros Contatos criados, um contato é igual ao outro se o nome 
	* e o sobrenome são iguais.
	* 
	* @return a um boolean.
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
}