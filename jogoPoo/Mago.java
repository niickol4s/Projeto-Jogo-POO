public class Mago extends Personagem {
    private int magia;

    // Construtor
    public Mago(String nome, int vida, int magia) {
        super(nome, vida);
        this.magia = magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    // Polimorfismo de Sobrescrita de Métodos
    @Override
    public void atacar(Personagem alvo) {
        int dano = this.magia;
        alvo.setVida(alvo.getVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano mágico");

        if (alvo.getVida() <= 0) {
            System.out.println(alvo.getNome() + " foi derrotado.");
        }
    }

}
