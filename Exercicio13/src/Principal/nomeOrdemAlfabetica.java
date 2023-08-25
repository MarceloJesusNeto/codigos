package Principal;

public class nomeOrdemAlfabetica {
	
	public String nomes;

	
	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
	public nomeOrdemAlfabetica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public nomeOrdemAlfabetica(String nomes) {
		super();
		this.nomes = nomes;
	}

	@Override
	public String toString() {
		
		return "Nome: " + nomes;
	}
	
	public int compareTo(nomeOrdemAlfabetica umaLista) {
		// TODO Auto-generated method stub
		return this.nomes.compareTo(umaLista.nomes);
	}
	
}


