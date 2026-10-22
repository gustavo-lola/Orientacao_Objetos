package Lista10;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Seguro> listaSeguros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("SISTEMA DE GESTÃO DE SEGUROS");
            System.out.println("1. Cadastrar um novo seguro");
            System.out.println("2. Listar todos os seguros cadastrados");
            System.out.println("3. Calcular o prêmio de um seguro individual (pelo nome)");
            System.out.println("4. Exibir o valor total dos prêmios cadastrados");
            System.out.println("0. Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n TIPO DE SEGURO");
                    System.out.println("1. Residencial");
                    System.out.println("2. Automotivo");
                    System.out.println("3. De Vida");
                    System.out.print("Selecione o tipo: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Código do seguro: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do segurado: ");
                    String nome = scanner.nextLine();

                    System.out.print("Valor segurado: ");
                    double valorSegurado = scanner.nextDouble();

                    System.out.print("Valor base do seguro: ");
                    double valorBase = scanner.nextDouble();

                    if (tipo == 1) {
                        listaSeguros.add(new SeguroResidencial(codigo, nome, valorSegurado, valorBase));
                        System.out.println(" Seguro Residencial cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        listaSeguros.add(new SeguroAutomotivo(codigo, nome, valorSegurado, valorBase));
                        System.out.println(" Seguro Automotivo cadastrado com sucesso!");
                    } else if (tipo == 3) {
                        System.out.print("Idade do segurado: ");
                        int idade = scanner.nextInt();
                        listaSeguros.add(new SeguroVida(codigo, nome, valorSegurado, valorBase, idade));
                        System.out.println("Seguro de Vida cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo de seguro inválido!");
                    }
                    break;

                case 2:
                    if (listaSeguros.isEmpty()) {
                        System.out.println("\n>> Nenhum seguro cadastrado no momento.");
                    } else {
                        System.out.println("\n--- LISTA DE SEGUROS ---");
                        for (Seguro s : listaSeguros) {
                            System.out.println("Código: " + s.getCodigo() +
                                    " | Segurado: " + s.getNomeSegurado() +
                                    " | Modalidade: " + s.getClass().getSimpleName() +
                                    " | Prêmio: R$ " + String.format("%.2f", s.calcularPremio()));
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o nome do segurado que deseja buscar: ");
                    String buscaNome = scanner.nextLine();
                    boolean encontrado = false;

                    for (Seguro s : listaSeguros) {
                        if (s.getNomeSegurado().equalsIgnoreCase(buscaNome)) {
                            System.out.println(">> Seguro encontrado!");
                            System.out.println("Modalidade: " + s.getClass().getSimpleName());
                            System.out.println("Valor do Prêmio: R$ " + String.format("%.2f", s.calcularPremio()));
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println(">> Nenhum seguro encontrado para o nome: " + buscaNome);
                    }
                    break;

                case 4:
                    double totalPremios = 0;
                    for (Seguro s : listaSeguros) {
                        totalPremios += s.calcularPremio();
                    }
                    System.out.println("\n>> Valor total de todos os prêmios: R$ " + String.format("%.2f", totalPremios));
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("\n>> Opção inválida! Escolha uma opção entre 0 e 4.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}