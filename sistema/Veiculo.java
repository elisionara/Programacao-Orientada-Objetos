package sistema;

public class Veiculo {
//Atributos comuns a todas as classes "filhas"
    private String placa;
    private String cor;
    private String modelo;
    private String fabricante;
    private int anoFabrica;
    private double valorDiaria;
    private String situacao;
    private String nome;
    private int diaLocacao;
    private int mesLocacao;
    private int diaDevolucao;
    private int mesDevolucao;
    private double lucro;
    
	
//Construtor
public Veiculo(String placa, String cor, String modelo, String fabricante, int anoFabrica, double valorDiaria, String situacao) {
    this.placa = placa;
    this.cor = cor;
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.anoFabrica = anoFabrica;
    this.valorDiaria = valorDiaria;
    this.situacao = situacao;
}

public Veiculo(String nome, int diaLocacao, int mesLocacao, int diaDevolucao, int mesDevolucao){
    this.nome = nome;
    this.diaLocacao = diaLocacao;
    this.mesLocacao = mesLocacao;
    this.diaDevolucao = diaDevolucao;
    this.mesDevolucao = mesDevolucao; 
}


//Getters e Setters

public String getNome() {
    return nome;
}

public void setNome(String nome) {
        this.nome = nome;
    }

public int getDiaLocacao() {
    return diaLocacao;
}

public void setDiaLocacao(int diaLocacao) {
    this.diaLocacao = diaLocacao;
}

public int getMesLocacao() {
    return mesLocacao;
}

public void setMesLocacao(int mesLocacao) {
    this.mesLocacao = mesLocacao;
}

public int getDiaDevolucao() {
    return diaDevolucao;
}

public void setDiaDevolucao(int diaDevolucao) {
    this.diaDevolucao = diaDevolucao;
}

public int getMesDevolucao() {
    return mesDevolucao;
}

public void setMesDevolucao(int mesDevolucao) {
    this.mesDevolucao = mesDevolucao;
}

public Double getLucro() {
    return lucro;
}

public void setLucro(Double lucro) {
    this.lucro = lucro;
}

public String getPlaca() {
    return placa;
   
}	
public void setPlaca(String placa) {
    this.placa = placa;
}
	
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}

public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getFabricante() {
    return fabricante;
}
public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
}

public int getAnoFabrica() {
    return anoFabrica;
}
public void setAnoFabrica(int anoFabrica) {
    this.anoFabrica = anoFabrica;
}
	
public double getValorDiaria() {
    return valorDiaria;
}
public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
}

public String getSituacao() {
    return situacao;
}
public void setSituacao(String situacao) {
    this.situacao = situacao;
}


	
	
	
	
}   

