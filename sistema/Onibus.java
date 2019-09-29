package sistema;
public class Onibus extends Veiculo{

    private int numPass;
    private int numEixosOni;
	
    public Onibus(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao, int numPass, int numEixosOni) {
        super(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);
	this.numPass = numPass;
	this.numEixosOni = numEixosOni;
    }
	
	
    public int getNumPass() {
	return numPass;
    }
    public void setNumPass(int numPass) {
	this.numPass = numPass;
    }
	
    public int getNumEixosOni() {
	return numEixosOni;
    }
    public void setNumEixosOni(int numEixosOni) {
	this.numEixosOni = numEixosOni;
    }
	
}
