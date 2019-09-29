package sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Controle {
    
    public Caminhao c;
    public ArrayList<Passeio> listaPasseio = new ArrayList<>();
    public ArrayList<Utilitario> listaUtilitario = new ArrayList<>();
    public ArrayList<Motocicleta> listaMotocicleta = new ArrayList<>();
    public ArrayList<Onibus> listaOnibus = new ArrayList<>();
    public ArrayList<Caminhao> listaCaminhao = new ArrayList<>();
     
    
    public void addPasseio(Passeio p){
        listaPasseio.add(p);
    }
    
    public void addUtilitario(Utilitario u){
        listaUtilitario.add(u);
    }
    
    public void addMotocicleta(Motocicleta m){
        listaMotocicleta.add(m);
    }
    
    public void addOnibus(Onibus o){
        listaOnibus.add(o);
    }
    
    public void addCaminhao(Caminhao c){
        listaCaminhao.add(c);
    }
    
    public int placasDuplas(String placa){
        int testador = 0;
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getPlaca().equals(placa)){
                testador++;
            }
        }
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getPlaca().equals(placa)){
                testador++;
            }
        }
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getPlaca().equals(placa)){
                testador++;
            }
        }
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getPlaca().equals(placa)){
                testador++;
            }
        }
        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getPlaca().equals(placa)){
                testador++;
            }
        }
        
    return testador;
    }
           
    //public void printar(){
    //    for(int i = 0; i<listaCaminhao.size(); i++){
        //    System.out.println(listaCaminhao.get(i).getCor()); // exemplo;;
    //    }
    //}
    
    public void cadastrarVeiculo() {
        int decisao;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a placa: ");
            String placa = sc.nextLine();
    int PlDupl = placasDuplas(placa);
    if( PlDupl == 0) {
        System.out.print("Digite a cor do carro: ");
            String cor = sc.nextLine();
        System.out.print("Digite o modelo do carro: ");
            String modelo = sc.nextLine();
        System.out.print("Digite o fabricante do carro: ");
            String fabricante = sc.nextLine();
        System.out.print("Digtie o ano de fabricação: ");
            int anoFabri = sc.nextInt();
            if(anoFabri>2019){
                System.out.print("Ano de fabricação maior que o ano vigente!");
            }else{    
        System.out.print("Digite o valor da diária: ");
            double diaria = sc.nextDouble();
        System.out.println("Digite o tipo do seu veículo: ");
            System.out.println("1 - Passeio");
            System.out.println("2 - Utilitário");
            System.out.println("3 - Motocicleta");
            System.out.println("4 - Caminhão");
            System.out.println("5 - Ônibus");
                            
            int tipo = sc.nextInt(); 
            System.out.println("");
            
            if(tipo == 1){
                boolean ArCond = false, DirHidrau = false;
                int numbPortas;
                System.out.print("Quantidade de portas: ");
                    numbPortas = sc.nextInt();
                System.out.print("Possui ar acondicionado? (1:SIM/2:NÃO): ");
                        decisao = sc.nextInt();
                        if(decisao == 1){
                            ArCond = true;
                        }
                System.out.print("Possui direção hidráulica? (1:SIM/2:NÃO): ");
                        decisao = sc.nextInt();
                        if(decisao == 1){
                            DirHidrau = true;
                        }
                   
            Passeio p1 = new Passeio(placa, cor, modelo, fabricante, anoFabri, diaria, "Disponível", numbPortas, ArCond, DirHidrau);
            addPasseio(p1);
            System.out.println("");
            System.out.println("");
            
            }else if (tipo == 2){
                String tracao, tipoUtil;
                boolean tetoSolar = false;
                float diaAro;              
                
                System.out.print("Digite o tipo de tração do utilitário: ");
                    tracao = sc.nextLine();
                System.out.print("Possui teto solar? (1:SIM/2:NÃO): ");
                    decisao = sc.nextInt();
                    if(decisao == 1){
                        tetoSolar = true;
                    }
                System.out.print("Qual o diâmetro do aro? ");
                    diaAro = sc.nextFloat();
                System.out.print("Qual o tipo do veículo utilitário? (1:URBANO/2:OFF-ROAD): ");
                    decisao = sc.nextInt();
                    if(decisao == 1){
                        tipoUtil = "Urbano";
                    }else{
                        tipoUtil = "Off-Road";
                    }
                    
            Utilitario u1 = new Utilitario(placa, cor, modelo, fabricante, anoFabri, diaria, "Disponível", tetoSolar, diaAro, tracao, tipoUtil);        
            addUtilitario(u1);
            System.out.println("");
                                                                         
            }else if (tipo == 3) {
                int pot, decisao1;
                String tipoMot;
                
                System.out.print("Digite a potência(HP):");  
                    pot = sc.nextInt();
                System.out.print("Qual o tipo de motocicleta? (1:URBANO/2:ESPORTIVO/3:OFF-ROAD): ");
                    decisao1 = sc.nextInt();
                    if(decisao1 == 1){
                        tipoMot = "Urbano";
                    }else if(decisao1 == 2){
                        tipoMot = "Esportiva";
                    }else{
                        tipoMot = "Off-Road";
                    }
                    
            Motocicleta m1 = new Motocicleta(placa,cor, modelo, fabricante, anoFabri, diaria, "Disponível", pot, tipoMot);        
            addMotocicleta(m1);
            System.out.println("");
            
            }else if (tipo == 4) {
                int capaCarga,numbEixosCam,potHP;
                
                System.out.print("Digite a capacidade: ");
                capaCarga = sc.nextInt();
                System.out.print("Digite o número de eixos: ");
                numbEixosCam = sc.nextInt();
                System.out.print("Digite a potência(HP): ");
                potHP = sc.nextInt();
                
                Caminhao c1 = new Caminhao(placa,cor, modelo, fabricante, anoFabri, diaria, "Disponível", capaCarga, numbEixosCam, potHP);
                addCaminhao(c1);
                System.out.println("");
                
            }else if (tipo == 5) {
                int numbPass,numbEixosOni;
                
                System.out.print("Digite a quantidade de passageiros: ");
                numbPass = sc.nextInt();
                System.out.print("Digite o número de eixos: ");
                numbEixosOni = sc.nextInt();
                
                Onibus o1 = new Onibus(placa,cor, modelo, fabricante, anoFabri, diaria, "Disponível", numbPass, numbEixosOni);
                addOnibus(o1);
                System.out.println("");
            
            }else{
                System.out.println("Digite os valores de 1 a 5");
            }
        }
            
    }else{
        System.out.println("PLACA DUPLICADA!");
        System.out.println("");
    }
}
    
    public void consultarVeiculo (String placa){
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getPlaca().equals(placa)){
                System.out.println("Esta placa pertence a um MOTOCICLETA!");
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaMotocicleta.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaMotocicleta.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaMotocicleta.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                break;
            }            
        }
                
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getPlaca().equals(placa)){
                System.out.println("Esta placa pertence a um UTILITÁRIO!");
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaUtilitario.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaUtilitario.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaUtilitario.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaUtilitario.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                break;
            }            
        }
         
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getPlaca().equals(placa)){
                System.out.println("Esta placa pertence a um PASSEIO!");
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaPasseio.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaPasseio.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaPasseio.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaPasseio.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                break;
            }            
        }
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getPlaca().equals(placa)){
                System.out.println("Esta placa pertence a um ÔNIBUS!");
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaOnibus.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaOnibus.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaOnibus.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaOnibus.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                break;
            }            
        }
         
    for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getPlaca().equals(placa)){
                System.out.println("Esta placa pertence a um CAMINHAO!");
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaCaminhao.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaCaminhao.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaCaminhao.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaCaminhao.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                break;
            }            
        } 
    }
    
    public void pesqVeicMarca (String marca) {
        int cont = 1;
        
        System.out.println("");
        System.out.println("MOTOCICLETA!");
        System.out.println("");
        
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getFabricante().equals(marca)){
                System.out.println("");
                System.out.printf("%d - Motocicleta da marca %s:\n",cont,marca);
                System.out.print("Placa: ");
                System.out.println(listaMotocicleta.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaMotocicleta.get(i).getModelo());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaMotocicleta.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                System.out.println("");
            } 
            cont++;
        }
        
        System.out.println("");
        System.out.println("UTILITARIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getFabricante().equals(marca)){
                System.out.println("");
                System.out.printf("%d - Utilitário da marca %s:\n",cont,marca);
                System.out.print("Placa: ");
                System.out.println(listaUtilitario.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaUtilitario.get(i).getModelo());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaUtilitario.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaUtilitario.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                System.out.println("");
            } 
            cont++;
        }
        
        System.out.println("");
        System.out.println("PASSEIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getFabricante().equals(marca)){
                System.out.println("");
                System.out.printf("%d - Carro de Passeio da marca %s:\n",cont,marca);
                System.out.print("Placa: ");
                System.out.println(listaPasseio.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaPasseio.get(i).getModelo());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaPasseio.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaPasseio.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                System.out.println("");
            }    
            cont++;
        }
        
        System.out.println("");
        System.out.println("ONIBUS!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getFabricante().equals(marca)){
                System.out.println("");
                System.out.printf("%d - Ônibus da marca %s:\n",cont,marca);
                System.out.print("Placa: ");
                System.out.println(listaOnibus.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaOnibus.get(i).getModelo());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaOnibus.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaOnibus.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                System.out.println("");
            }           
            cont++;
        }
        
        System.out.println("");
        System.out.println("CAMINHÃO!");
        System.out.println("");
        cont = 1;
     
        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getFabricante().equals(marca)){
                System.out.println("");
                System.out.printf("%d - Caminhao da marca %s:\n",cont,marca);
                System.out.print("Placa: ");
                System.out.println(listaCaminhao.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaCaminhao.get(i).getModelo());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaCaminhao.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaCaminhao.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                System.out.println("");
            }
            cont++;
        }
    }
    
    public void pesqVeicModelo (String modelo) {
        int cont = 1;
        
        System.out.println("");
        System.out.println("MOTOCICLETA!");
        System.out.println("");
        
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getModelo().equals(modelo)){
                System.out.println("");
                System.out.printf("%d - Motocicleta do modelo %s:\n",cont,modelo);
                System.out.print("Placa: ");
                System.out.println(listaMotocicleta.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaMotocicleta.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaMotocicleta.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                System.out.println("");
            }   
            cont++;
        }     
        
                System.out.println("");
        System.out.println("UTILITÁRIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getModelo().equals(modelo)){
                System.out.println("");
                System.out.printf("%d - Utilitário do modelo %s:\n",cont,modelo);
                System.out.print("Placa: ");
                System.out.println(listaUtilitario.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaUtilitario.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaUtilitario.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaUtilitario.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                System.out.println("");
            }     
            cont++;
        }
        
                System.out.println("");
        System.out.println("PASSEIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getModelo().equals(modelo)){
                System.out.println("");
                System.out.printf("%d - Carro de Passeio do modelo %s:\n",cont,modelo);
                System.out.print("Placa: ");
                System.out.println(listaPasseio.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaPasseio.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaPasseio.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaPasseio.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                System.out.println("");
            }     
            cont++;
        }
        
                System.out.println("");
        System.out.println("ÔNIBUS!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getModelo().equals(modelo)){
                System.out.println("");
                System.out.printf("%d - Ônibus do modelo %s:\n",cont,modelo);
                System.out.print("Placa: ");
                System.out.println(listaOnibus.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaOnibus.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaOnibus.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaOnibus.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                System.out.println("");
            }    
            cont++;
        }
        
        System.out.println("");
        System.out.println("CAMINHÃO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getModelo().equals(modelo)){
                System.out.println("");
                System.out.printf("%d - Caminhão do modelo %s:\n",cont,modelo);
                System.out.print("Placa: ");
                System.out.println(listaCaminhao.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaCaminhao.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaCaminhao.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaCaminhao.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                System.out.println("");
            }
        cont++;
        }
               
    }
    
    public void pesqVeicAno (int ano) {
        int cont = 1;
        
                System.out.println("");
        System.out.println("MOTOCICLETA!");
        System.out.println("");
        
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getAnoFabrica() == ano){
                System.out.println("");
                System.out.printf("%d - Motocicleta do ano %d:\n",cont,ano);
                System.out.print("Placa: ");
                System.out.println(listaMotocicleta.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaMotocicleta.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaMotocicleta.get(i).getModelo());
                System.out.print("Valor da diária: ");
                System.out.println(listaMotocicleta.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                System.out.println("");
            }   
            cont++;
        }
        
                System.out.println("");
        System.out.println("UTILITÁRIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getAnoFabrica() == ano){
                System.out.println("");
                System.out.printf("%d - Utilitário do ano %d:\n",cont,ano);
                System.out.print("Placa: ");
                System.out.println(listaUtilitario.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaUtilitario.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaUtilitario.get(i).getModelo());
                System.out.print("Valor da diária: ");
                System.out.println(listaUtilitario.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                System.out.println("");
            }  
            cont++;
        }
        
                System.out.println("");
        System.out.println("PASSEIO!");
        System.out.println("");
        cont = 1;
                
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getAnoFabrica() == ano){
                System.out.println("");
                System.out.printf("%d - Carro de Passeio do ano %d:\n",cont,ano);
                System.out.print("Placa: ");
                System.out.println(listaPasseio.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaPasseio.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaPasseio.get(i).getModelo());
                System.out.print("Valor da diária: ");
                System.out.println(listaPasseio.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                System.out.println("");
            }    
            cont++;
        }
        
                System.out.println("");
        System.out.println("ÔNIBUS!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getAnoFabrica() == ano){
                System.out.println("");
                System.out.printf("%d - Ônibus do ano %d:\n",cont,ano);
                System.out.print("Placa: ");
                System.out.println(listaOnibus.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaOnibus.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaOnibus.get(i).getModelo());
                System.out.print("Valor da diária: ");
                System.out.println(listaOnibus.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                System.out.println("");
            }  
            cont++;
        }  
        
                System.out.println("");
        System.out.println("CAMINHÃO!");
        System.out.println("");
        cont = 1;
       
        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getAnoFabrica() == ano){
                System.out.println("");
                System.out.printf("%d - Caminhão do ano %d:\n",cont,ano);
                System.out.print("Placa: ");
                System.out.println(listaCaminhao.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaCaminhao.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaCaminhao.get(i).getModelo());
                System.out.print("Valor da diária: ");
                System.out.println(listaCaminhao.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                System.out.println("");
            }  
            cont++;
        } 
    }
    
    public void pesqVeicValor(double valor) {
        int cont = 1;
        
                System.out.println("");
        System.out.println("MOTOCICLETA!");
        System.out.println("");
        
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getValorDiaria() == valor){
                System.out.println("");
                System.out.printf("%d - Motocicleta do ano %.2f:\n",cont,valor);
                System.out.print("Placa: ");
                System.out.println(listaMotocicleta.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaMotocicleta.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaMotocicleta.get(i).getModelo());
                System.out.print("Ano da fabricação: ");
                System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                System.out.println("");
            }     
            cont++;
        }
        
                System.out.println("");
        System.out.println("UTILITÁRIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getValorDiaria() == valor){
                System.out.println("");
                System.out.printf("%d - Utilitário do ano %.2f:\n",cont,valor);
                System.out.print("Placa: ");
                System.out.println(listaUtilitario.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaUtilitario.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaUtilitario.get(i).getModelo());
                System.out.print("Ano da fabricação: ");
                System.out.println(listaUtilitario.get(i).getAnoFabrica());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                System.out.println("");
            }  
            cont++;
        }
        
                System.out.println("");
        System.out.println("PASSEIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getValorDiaria() == valor){
                System.out.println("");
                System.out.printf("%d - Carro de Passeio do ano %.2f:\n",cont,valor);
                System.out.print("Placa: ");
                System.out.println(listaPasseio.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaPasseio.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaPasseio.get(i).getModelo());
                System.out.print("Ano da fabricação: ");
                System.out.println(listaPasseio.get(i).getAnoFabrica());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                System.out.println("");
            }      
            cont++;
        }
        
                System.out.println("");
        System.out.println("ÔNIBUS!");
        System.out.println("");
        cont = 1;

         for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getValorDiaria() == valor){
                System.out.println("");
                System.out.printf("%d - Ônibus do ano %.2f:\n",cont,valor);
                System.out.print("Placa: ");
                System.out.println(listaOnibus.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaOnibus.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaOnibus.get(i).getModelo());
                System.out.print("Ano da fabricação: ");
                System.out.println(listaOnibus.get(i).getAnoFabrica());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                System.out.println("");
            }
            cont++;
        } 
         
                 System.out.println("");
        System.out.println("CAMINHÃO!");
        System.out.println("");
        cont = 1;

        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getValorDiaria() == valor){
                System.out.println("");
                System.out.printf("%d - Caminhão do ano %.2f:\n",cont,valor);
                System.out.print("Placa: ");
                System.out.println(listaCaminhao.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Fabricante: ");
                System.out.println(listaCaminhao.get(i).getFabricante());
                System.out.print("Modelo: ");
                System.out.println(listaCaminhao.get(i).getModelo());
                System.out.print("Ano da fabricação: ");
                System.out.println(listaCaminhao.get(i).getAnoFabrica());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                System.out.println("");
            }       
            cont++;
        }
        
  
    }
    
    public void listarVeicDisp () {
        int cont = 1;
        
        System.out.println("");
        System.out.println("MOTOCICLETA!");
        System.out.println("");
        
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getSituacao().equals("Disponível")){
                System.out.printf("%dº - Motocicleta disponível para locação:",cont);
                System.out.print("Placa: ");
                System.out.println(listaMotocicleta.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaMotocicleta.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaMotocicleta.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaMotocicleta.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaMotocicleta.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaMotocicleta.get(i).getSituacao());
                
                System.out.print("Potência: ");
                System.out.println(listaMotocicleta.get(i).getPotencia());
                System.out.print("Tipo da motocileta: ");
                System.out.println(listaMotocicleta.get(i).getTipoMoto());
                System.out.println("");
            }
        cont++;
        }
        
        System.out.println("");
        System.out.println("UTILITÁRIOS!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getSituacao().equals("Disponível")){
                System.out.printf("%dº - Utilitário disponível para locação:",cont);
                System.out.print("Placa: ");
                System.out.println(listaUtilitario.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaUtilitario.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaUtilitario.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaUtilitario.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaUtilitario.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaUtilitario.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaUtilitario.get(i).getSituacao());
           
                System.out.print("Tipo de tração: ");
                System.out.println(listaUtilitario.get(i).getTracao());
                if(listaUtilitario.get(i).isTetoSolar() == true){
                    System.out.println("Este veículo possui teto solar!");
                }else{
                    System.out.println("Este veículo não possui teto solar!");
                }
                System.out.print("Aro: ");
                System.out.println(listaUtilitario.get(i).getDiaAro());
                System.out.print("Tipo do veículo: ");
                System.out.println(listaUtilitario.get(i).getTipoUti());
                System.out.println("");
            }
        cont++;
        }
        
        System.out.println("");
        System.out.println("PASSEIO!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getSituacao().equals("Disponível")){
                System.out.printf("%dº - Carro de Passeio disponível para locação:",cont);
                System.out.print("Placa: ");
                System.out.println(listaPasseio.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaPasseio.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaPasseio.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaPasseio.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaPasseio.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaPasseio.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaPasseio.get(i).getSituacao());
                System.out.print("Número de portas: ");
                System.out.println(listaPasseio.get(i).getNumPortas());
                if(listaPasseio.get(i).isArCondi() == true){
                    System.out.println("Este veículo possui ar condicionado!");
                }else{
                    System.out.println("Este veículo não possui ar condicionado!");
                }
                if(listaPasseio.get(i).isDirHidr() == true){
                    System.out.println("Este veículo possui direção hidráulica!");
                }else{
                    System.out.println("Este veículo não possui direção hidráulica!");
                }
                System.out.println("");
            }
        cont++;
        }
        
        System.out.println("");
        System.out.println("ONIBUS!");
        System.out.println("");
        cont = 1;
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getSituacao().equals("Disponível")){
                System.out.printf("%dº - Ônibus disponível para locação:",cont);
                System.out.print("Placa: ");
                System.out.println(listaOnibus.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaOnibus.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaOnibus.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaOnibus.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaOnibus.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaOnibus.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaOnibus.get(i).getSituacao());
                
                System.out.print("Número de passageiros: ");
                System.out.println(listaOnibus.get(i).getNumPass());
                System.out.print("Número de eixos: ");
                System.out.println(listaOnibus.get(i).getNumEixosOni());
                System.out.println("");
            } 
        cont++;
        }   
        
        System.out.println("");
        System.out.println("CAMINHÃO!");
        System.out.println("");
        cont = 1;        

        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getSituacao().equals("Disponível")){
                System.out.printf("%dº - Caminhão disponível para locação:",cont);
                System.out.print("Placa: ");
                System.out.println(listaCaminhao.get(i).getPlaca());
                System.out.print("Cor: ");
                System.out.println(listaCaminhao.get(i).getCor());
                System.out.print("Modelo: ");
                System.out.println(listaCaminhao.get(i).getModelo());
                System.out.print("Fabricante: ");
                System.out.println(listaCaminhao.get(i).getFabricante());
                System.out.print("Ano de Fabricação: ");
                System.out.println(listaCaminhao.get(i).getAnoFabrica());
                System.out.print("Valor da diária: ");
                System.out.println(listaCaminhao.get(i).getValorDiaria());
                System.out.print("Situação do veículo: ");
                System.out.println(listaCaminhao.get(i).getSituacao());
                
                System.out.print("Capacidade carga: ");
                System.out.println(listaCaminhao.get(i).getCapCarga());
                System.out.print("Num de eixos: ");
                System.out.println(listaCaminhao.get(i).getNumEixosCam());
                System.out.print("Potencia: ");
                System.out.println(listaCaminhao.get(i).getPotenciaHP());
                System.out.println("");
            }            
        cont++;
        }
    }
    
    public void alugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo do veículo que você deseja alugar: ");
            System.out.println("1 - Motocicleta");
            System.out.println("2 - Utilitário");
            System.out.println("3 - Passeio");
            System.out.println("4 - Caminhão");
            System.out.println("5 - Ônibus");
                            
            int tipo = sc.nextInt();
            
            if(tipo == 1){
                                 
                    System.out.println("LISTANDO MOTOCICLETAS DISPONÍVEIS... ");
                    System.out.println("");
                    
                for(int i = 0; i<listaMotocicleta.size(); i++){                 
                if(listaMotocicleta.get(i).getSituacao().equals("Disponível")){
                    System.out.printf("%dº - Motocicleta disponível para locação:",i);
                    System.out.print("Placa: ");
                    System.out.println(listaMotocicleta.get(i).getPlaca());
                    System.out.print("Cor: ");
                    System.out.println(listaMotocicleta.get(i).getCor());
                    System.out.print("Modelo: ");
                    System.out.println(listaMotocicleta.get(i).getModelo());
                    System.out.print("Fabricante: ");
                    System.out.println(listaMotocicleta.get(i).getFabricante());
                    System.out.print("Ano de Fabricação: ");
                    System.out.println(listaMotocicleta.get(i).getAnoFabrica());
                    System.out.print("Valor da diária: ");
                    System.out.println(listaMotocicleta.get(i).getValorDiaria());
                    System.out.print("Situação do veículo: ");
                    System.out.println(listaMotocicleta.get(i).getSituacao());

                    System.out.print("Potência: ");
                    System.out.println(listaMotocicleta.get(i).getPotencia());
                    System.out.print("Tipo da motocileta: ");
                    System.out.println(listaMotocicleta.get(i).getTipoMoto());
                    System.out.println("");
                }            
            }
                
                System.out.println("Qual veículo você deseja alugar (Digite o número correspondente): ");
                tipo = sc.nextInt();
                if(tipo > 0 && tipo <listaMotocicleta.size()){
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String pessoa = sc.next();
                    listaMotocicleta.get(tipo).setNome(pessoa);
                    
                    //Date data = new Date();
                    //int diaLoc = data.getDay();
                    //int mesLoc = data.getMonth();
                    int diaLoc = 25;
                    int mesLoc = 6;
                    System.out.print("Dia de devolucação: ");
                    int diaDev = sc.nextInt();
                    System.out.print("Mês de devolucação: ");
                    int mesDev = sc.nextInt();
                    
                    if(mesDev>mesLoc){                                          
                        listaMotocicleta.get(tipo).setDiaLocacao(diaLoc);
                        listaMotocicleta.get(tipo).setMesLocacao(mesLoc);
                        listaMotocicleta.get(tipo).setDiaDevolucao(diaDev);
                        listaMotocicleta.get(tipo).setMesDevolucao(mesDev);
                        listaMotocicleta.get(tipo).setSituacao("Alugado");
                    }else if(mesDev==mesLoc){
                        if(diaDev>diaLoc){
                        listaMotocicleta.get(tipo).setDiaLocacao(diaLoc);
                        listaMotocicleta.get(tipo).setMesLocacao(mesLoc);
                        listaMotocicleta.get(tipo).setDiaDevolucao(diaDev);
                        listaMotocicleta.get(tipo).setMesDevolucao(mesDev);
                        listaMotocicleta.get(tipo).setSituacao("Alugado");
                        }
                    }else{
                        System.out.println("Data de devolução menor que a data de locação!");
                    }
                    
                }else{
                    System.out.println("Fora dos valores!");
                }
             
            }else if (tipo == 2){  
            for(int i = 0; i<listaUtilitario.size(); i++){
                if(listaUtilitario.get(i).getSituacao().equals("Disponível")){
                    System.out.printf("%dº - Utilitário disponível para locação:",i);
                    System.out.print("Placa: ");
                    System.out.println(listaUtilitario.get(i).getPlaca());
                    System.out.print("Cor: ");
                    System.out.println(listaUtilitario.get(i).getCor());
                    System.out.print("Modelo: ");
                    System.out.println(listaUtilitario.get(i).getModelo());
                    System.out.print("Fabricante: ");
                    System.out.println(listaUtilitario.get(i).getFabricante());
                    System.out.print("Ano de Fabricação: ");
                    System.out.println(listaUtilitario.get(i).getAnoFabrica());
                    System.out.print("Valor da diária: ");
                    System.out.println(listaUtilitario.get(i).getValorDiaria());
                    System.out.print("Situação do veículo: ");
                    System.out.println(listaUtilitario.get(i).getSituacao());

                    System.out.print("Tipo de tração: ");
                    System.out.println(listaUtilitario.get(i).getTracao());
                    if(listaUtilitario.get(i).isTetoSolar() == true){
                        System.out.println("Este veículo possui teto solar!");
                    }else{
                        System.out.println("Este veículo não possui teto solar!");
                    }
                    System.out.print("Aro: ");
                    System.out.println(listaUtilitario.get(i).getDiaAro());
                    System.out.print("Tipo do veículo: ");
                    System.out.println(listaUtilitario.get(i).getTipoUti());
                }            
            }

                    System.out.println("Qual veículo você deseja alugar: (Digite o número correspondente)");
                    tipo = sc.nextInt();
                    if(tipo > 0 && tipo <listaUtilitario.size()){
                        System.out.print("Nome: ");
                    sc.nextLine();
                    String pessoa = sc.next();
                        listaUtilitario.get(tipo).setNome(pessoa);

                        //Date data = new Date();
                    int diaLoc = 25;
                    int mesLoc = 6;
                        System.out.print("Dia de devolucação: ");
                        int diaDev = sc.nextInt();
                        System.out.print("Mês de devolucação: ");
                        int mesDev = sc.nextInt();
                        
                    if(mesDev>mesLoc){                                          
                        listaUtilitario.get(tipo).setDiaLocacao(diaLoc);
                        listaUtilitario.get(tipo).setMesLocacao(mesLoc);
                        listaUtilitario.get(tipo).setDiaDevolucao(diaDev);
                        listaUtilitario.get(tipo).setMesDevolucao(mesDev);
                        listaUtilitario.get(tipo).setSituacao("Alugado");
                    }else if(mesDev==mesLoc){
                        if(diaDev>diaLoc){
                        listaUtilitario.get(tipo).setDiaLocacao(diaLoc);
                        listaUtilitario.get(tipo).setMesLocacao(mesLoc);
                        listaUtilitario.get(tipo).setDiaDevolucao(diaDev);
                        listaUtilitario.get(tipo).setMesDevolucao(mesDev);
                        listaUtilitario.get(tipo).setSituacao("Alugado");
                        }
                    }else{
                        System.out.println("Data de devolução menor que a data de locação!");
                    }
                    
                }else{
                    System.out.println("Fora dos valores!");
                }
    
            }else if (tipo == 3){
            for(int i = 0; i<listaPasseio.size(); i++){
                if(listaPasseio.get(i).getSituacao().equals("Disponível")){
                    System.out.printf("%dº - Carro de Passeio disponível para locação:",i);
                    System.out.print("Placa: ");
                    System.out.println(listaPasseio.get(i).getPlaca());
                    System.out.print("Cor: ");
                    System.out.println(listaPasseio.get(i).getCor());
                    System.out.print("Modelo: ");
                    System.out.println(listaPasseio.get(i).getModelo());
                    System.out.print("Fabricante: ");
                    System.out.println(listaPasseio.get(i).getFabricante());
                    System.out.print("Ano de Fabricação: ");
                    System.out.println(listaPasseio.get(i).getAnoFabrica());
                    System.out.print("Valor da diária: ");
                    System.out.println(listaPasseio.get(i).getValorDiaria());
                    System.out.print("Situação do veículo: ");
                    System.out.println(listaPasseio.get(i).getSituacao());
                    System.out.print("Número de portas: ");
                    System.out.println(listaPasseio.get(i).getNumPortas());
                    if(listaPasseio.get(i).isArCondi() == true){
                        System.out.println("Este veículo possui ar condicionado!");
                    }else{
                        System.out.println("Este veículo não possui ar condicionado!");
                    }
                    if(listaPasseio.get(i).isDirHidr() == true){
                        System.out.println("Este veículo possui direção hidráulica!");
                    }else{
                        System.out.println("Este veículo não possui direção hidráulica!");
                    }
                }            
            }
            
                System.out.println("Qual veículo você deseja alugar: (Digite o número correspondente)");
                    tipo = sc.nextInt();
                    if(tipo > 0 && tipo <listaPasseio.size()){
                        System.out.print("Nome: ");
                    sc.nextLine();
                    String pessoa = sc.next();
                        listaPasseio.get(tipo).setNome(pessoa);

                    int diaLoc = 25;
                    int mesLoc = 6;
                        System.out.print("Dia de devolucação: ");
                        int diaDev = sc.nextInt();
                        System.out.print("Mês de devolucação: ");
                        int mesDev = sc.nextInt();
                        
                    if(mesDev>mesLoc){                                          
                        listaPasseio.get(tipo).setDiaLocacao(diaLoc);
                        listaPasseio.get(tipo).setMesLocacao(mesLoc);
                        listaPasseio.get(tipo).setDiaDevolucao(diaDev);
                        listaPasseio.get(tipo).setMesDevolucao(mesDev);
                        listaPasseio.get(tipo).setSituacao("Alugado");
                    }else if(mesDev==mesLoc){
                        if(diaDev>diaLoc){
                        listaPasseio.get(tipo).setDiaLocacao(diaLoc);
                        listaPasseio.get(tipo).setMesLocacao(mesLoc);
                        listaPasseio.get(tipo).setDiaDevolucao(diaDev);
                        listaPasseio.get(tipo).setMesDevolucao(mesDev);
                        listaPasseio.get(tipo).setSituacao("Alugado");
                        }
                    }else{
                        System.out.println("Data de devolução menor que a data de locação!");
                    }

                }else{
                    System.out.println("Fora dos valores!");
                }
                
            }else if (tipo == 4){
            for(int i = 0; i<listaOnibus.size(); i++){
                if(listaOnibus.get(i).getSituacao().equals("Disponível")){
                    System.out.printf("%dº - Ônibus disponível para locação:",i);
                    System.out.print("Placa: ");
                    System.out.println(listaOnibus.get(i).getPlaca());
                    System.out.print("Cor: ");
                    System.out.println(listaOnibus.get(i).getCor());
                    System.out.print("Modelo: ");
                    System.out.println(listaOnibus.get(i).getModelo());
                    System.out.print("Fabricante: ");
                    System.out.println(listaOnibus.get(i).getFabricante());
                    System.out.print("Ano de Fabricação: ");
                    System.out.println(listaOnibus.get(i).getAnoFabrica());
                    System.out.print("Valor da diária: ");
                    System.out.println(listaOnibus.get(i).getValorDiaria());
                    System.out.print("Situação do veículo: ");
                    System.out.println(listaOnibus.get(i).getSituacao());

                    System.out.print("Número de passageiros: ");
                    System.out.println(listaOnibus.get(i).getNumPass());
                    System.out.print("Número de eixos: ");
                    System.out.println(listaOnibus.get(i).getNumEixosOni());
                }            
            }   
            
            System.out.println("Qual veículo você deseja alugar: (Digite o número correspondente)");
                    tipo = sc.nextInt();
                    if(tipo > 0 && tipo <listaOnibus.size()){
                        System.out.print("Nome: ");
                    sc.nextLine();
                    String pessoa = sc.next();
                        listaOnibus.get(tipo).setNome(pessoa);

                    int diaLoc = 25;
                    int mesLoc = 6;
                        System.out.print("Dia de devolucação: ");
                        int diaDev = sc.nextInt();
                        System.out.print("Mês de devolucação: ");
                        int mesDev = sc.nextInt();        
                        
                    if(mesDev>mesLoc){                                          
                        listaOnibus.get(tipo).setDiaLocacao(diaLoc);
                        listaOnibus.get(tipo).setMesLocacao(mesLoc);
                        listaOnibus.get(tipo).setDiaDevolucao(diaDev);
                        listaOnibus.get(tipo).setMesDevolucao(mesDev);
                        listaOnibus.get(tipo).setSituacao("Alugado");
                    }else if(mesDev==mesLoc){
                        if(diaDev>diaLoc){
                        listaOnibus.get(tipo).setDiaLocacao(diaLoc);
                        listaOnibus.get(tipo).setMesLocacao(mesLoc);
                        listaOnibus.get(tipo).setDiaDevolucao(diaDev);
                        listaOnibus.get(tipo).setMesDevolucao(mesDev);
                        listaOnibus.get(tipo).setSituacao("Alugado");
                        }
                    }else{
                        System.out.println("Data de devolução menor que a data de locação!");
                    }
                    
                }else{
                    System.out.println("Fora dos valores!");
                }
                
            }else if (tipo == 5){
            for(int i = 0; i<listaCaminhao.size(); i++){
                if(listaCaminhao.get(i).getSituacao().equals("Disponível")){
                    System.out.printf("%dº - Caminhão disponível para locação:",i);
                    System.out.print("Placa: ");
                    System.out.println(listaCaminhao.get(i).getPlaca());
                    System.out.print("Cor: ");
                    System.out.println(listaCaminhao.get(i).getCor());
                    System.out.print("Modelo: ");
                    System.out.println(listaCaminhao.get(i).getModelo());
                    System.out.print("Fabricante: ");
                    System.out.println(listaCaminhao.get(i).getFabricante());
                    System.out.print("Ano de Fabricação: ");
                    System.out.println(listaCaminhao.get(i).getAnoFabrica());
                    System.out.print("Valor da diária: ");
                    System.out.println(listaCaminhao.get(i).getValorDiaria());
                    System.out.print("Situação do veículo: ");
                    System.out.println(listaCaminhao.get(i).getSituacao());

                    System.out.print("Capacidade carga: ");
                    System.out.println(listaCaminhao.get(i).getCapCarga());
                    System.out.print("Num de eixos: ");
                    System.out.println(listaCaminhao.get(i).getNumEixosCam());
                    System.out.print("Potencia: ");
                    System.out.println(listaCaminhao.get(i).getPotenciaHP());
                }            
            }  
            
            System.out.println("Qual veículo você deseja alugar: (Digite o número correspondente)");
                tipo = sc.nextInt();
                if(tipo > 0 && tipo <listaCaminhao.size()){
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String pessoa = sc.next();
                    listaCaminhao.get(tipo).setNome(pessoa);

                    int diaLoc = 25;
                    int mesLoc = 6;
                    System.out.print("Dia de devolucação: ");
                    int diaDev = sc.nextInt();
                    System.out.print("Mês de devolucação: ");
                    int mesDev = sc.nextInt();

                     if(mesDev>mesLoc){                                          
                        listaCaminhao.get(tipo).setDiaLocacao(diaLoc);
                        listaCaminhao.get(tipo).setMesLocacao(mesLoc);
                        listaCaminhao.get(tipo).setDiaDevolucao(diaDev);
                        listaCaminhao.get(tipo).setMesDevolucao(mesDev);
                        listaCaminhao.get(tipo).setSituacao("Alugado");
                    }else if(mesDev==mesLoc){
                        if(diaDev>diaLoc){
                        listaCaminhao.get(tipo).setDiaLocacao(diaLoc);
                        listaCaminhao.get(tipo).setMesLocacao(mesLoc);
                        listaCaminhao.get(tipo).setDiaDevolucao(diaDev);
                        listaCaminhao.get(tipo).setMesDevolucao(mesDev);
                        listaCaminhao.get(tipo).setSituacao("Alugado");
                        }
                    }else{
                        System.out.println("Data de devolução menor que a data de locação!");
                    }

                }else{
                    System.out.println("Fora dos valores!");
                }
            }
    }
    
    public void devolver(){
        System.out.println("Digite a placa do carro alugado!");
        Scanner sc = new Scanner(System.in);
        String placa = sc.nextLine();
        for(int i = 0; i<listaMotocicleta.size(); i++){
            if(listaMotocicleta.get(i).getPlaca().equals(placa)){
                
                if(listaMotocicleta.get(i).getMesDevolucao() == listaMotocicleta.get(i).getMesLocacao()){
                    listaMotocicleta.get(i).setLucro((listaMotocicleta.get(i).getDiaDevolucao()-listaMotocicleta.get(i).getDiaLocacao())*listaMotocicleta.get(i).getValorDiaria());                             
                }else{
                    int n = listaMotocicleta.get(i).getMesDevolucao() - listaMotocicleta.get(i).getMesLocacao();
                    n = n+1;
                    if(n==2){
                        listaMotocicleta.get(i).setLucro(((30-listaMotocicleta.get(i).getDiaLocacao())+listaMotocicleta.get(i).getDiaDevolucao())*listaMotocicleta.get(i).getValorDiaria());
                    }else{
                    n = (n-2)*30;
                    n = n + (30 - listaMotocicleta.get(i).getDiaLocacao());
                    n = n + listaMotocicleta.get(i).getDiaDevolucao();
                    listaMotocicleta.get(i).setLucro(n*listaMotocicleta.get(i).getValorDiaria());
                    }
                }

                System.out.println("Veículo encontrado com sucesso!");
                System.out.print("Nome do locador: ");
                System.out.println(listaMotocicleta.get(i).getNome());
                System.out.print("Data de locação: ");
                System.out.print(listaMotocicleta.get(i).getDiaLocacao());
                System.out.print("/");
                System.out.println(listaMotocicleta.get(i).getMesLocacao());
                System.out.print("Data de devolução: ");
                System.out.print(listaMotocicleta.get(i).getDiaDevolucao());
                System.out.print("/");
                System.out.println(listaMotocicleta.get(i).getMesDevolucao());
                System.out.print("Valor total a pagar: ");
                System.out.println(listaMotocicleta.get(i).getLucro());           
                
                System.out.print("Qual situação o veículo irá se tornar: (1:TORNAR DISPONÍVEL/2: EM MANUTENÇÃO): ");
                int decisao = sc.nextInt();
                if(decisao == 1){
                    listaMotocicleta.get(i).setSituacao("Disponível"); 
                }else if(decisao == 2){
                    listaMotocicleta.get(i).setSituacao("Manutenção");
                }    
            }
        }
        
        for(int i = 0; i<listaUtilitario.size(); i++){
            if(listaUtilitario.get(i).getPlaca().equals(placa)){
                
                if(listaUtilitario.get(i).getMesDevolucao() == listaUtilitario.get(i).getMesLocacao()){
                    listaUtilitario.get(i).setLucro((listaUtilitario.get(i).getDiaDevolucao()-listaUtilitario.get(i).getDiaLocacao())*listaUtilitario.get(i).getValorDiaria());                             
                }else{
                    int n = listaUtilitario.get(i).getMesDevolucao() - listaUtilitario.get(i).getMesLocacao();
                    n = n+1;
                    if(n==2){
                        listaUtilitario.get(i).setLucro(((30-listaUtilitario.get(i).getDiaLocacao())+listaUtilitario.get(i).getDiaDevolucao())*listaUtilitario.get(i).getValorDiaria());
                    }else{
                    n = (n-2)*30;
                    n = n + (30 - listaUtilitario.get(i).getDiaLocacao());
                    n = n + listaUtilitario.get(i).getDiaDevolucao();
                    listaUtilitario.get(i).setLucro(n*listaUtilitario.get(i).getValorDiaria());
                    }
                }

                System.out.println("Veículo encontrado com sucesso!");
                System.out.print("Nome do locador: ");
                System.out.println(listaUtilitario.get(i).getNome());
                System.out.print("Data de locação: ");
                System.out.print(listaUtilitario.get(i).getDiaLocacao());
                System.out.print("/");
                System.out.println(listaUtilitario.get(i).getMesLocacao());
                System.out.print("Data de devolução: ");
                System.out.print(listaUtilitario.get(i).getDiaDevolucao());
                System.out.print("/");
                System.out.println(listaUtilitario.get(i).getMesDevolucao());
                System.out.print("Valor total a pagar: ");
                System.out.println(listaUtilitario.get(i).getLucro());           
                
                System.out.print("Qual situação o veículo irá se tornar: (1:TORNAR DISPONÍVEL/2: EM MANUTENÇÃO): ");
                int decisao = sc.nextInt();
                if(decisao == 1){
                    listaUtilitario.get(i).setSituacao("Disponível"); 
                }else if(decisao == 2){
                    listaUtilitario.get(i).setSituacao("Manutenção");
                }    
            }
        }
        
        for(int i = 0; i<listaPasseio.size(); i++){
            if(listaPasseio.get(i).getPlaca().equals(placa)){
                
                if(listaPasseio.get(i).getMesDevolucao() == listaPasseio.get(i).getMesLocacao()){
                    listaPasseio.get(i).setLucro((listaPasseio.get(i).getDiaDevolucao()-listaPasseio.get(i).getDiaLocacao())*listaPasseio.get(i).getValorDiaria());                             
                }else{
                    int n = listaPasseio.get(i).getMesDevolucao() - listaPasseio.get(i).getMesLocacao();
                    n = n+1;
                    if(n==2){
                        listaPasseio.get(i).setLucro(((30-listaPasseio.get(i).getDiaLocacao())+listaPasseio.get(i).getDiaDevolucao())*listaPasseio.get(i).getValorDiaria());
                    }else{
                    n = (n-2)*30;
                    n = n + (30 - listaPasseio.get(i).getDiaLocacao());
                    n = n + listaPasseio.get(i).getDiaDevolucao();
                    listaPasseio.get(i).setLucro(n*listaPasseio.get(i).getValorDiaria());
                    }
                }

                System.out.println("Veículo encontrado com sucesso!");
                System.out.print("Nome do locador: ");
                System.out.println(listaPasseio.get(i).getNome());
                System.out.print("Data de locação: ");
                System.out.print(listaPasseio.get(i).getDiaLocacao());
                System.out.print("/");
                System.out.println(listaPasseio.get(i).getMesLocacao());
                System.out.print("Data de devolução: ");
                System.out.print(listaPasseio.get(i).getDiaDevolucao());
                System.out.print("/");
                System.out.println(listaPasseio.get(i).getMesDevolucao());
                System.out.print("Valor total a pagar: ");
                System.out.println(listaPasseio.get(i).getLucro());           
                
                System.out.print("Qual situação o veículo irá se tornar: (1:TORNAR DISPONÍVEL/2: EM MANUTENÇÃO): ");
                int decisao = sc.nextInt();
                if(decisao == 1){
                    listaPasseio.get(i).setSituacao("Disponível"); 
                }else if(decisao == 2){
                    listaPasseio.get(i).setSituacao("Manutenção");
                }    
            }
        }
        
        
        for(int i = 0; i<listaOnibus.size(); i++){
            if(listaOnibus.get(i).getPlaca().equals(placa)){
                
                if(listaOnibus.get(i).getMesDevolucao() == listaOnibus.get(i).getMesLocacao()){
                    listaOnibus.get(i).setLucro((listaOnibus.get(i).getDiaDevolucao()-listaOnibus.get(i).getDiaLocacao())*listaOnibus.get(i).getValorDiaria());                             
                }else{
                    int n = listaOnibus.get(i).getMesDevolucao() - listaOnibus.get(i).getMesLocacao();
                    n = n+1;
                    if(n==2){
                        listaOnibus.get(i).setLucro(((30-listaOnibus.get(i).getDiaLocacao())+listaOnibus.get(i).getDiaDevolucao())*listaOnibus.get(i).getValorDiaria());
                    }else{
                    n = (n-2)*30;
                    n = n + (30 - listaOnibus.get(i).getDiaLocacao());
                    n = n + listaOnibus.get(i).getDiaDevolucao();
                    listaOnibus.get(i).setLucro(n*listaOnibus.get(i).getValorDiaria());
                    }
                }

                System.out.println("Veículo encontrado com sucesso!");
                System.out.print("Nome do locador: ");
                System.out.println(listaOnibus.get(i).getNome());
                System.out.print("Data de locação: ");
                System.out.print(listaOnibus.get(i).getDiaLocacao());
                System.out.print("/");
                System.out.println(listaOnibus.get(i).getMesLocacao());
                System.out.print("Data de devolução: ");
                System.out.print(listaOnibus.get(i).getDiaDevolucao());
                System.out.print("/");
                System.out.println(listaOnibus.get(i).getMesDevolucao());
                System.out.print("Valor total a pagar: ");
                System.out.println(listaOnibus.get(i).getLucro());           
                
                System.out.print("Qual situação o veículo irá se tornar: (1:TORNAR DISPONÍVEL/2: EM MANUTENÇÃO): ");
                int decisao = sc.nextInt();
                if(decisao == 1){
                    listaOnibus.get(i).setSituacao("Disponível"); 
                }else if(decisao == 2){
                    listaOnibus.get(i).setSituacao("Manutenção");
                }    
            }
        }
        
                
        for(int i = 0; i<listaCaminhao.size(); i++){
            if(listaCaminhao.get(i).getPlaca().equals(placa)){
                
                if(listaCaminhao.get(i).getMesDevolucao() == listaCaminhao.get(i).getMesLocacao()){
                    listaCaminhao.get(i).setLucro((listaCaminhao.get(i).getDiaDevolucao()-listaCaminhao.get(i).getDiaLocacao())*listaCaminhao.get(i).getValorDiaria());                             
                }else{
                    int n = listaCaminhao.get(i).getMesDevolucao() - listaCaminhao.get(i).getMesLocacao();
                    n = n+1;
                    if(n==2){
                        listaCaminhao.get(i).setLucro(((30-listaCaminhao.get(i).getDiaLocacao())+listaCaminhao.get(i).getDiaDevolucao())*listaCaminhao.get(i).getValorDiaria());
                    }else{
                    n = (n-2)*30;
                    n = n + (30 - listaCaminhao.get(i).getDiaLocacao());
                    n = n + listaCaminhao.get(i).getDiaDevolucao();
                    listaCaminhao.get(i).setLucro(n*listaCaminhao.get(i).getValorDiaria());
                    }
                }

                System.out.println("Veículo encontrado com sucesso!");
                System.out.print("Nome do locador: ");
                System.out.println(listaCaminhao.get(i).getNome());
                System.out.print("Data de locação: ");
                System.out.print(listaCaminhao.get(i).getDiaLocacao());
                System.out.print("/");
                System.out.println(listaCaminhao.get(i).getMesLocacao());
                System.out.print("Data de devolução: ");
                System.out.print(listaCaminhao.get(i).getDiaDevolucao());
                System.out.print("/");
                System.out.println(listaCaminhao.get(i).getMesDevolucao());
                System.out.print("Valor total a pagar: ");
                System.out.println(listaCaminhao.get(i).getLucro());           
                
                System.out.print("Qual situação o veículo irá se tornar: (1:TORNAR DISPONÍVEL/2: EM MANUTENÇÃO): ");
                int decisao = sc.nextInt();
                if(decisao == 1){
                    listaCaminhao.get(i).setSituacao("Disponível"); 
                }else if(decisao == 2){
                    listaCaminhao.get(i).setSituacao("Manutenção");
                }    
            }
        }
        
    }
    
}