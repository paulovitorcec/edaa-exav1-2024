import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        File arquivo = new File("C:\\Users\\paulo\\Downloads\\fifa_countries_audience.csv");

        if (!arquivo.exists()) {
            System.out.println("*Arquivo não encontrado!!!*");
            return;
        }
        
        Scanner scanner = new Scanner(arquivo);
        scanner.useDelimiter("\n");
        scanner.next();
        
        ArrayList<Fifa> dadosFifa = new ArrayList<>();
        
        while(scanner.hasNext()) {
            String linha = scanner.nextLine();
            String delimitador = ",";
            String coluna[] = linha.split(delimitador);
        
            if (coluna.length >= 5) {
                String pais = coluna[0].trim(); 
                String confederacao = coluna [1].trim();
                Float populacaoglobal = Float.parseFloat(coluna[2].trim());
                Float audienciatv = Float.parseFloat(coluna[3].trim());
                Float pibponderado = Float.parseFloat(coluna[4].trim());
        
                dadosFifa.add(new Fifa(pais, confederacao, populacaoglobal,  audienciatv, pibponderado));
            }
        }
        Scanner input = new Scanner(System.in);
        int escolha = 0;

                do{ 
                    System.out.println("Escolha uma opçao:");
                    System.out.println("Digite [1] para ordenar por ordem alfabética.");
                    System.out.println("Digite [2] para ordenar por audiência de TV.");
                    System.out.println("Digite [3] para encerrar o programa.");

                    escolha = input.nextInt();

                    switch(escolha) {
                        case 1:
                                System.out.println("Lista de países ordenada por ordem alfabética:");
                                Fifa.sortPaises(dadosFifa);
                                Fifa.imprimirLista(dadosFifa);
                                break;
                                
                        case 2: 
                        System.out.println("Lista de países ordenada por audiência de TV:");
                        Fifa.sortAudiencia(dadosFifa);
                        Fifa.imprimirLista(dadosFifa);
                        break;

                        case 3:
                        System.out.println("PROGRAMA ENCERRADO!");
                        break;
                    default:
                    System.out.println("*Opção inválida!!! Escolha novamente!!!*");
                    }
                } while (escolha != 3);

                input.close();

            }
    }
