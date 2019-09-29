package sistema;

public class Motocicleta extends Veiculo {
	
    private int potencia;
    private String tipoMoto;
	
    public Motocicleta(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao, int potencia, String tipoMoto) {
        super(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);
        this.potencia = potencia;
	this.tipoMoto = tipoMoto;
    
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }
    public void setTipoMoto(String tipoMoto) {
	this.tipoMoto = tipoMoto;
    }
        
}