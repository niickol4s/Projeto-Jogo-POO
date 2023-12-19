import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guerreiro guerreiro = new Guerreiro("Sir Arthur Dayne, o Lâmina Dourada", 20, 5);
        Mago mago = new Mago("Magnus, o Sombra Branca", 20, 5);

        int opcao;

        do {
            System.out.println("\nSpells and Blades: The Fury of The Steel\n");
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Jogar;");
            System.out.println("2 - História;");
            System.out.println("0 - Sair.");
            System.out.print("\nOpção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nJogar\n");
                    System.out.println("Em uma missão real, " + guerreiro.getNome() + " atravessa a floresta sombria. Mas algo o observa entre as árvores...\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");

                    mago.atacar(mago);
                    System.out.println(mago.getNome() + " - Vida: " + mago.getVida() + ", Magia: " + mago.getMagia() + "\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");
                    break;
                case 2:
                    System.out.println("\nHistória\n");
                    System.out.println("Em um continente devastado pela guerra, poderosos reinos e povos travam uma disputa mortal \n pelo domínio de seus territórios e pelo controle de poderes ancestrais.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        System.out.println("Spells and Blades: The Fury of The Steel - Jogo Encerrado.");

    }
}
