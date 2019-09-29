package sistema;

public class Caminhao extends Veiculo {
        
    private int capCarga;
    private int numEixosCam;
    private int potenciaHP;
    
    //Construtor
    public Caminhao(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao, int capCarga, int numEixosCam, int potenciaHP) {
        super(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);
        
        this.capCarga = capCarga;
	this.numEixosCam = numEixosCam;
	this.potenciaHP = potenciaHP;
    }
    
    //Getters e Setters
    public int getCapCarga() {
		return capCarga;
	}
	public void setCapCarga(int capCarga) {
		this.capCarga = capCarga;
	}
	public int getNumEixosCam() {
		return numEixosCam;
	}
	public void setNumEixosCam(int numEixosCam) {
		this.numEixosCam = numEixosCam;
	}
	public int getPotenciaHP() {
		return potenciaHP;
	}
	public void setPotenciaHP(int potenciaHP) {
		this.potenciaHP = potenciaHP;
	}
}
