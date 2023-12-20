public class Personagem {
    private String nome;
    private int vida;

    // Construtor
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    // Polimorfismo de Sobrescrita de Métodos
    public void atacar(Personagem alvo) {
        System.out.println(nome + " atacou " + alvo.getNome());
    }
}