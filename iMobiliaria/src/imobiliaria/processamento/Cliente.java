//ATENCAO: ColecaoImoveis ainda DEVE SER implementado.
package imobiliaria.processamento;

import java.util.Calendar;

/**
 * Objetos desta classe sao clientes da imobiliaria
 * 
 * @author Bruno Fabio de Farias Paiva
 * @version IT01
 */
public class Cliente extends Pessoa {

	private ColecaoImoveis historicoCompras;
	private ColecaoImoveis pedidos;
	private TipoImovel preferencia;

	/**
	 * Construtor responsavel por criar um novo cliente
	 * 
	 * @param cpf
	 *            Representa o cadastro de pessoa fisica de um cliente
	 * @param dataNascimento
	 *            Representa a data de nascimento de um cliente
	 * @param endereco
	 *            Representa o endereco de um cliente
	 * @param nome
	 *            Representa o nome de um cliente
	 * @throws Exception 
	 */
	public Cliente(String cpf, Calendar dataNascimento, String endereco,
			String nome, TipoImovel preferencia) throws Exception {
		super(cpf, dataNascimento, endereco, nome);
		this.preferencia = preferencia;
	}

	/**
	 * Metodo acessador ao historico de compras de um cliente
	 * 
	 * @return O historico das compras de um cliente
	 */
	public ColecaoImoveis getHistoricoCompras() {
		return historicoCompras;
	}

	/**
	 * Metodo acessador aos pedidos de um cliente
	 * 
	 * @return Os pedidos que um cliente efetuou
	 */
	public ColecaoImoveis getPedidos() {
		return pedidos;
	}

	/**
	 * Metodo acessador a preferencia do cliente
	 * 
	 * @return Tipo de imovel que o cliente prefere
	 */
	public TipoImovel getPreferencia() {
		return preferencia;
	}

	/**
	 * Metodo modificador da preferencia de um cliente
	 * 
	 * @param preferencia
	 *            Representa a nova preferencia do cliente
	 */
	public void setPreferencia(TipoImovel preferencia) {
		this.preferencia = preferencia;
	}

	/* (non-Javadoc)
	 * @see imobiliaria.processamento.Pessoa#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object objeto) {

		if (!(objeto instanceof Cliente)) {
			return false;
		}

		Cliente outroCliente = (Cliente) objeto;

		if (getCpf() != outroCliente.getCpf()) {
			return false;
		}

		return true;
	}

}