package sistema;
public class Utilitario extends Veiculo{

    private boolean tetoSolar;
    private float diaAro;
    private String tracao;
    private String tipoUti;
	
    public Utilitario(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao, boolean tetoSolar, float diaAro, String tracao, String tipoUti) {
	super(placa, cor, modelo, fabricante, anoFabrica, valorDiaria, situacao);
        this.tetoSolar = tetoSolar;
	this.diaAro = diaAro;
	this.tracao = tracao;
	this.tipoUti = tipoUti;
    }
	
    public boolean isTetoSolar() {
	return tetoSolar;
    }
    public void setTetoSolar(boolean tetoSolar) {
	this.tetoSolar = tetoSolar;
    }
	
    public float getDiaAro() {
	return diaAro;
    }
    public void setDiaAro(float diaAro) {
        this.diaAro = diaAro;
    }
	
    public String getTracao() {
	return tracao;
    }
    public void setTracao(String tracao) {
	this.tracao = tracao;
    }
	
    public String getTipoUti() {
	return tipoUti;
    }
    public void setTipoUti(String tipoUti) {
        this.tipoUti = tipoUti;
    }
    
}