public class Mago extends Personagem {
    private int magia;

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

    @Override
    public void atacar(Personagem alvo) {
        // Ataque do Mago leva em consideração a magia
        int dano = this.magia;
        alvo.setVida(alvo.getVida() - dano);
        System.out.println(getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano mágico");
    }
}
