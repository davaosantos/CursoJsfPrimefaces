package cursodejsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

// Para chamar managedBean , chama pelo name , "pessoaBean"
@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {

	private String nome;
	
	private String senha;
	
	private String texto;

	private String sobrenome;
	
	private String nmCompleto;
	
	private HtmlCommandButton commandButton;
	
	List<String> nomeList = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String addNome() {
		 nomeList.add(nome);
		 
		 if(nomeList.size() > 3) {
			 commandButton.setDisabled(true);
			 return "paginanavegada?faces-redirect=true";
		 }
		 return ""; // Null ou vazio fica na mesma pagina -> outcome , retorno que o action recebe do managed bean
	}

	public List<String> getNomeList() {
		return nomeList;
	}

	public void setNomeList(List<String> nomeList) {
		this.nomeList = nomeList;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNmCompleto() {
		return nmCompleto;
	}

	public void setNmCompleto(String nmCompleto) {
		this.nmCompleto = nmCompleto;
	}

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
	
}
