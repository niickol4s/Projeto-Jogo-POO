public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida);
        this.forca = forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void atacar(Personagem alvo) {
        // Ataque do Lutador leva em consideração a força
        int dano = this.forca;
        alvo.setVida(alvo.getVida() - dano);
        System.out.println(getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano");
    }
}
