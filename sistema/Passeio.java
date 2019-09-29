package sistema;

public class Passeio extends Veiculo {
        
    private boolean arCondi;
    private boolean dirHidr;
    private int numPortas;
	
    
     public Passeio(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao, int numPortas, boolean arCondi, boolean dirHidr) {
	super(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);
	this.arCondi = arCondi;
	this.dirHidr = dirHidr;
        this.numPortas = numPortas;
    }   
    
    public void receber(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao ){
        Veiculo v = new Veiculo(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);  
    }
    
    public boolean isArCondi() {
	return arCondi;
    }
    public void setArCondi(boolean arCondi) {
	this.arCondi = arCondi;
    }
	public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
	
    public boolean isDirHidr() {
	return dirHidr;
    }
    public void setDirHidr(boolean dirHidr) {
	this.dirHidr = dirHidr;
    }
	
}