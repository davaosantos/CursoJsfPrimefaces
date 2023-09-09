package cursodejsf;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ManagedBean(name = "pokemonBean")
public class PokemonBean {
	
	private String nmPokemon;
	
	private String tipo;
	
	private Integer qtdAtk;
	
	private Integer qtdDef;
	
	private static Integer qtdVida = 100;

	public String getNmPokemon() {
		return nmPokemon;
	}

	public void setNmPokemon(String nmPokemon) {
		this.nmPokemon = nmPokemon;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getQtdAtk() {
		return qtdAtk;
	}

	public void setQtdAtk(Integer qtdAtk) {
		this.qtdAtk = qtdAtk;
	}

	public Integer getQtdDef() {
		return qtdDef;
	}

	public void setQtdDef(Integer qtdDef) {
		this.qtdDef = qtdDef;
	}
	
	public Integer getQtdVida() {
		return qtdVida;
	}

	public void setQtdVida(Integer qtdVida) {
		this.qtdVida = qtdVida;
	}

	public Integer perdeVida() {
		
		qtdVida -= 5;
		
		return 0;
	}
	
}
