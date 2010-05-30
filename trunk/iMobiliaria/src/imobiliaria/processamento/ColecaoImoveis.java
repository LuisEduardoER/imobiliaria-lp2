package imobiliaria.processamento;

import imobiliaria.util.VerificaInvalido;

import java.util.ArrayList;

/**
 * Classe ColecaoImoveis que guarda uma Colecao da classe Imovel
 * 
 * @version IT 1.0
 */
public class ColecaoImoveis {
	private ArrayList<Imovel> colecaoImoveis = new ArrayList<Imovel>();

	/**
	 * Metodo que adiciona imoveis na Colecao
	 * 
	 * @param imovelAadicionar
	 *            Imovel que deseja adicionar na Colecao
	 * @throws Exception
	 *             Lanca excecao caso o imovel ja exista ja colecao
	 */
	public void addImovel(Imovel imovelAadicionar) throws Exception {
		
		if (imovelAadicionar == null){
			throw new Exception("Imovel Invalido");
		}

		if (colecaoImoveis.contains(imovelAadicionar))
			throw new Exception("Imovel Existente");

		colecaoImoveis.add(imovelAadicionar);
	}

	/**
	 * Metodo que remove um imovel da Colecao
	 * 
	 * @param registroImovel
	 *            Registro do Imovel a Ser Removido
	 * @return True - Caso o imovel seja removido <br>
	 *         False - Caso ele nao seja encontrado
	 */
	public boolean removeImovel(String registroImovel) throws Exception {
		
		if (registroImovel == null){
			throw new Exception("Imovel Invalido");
		}

		int registro;

		try {
			registro = Integer.parseInt(registroImovel);
		} catch (Exception e) {
			throw new Exception("Registro Invalido");
		}
		for (Imovel imovel : colecaoImoveis) {
			if (imovel.getRegistroImovel() == registro)
				return colecaoImoveis.remove(imovel);
		}
		return false;
	}

	/**
	 * Metodo acessador de toda a colecao
	 * 
	 * @return ArrayList contendo todos os imoveis da Colecao
	 */
	public ArrayList<Imovel> getImoveis() {
		return colecaoImoveis;
	}

	/**
	 * Metodo filtrador que retorna os imoveis de valor entre os numeros
	 * passados
	 * 
	 * @param min
	 *            Valor minimo dos imoveis filtrados
	 * @param max
	 *            Valor maximo dos imoveis filtrados
	 * @return ArrayList contendo os imoveis filtrados
	 */
	public ArrayList<Imovel> getImoveisDeValor(double min, double max) {
		
		if (min > max){
			throw new  IllegalArgumentException("Intervalo Invalido");
		}

		ArrayList<Imovel> colecaoRetornada = new ArrayList<Imovel>();

		for (Imovel imovel : colecaoImoveis) {

			double valorImovel = imovel.getValor();

			if (valorImovel >= min && valorImovel <= max) {
				colecaoRetornada.add(imovel);
			}
		}
		return colecaoRetornada;
	}

	/**
	 * Metodo filtrador que retorna os Imoveis de um determinado Tipo Contratual
	 * 
	 * @param tipoContratualRequerido
	 *            Tipo Contratual para ser usado como Filtro
	 * @return ArrayList contendo imoveis do determinado Tipo Contratual
	 */
	public ArrayList<Imovel> getImoveis(TipoContratual tipoContratualRequerido) {

		ArrayList<Imovel> colecaoRetornada = new ArrayList<Imovel>();

		for (Imovel imovel : colecaoImoveis) {

			if (imovel.getTipoContratual() == tipoContratualRequerido) {
				colecaoRetornada.add(imovel);
			}
		}
		return colecaoRetornada;
	}

	/**
	 * Metodo filtrador que retorna Imoveis de um determinado Tipo de Imovel
	 * 
	 * @param tipoDeImovelRequerido
	 *            Tipo de Imovel para ser usado como Filtro
	 * @return ArrayList contendo imoveis do determinado Tipo de Imovel
	 */
	public ArrayList<Imovel> getImoveis(TipoImovel tipoDeImovelRequerido) {

		ArrayList<Imovel> colecaoRetornada = new ArrayList<Imovel>();

		for (Imovel imovel : colecaoImoveis) {

			if (imovel.getTipoDoImovel() == tipoDeImovelRequerido) {
				colecaoRetornada.add(imovel);
			}
		}
		return colecaoRetornada;

	}

	/**
	 * Metodo filtrador que retorna Imoveis de um determinado Estado
	 * 
	 * @param estadoRequerido
	 *            Estado dos imoveis para ser usado como Filtro
	 * @return ArrayList contendo imoveis do determinado Estado
	 */
	public ArrayList<Imovel> getImoveis(EstadoImovel estadoRequerido) {

		ArrayList<Imovel> colecaoRetornada = new ArrayList<Imovel>();

		for (Imovel imovel : colecaoImoveis) {

			if (imovel.getEstadoDoImovel() == estadoRequerido) {
				colecaoRetornada.add(imovel);
			}
		}
		return colecaoRetornada;
	}

	/**
	 * Metodo Acessador de Imoveis que contem um determinado nome
	 * 
	 * @param nomeRequerido
	 *            Nome ou Endereco a ser usado como Filtro
	 * 
	 * @return ArrayList contendo os imoveis filtrados
	 */
	public ArrayList<Imovel> getImoveis(String nomeRequerido) {
		
		if(VerificaInvalido.basico(nomeRequerido)){
			throw new IllegalArgumentException("Nome Invalido");
		}

		ArrayList<Imovel> colecaoRetornada = new ArrayList<Imovel>();

		String stringDoImovel;
		for (Imovel imovel : colecaoImoveis) {

			stringDoImovel = imovel.getNome();
			if (stringDoImovel.contains(nomeRequerido)) {
				colecaoRetornada.add(imovel);
			}

		}
		return colecaoRetornada;
	}

	/**
	 * Metodo acessador de um determinado imovel a partir do seu Registro
	 * 
	 * @param registroRequerido
	 *            Registro do Imovel a ser pesquisado
	 * @return Imovel pesquisado<br>
	 *         Null - caso nao seja encontrado
	 */
	public Imovel getImovelDeRegistro(int registroRequerido) {

		for (Imovel imovel : colecaoImoveis) {

			if (imovel.getRegistroImovel() == registroRequerido) {
				return imovel;
			}
		}
		return null;
	}

	/**
	 * equals da Classe<br>
	 * Duas Colecoes sao iguais se possuem os mesmos elementos
	 */

	@Override
	public boolean equals(Object objeto) {
		if (!(objeto instanceof ColecaoImoveis)) {
			return false;
		}
		ColecaoImoveis outraColecao = (ColecaoImoveis) objeto;

		return outraColecao.getImoveis().containsAll(colecaoImoveis)
				&& colecaoImoveis.containsAll(outraColecao.getImoveis());
	}

}