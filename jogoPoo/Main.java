import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Guerreiro guerreiro = new Guerreiro("Sir Eric HightStone, o Lâmina Dourada", 20, 5);
        Mago mago = new Mago("Malachar, o Sombra Branca", 20, 5);

        int opcao;

        do {
            System.out.println("\n");
            System.out.println("---------------------<*>--------------------");
            System.out.println("  Spells and Blades: The Fury of The Steel  ");
            System.out.println("---------------------<*>--------------------");
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1 - Jogar;");
            System.out.println("2 - História;");
            System.out.println("0 - Sair.");
            System.out.print("\nOpção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n");
                    System.out.println("---<*>---");
                    System.out.println("  Jogar  ");
                    System.out.println("---<*>---");
                    System.out.println("\nFloresta Sombria, ao Norte.\n");
                    System.out.println("Em uma missão real, " + guerreiro.getNome() + " atravessa a floresta sombria. Mas algo o observa entre as árvores...\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");

                    mago.atacar(guerreiro);
                    System.out.println(mago.getNome() + " - Vida: " + mago.getVida() + ", Magia: " + mago.getMagia() + "\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");

                    mago.atacar(guerreiro);
                    System.out.println(mago.getNome() + " - Vida: " + mago.getVida() + ", Magia: " + mago.getMagia() + "\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");

                    mago.atacar(guerreiro);
                    System.out.println(mago.getNome() + " - Vida: " + mago.getVida() + ", Magia: " + mago.getMagia() + "\n");

                    guerreiro.atacar(mago);
                    System.out.println(guerreiro.getNome() + " - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca() + "\n");
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("----<*>----");
                    System.out.println(" História ");
                    System.out.println("----<*>----");
                    System.out.println("\nEm um continente devastado pela guerra, poderosos reinos e povos travam uma disputa mortal");
                    System.out.println("pelo domínio de suas terras e pelo controle de poderes ancestrais.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

        } while (opcao != 0);

        System.out.println("\n");
        System.out.println("----------------------------<*>---------------------------");
        System.out.println("Spells and Blades: The Fury of The Steel - Jogo Encerrado.");
        System.out.println("----------------------------<*>---------------------------");

    }
}
