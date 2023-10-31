package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entities.Notebook;

@ManagedBean
@RequestScoped
public class NotebookBean {
	
	private Notebook notebook = new Notebook();
	private List<Notebook> lista = new ArrayList<>();
	
	public String salvar() {
		lista.add(notebook);
		System.out.println(notebook.getMarca());
		return null;
		
	}

	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public List<Notebook> getLista() {
		return lista;
	}

	public void setLista(List<Notebook> lista) {
		this.lista = lista;
	}
	
	
}
