package Model;

public class Reptil extends Animal implements IAnimal {

	private boolean capacidadeRegenerativa;

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public Reptil(String nomenclatura,int numeroDePatas,
			String cobertoPor, String reproducao, String alimentacao,boolean capacidadeRegenerativa) {
		super(nomenclatura,numeroDePatas,cobertoPor, reproducao,alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
   public Reptil () {
	   super();
   }
   public void tipoDeRespiracao () {
		super.tipoDeRespiracao();
		System.out.println("Traquial");
	}
   public void temperaturaCorporal() {
		System.out.println("Pecilotérmico");
	}
   public void exibir(){
		System.out.println("\n\nCaracterísticas do animal selecionado:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Número de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto por: " + super.getCobertoPor());
		System.out.println("Reprodução: " + super.getReproducao());
		System.out.println("Alimentação: " + super.getAlimentacao());
		System.out.println("Capacidade regenerativa: " + this.capacidadeRegenerativa);
		tipoDeRespiracao();
		temperaturaCorporal();

}
}



