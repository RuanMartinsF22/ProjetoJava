package desafiocarro;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CarroMain {

    public static void main(String[] args) {

        ArrayList<CarroClass> carros = new ArrayList<>();

        CarroClass c1 = new CarroClass();
        System.out.println("Adicione um carro a sua garagem: ");
        c1.setMarca(JOptionPane.showInputDialog("Diga a marca do seu carro"));
        c1.setModelo(JOptionPane.showInputDialog("Diga o modelo"));
        c1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Diga o ano:")));
        c1.setCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de combustível tem no carro?")));
        c1.setKmInicial(Double.parseDouble(JOptionPane.showInputDialog("Quantos km rodados?")));
        c1.abastecer(Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de combustível deseja abastecer?")));

        carros.add(c1);

        System.out.println(c1.detalhes());

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Remover carro");
            System.out.println("3 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    CarroClass novoCarro = new CarroClass();
                    System.out.println("Adicione um carro a sua garagem: ");
                    novoCarro.setMarca(JOptionPane.showInputDialog("Diga a marca do seu carro"));
                    novoCarro.setModelo(JOptionPane.showInputDialog("Diga o modelo"));
                    novoCarro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Diga o ano:")));
                    carros.add(novoCarro);
                    System.out.println(novoCarro.detalhes());
                    break;


                case 2:
                    if (carros.size() > 0) {
                        System.out.println("Escolha um carro para remover: ");
                        for (int i = 0; i < carros.size(); i++) {
                            System.out.println(i + " - " + carros.get(i).detalhes());
                        }
                        int escolha = entrada.nextInt();
                        carros.remove(escolha);
                        System.out.println("Carro removido com sucesso!");
                    } else {
                        System.out.println("Não há carros na garagem.");
                    }
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        entrada.close();
    }
}