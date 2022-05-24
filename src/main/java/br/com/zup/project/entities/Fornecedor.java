package br.com.zup.project.entities;

public class Fornecedor {
	private long id;
	private String nome;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
        return "Fornecedor{" + "id=" + id + ", nome=" + nome + '}';
    }
        
	
}
