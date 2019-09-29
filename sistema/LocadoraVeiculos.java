package sistema;
import java.util.Scanner;

public class LocadoraVeiculos {

    public static void main(String[] args) {
        
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Controle controle = new Controle();
        
        Passeio t1 = new Passeio("POC-3030", "Preto", "Quick", "Renault", 2018, 150, "Disponível", 4, true, true);
        controle.addPasseio(t1);
        Passeio t2 = new Passeio("POC-3584", "Vermelho", "Tiguan", "Volkswagen", 2018, 150, "Disponível", 4, true, true);
        controle.addPasseio(t2);
        Passeio t3 = new Passeio("POC-8565", "Branco", "Quick", "Renault", 2018, 150, "Disponível", 4, true, true);
        controle.addPasseio(t3);
        Passeio t4 = new Passeio("POC-1111", "Preto", "Quick", "Renault", 2018, 150, "Disponível", 4, true, true);
        controle.addPasseio(t4);
        Passeio t5 = new Passeio("POC-6666", "Vermelho", "Quick", "Renault", 2018, 150, "Disponível", 4, true, true);
        controle.addPasseio(t5);
        Utilitario l1 = new Utilitario("POC-2222", "Vermelho", "Fiesta", "Ford", 2018, 150, "Disponível", true, 19, "Dianteira", "Urbano");        
        controle.addUtilitario(l1);
        Utilitario l2 = new Utilitario("POC-3333", "Vermelho", "Up", "Fiat", 2018, 150, "Disponível", true, 15, "Dianteira", "Urbano");        
        controle.addUtilitario(l2);
        Utilitario l3 = new Utilitario("POC-4444", "Vermelho", "Onix", "Ford", 2018, 150, "Disponível", true, 13, "Dianteira", "Urbano");        
        controle.addUtilitario(l3);
        Utilitario l4 = new Utilitario("POC-5555", "Vermelho", "Clio", "Renault", 2018, 150, "Disponível", true, 13, "Dianteira", "Urbano");        
        controle.addUtilitario(l4);
        Utilitario l5 = new Utilitario("POC-7777", "Vermelho", "Golf", "Volksvagem", 2018, 150, "Disponível", true, 19, "Dianteira", "Urbano");        
        controle.addUtilitario(l5);
        Motocicleta a1 = new Motocicleta("SAE-1234", "Azul", "Bross", "Yamaha", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a1);
        Motocicleta a2 = new Motocicleta("SAE-5678", "Azul", "Bross", "Yamaha", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a2);
        Motocicleta a3 = new Motocicleta("SAE-9101", "Azul", "Scuter", "Honda", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a3);
        Motocicleta a4 = new Motocicleta("SAE-1213", "Azul", "Scuter", "Honda", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a4);
        Motocicleta a5 = new Motocicleta("SAE-1415", "Azul", "Bross", "Yamaha", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a5);
        Motocicleta a6 = new Motocicleta("SAE-1617", "Azul", "Bross", "Honda", 2017, 80, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a6);
        Motocicleta a7 = new Motocicleta("SAE-1819", "Azul", "Bross", "Yamaha", 2017, 100, "Disponível", 120, "Off-Road");        
        controle.addMotocicleta(a7);
        Onibus k1 = new Onibus("COP-2021","Preto", "Adamo", "Scania", 2015, 700, "Disponível", 37, 2);
        controle.addOnibus(k1);
        Onibus k2 = new Onibus("COP-2021","Preto", "Adamo", "Scania", 2015, 700, "Disponível", 37, 2);
        controle.addOnibus(k2);
        Onibus k3 = new Onibus("COP-2323","Preto", "Adamo", "Scania", 2015, 700, "Disponível", 37, 2);
        controle.addOnibus(k3);
        Onibus k4 = new Onibus("COP-2425","Preto", "Adamo", "Scania", 2015, 700, "Disponível", 37, 2);
        controle.addOnibus(k4);
        Onibus k5 = new Onibus("COP-2627","Preto", "Adamo", "Scania", 2015, 700, "Disponível", 37, 2);
        controle.addOnibus(k5);
        Caminhao k6 = new Caminhao("SON-2829","Verde", "Adamo", "Scania", 2011, 800, "Disponível", 700, 3, 200);
        controle.addCaminhao(k6);
        Caminhao k7 = new Caminhao("SON-3031","Verde", "Adamo", "Scania", 2011, 800, "Disponível", 700, 3, 200);
        controle.addCaminhao(k7);
        Caminhao k8 = new Caminhao("SON-3233","Verde", "Adamo", "Scania", 2011, 800, "Disponível", 700, 3, 200);
        controle.addCaminhao(k8);
        Caminhao k9 = new Caminhao("SON-3435","Verde", "Adamo", "Scania", 2011, 800, "Disponível", 700, 3, 200);
        controle.addCaminhao(k9);
        Caminhao k10 = new Caminhao("SON-3637","Verde", "Adamo", "Scania", 2011, 800, "Disponível", 700, 3, 200);
        controle.addCaminhao(k10);
       
        while(i==0){
            System.out.println("1 - Cadastrar carro na loja");
            System.out.println("2 - Consultar Carro (Placa)");
            System.out.println("3 - Pesquisar Carros (Marca/Modelo/Ano/Valor)");
            System.out.println("4 - Listagem de carros disponíveis");
            System.out.println("5 - Alugar");
            System.out.println("6 - Devolver");
            System.out.println("7 - Finalizar");
        
            int tipoMenu = sc.nextInt();
                
        switch (tipoMenu){
            case 1 : 
                controle.cadastrarVeiculo();
                break;
            case 2 :
                System.out.println("Digite a placa: ");
                    String placa;
                    sc.nextLine();
                    placa = sc.next();
                    System.out.println("");
                    controle.consultarVeiculo(placa);  
                    System.out.println("");
                    break;
            case 3 :
                System.out.println("");
                System.out.println("Escolha o tipo de pesquisa: ");
                    System.out.println("1 - Marca");
                    System.out.println("2 - Modelo");
                    System.out.println("3 - Ano");
                    System.out.println("4 - Valor");
                    int menu = sc.nextInt();
                    if(menu == 1){
                        System.out.print("Digite a marca: ");
                        String marca;
                        sc.nextLine();
                        marca = sc.nextLine();
                        controle.pesqVeicMarca(marca);
                    }else if (menu == 2){
                        System.out.print("Digite a modelo: ");
                        String modelo;
                        sc.nextLine();
                        modelo = sc.nextLine();
                        controle.pesqVeicModelo(modelo);
                    }else if (menu == 3){
                        System.out.print("Digite o ano: ");
                        int ano = sc.nextInt();
                        controle.pesqVeicAno(ano);
                    }else if (menu == 4){
                        System.out.print("Digite o valor: ");
                        double valor = sc.nextDouble();
                        controle.pesqVeicValor(valor);
                    }
                    break;
            case 4 :
                controle.listarVeicDisp();
                break;
            case 5 :
                controle.alugar();
                break;
            case 6 :
                controle.devolver();
                break;
            case 7 : i = 1; break;
            default : System.out.println("Digite os valores referentes ao menu!"); break;
        }  
    }
        sc.close(); 
    }
}
