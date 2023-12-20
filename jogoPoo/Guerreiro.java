public class Guerreiro extends Personagem {
    private int forca; // O atributo só pode ser acessado dentro da própria classe. Encapsulamento.

    // Construtor
    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida); // Usado para acessar os atributos, métodos ou contrutores da classe pai.
        this.forca = forca;
    }

    public void setForca(int forca) { // Setters fornecem modificação controlada dos valores dos atributos.
        this.forca = forca;
    }

    public int getForca() { // Getters fornecem apenas leitura dos atributos.
        return forca;
    }

    // Polimorfismo de Sobrescrita de Métodos
    @Override // Indica que o método abaixo está sendo sobrescrito da classe pai.
    public void atacar(Personagem alvo) {
        int dano = this.forca;
        alvo.setVida(alvo.getVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano com espada.");

        if (alvo.getVida() <= 0) {
            System.out.println("\n" + alvo.getNome() + " foi derrotado.\n");
        }
    }
}
