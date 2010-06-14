package imobiliaria.controladores;

import imobiliara.auxiliar.TipoContratual;
import imobiliaria.entidades.Aluguel;
import imobiliaria.entidades.Cliente;
import imobiliaria.entidades.EstadoImovel;
import imobiliaria.entidades.Imovel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que ira ser o Controlador de Alugueis do Sistema
 * 
 * @author Yuri Farias
 * @version IT 02
 */
public class ControladorAlugueis implements Serializable {

	private static final long serialVersionUID = 1L;
	private static ControladorAlugueis controladorAlugueisUnico = new ControladorAlugueis();

	private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

	private ControladorAlugueis() {
	}

	/**
	 * Metodo acessador do Controlador de Alugueis Unico
	 * 
	 * @return Controlador de Alugueis Unico
	 */
	public static ControladorAlugueis getInstance() {
		return controladorAlugueisUnico;
	}

	/**
	 * Metodo que adiciona um Aluguel no Controlador
	 * 
	 * @param alugante
	 *            Cliente que alugou o Imovel
	 * @param vendedor
	 *            Vendedor do Imovel vendido
	 * @param imovelAlugado
	 *            Imovel que foi Alugado
	 * @return
	 */
	public boolean adicionaAluguel(String cpfCliente, String registroDoImovel) {
		
		Cliente alugante = ControladorCliente.getInstance().getCliente(cpfCliente);
		Imovel imovelAlugado = ControladorImovel.getInstance().getImovel(registroDoImovel);
		
		if (alugante == null || imovelAlugado == null ||
				imovelAlugado.getEstadoDoImovel() != EstadoImovel.PEDIDO ||
				imovelAlugado.getTipoContratual() != TipoContratual.ALUGUEL) {
			
			throw new IllegalArgumentException("Parametros invalidos");
		}

		Aluguel aluguel = new Aluguel(alugante, imovelAlugado);

		return alugueis.add(aluguel);
	}

	/**
	 * Metodo que remove um Aluguel do Controlador de Alugueis
	 * 
	 * @param registroDoImovel
	 *            Registro Imovel do Aluguel a ser removido
	 * @return True - Caso o imovel tenha sido removido <br>
	 *         False - Caso o imovel nao seja encontrado
	 */
	public boolean removeAluguel(String registroDoImovel) {
		
		int registroImovel;
		try {
			registroImovel = Integer.parseInt(registroDoImovel);
		} catch (Exception e) {
			throw new IllegalArgumentException("Registro invalido");
		}

		for (Aluguel a : alugueis) {
			if (a.getImovelAlugado().getRegistroImovel() == registroImovel) {
				return alugueis.remove(a);
			}
		}
		return false;
	}

	/**
	 * Metodo acessador do Aluguel de um Dado Imovel Alugado
	 * 
	 * @param registroDoImovel
	 *            Registro do Imovel Alugado
	 * @return Aluguel ou <br>
	 *         Null caso ele nao esteja alugado
	 */
	public Aluguel getAluguel(String registroDoImovel) {

		int registroImovel;
		try {
			registroImovel = Integer.parseInt(registroDoImovel);
		} catch (Exception e) {
			throw new IllegalArgumentException("Registro invalido");
		}

		for (Aluguel a : alugueis) {
			if (a.getImovelAlugado().getRegistroImovel() == registroImovel) {
				return a;
			}
		}
		return null;
	}

	/**
	 * Metodo que retorna o valor total de todos os alugueis
	 * @return Valor Total de Todos os Alugueis no Controlador
	 */
	public double getValorTotalDeAlugueis() {

		Iterator<Aluguel> itAluguel = alugueis.iterator();

		double valorTotal = 0;

		while (itAluguel.hasNext()) {
			valorTotal += itAluguel.next().getImovelAlugado().getValor();
		}

		return valorTotal;
	}
	
	

}