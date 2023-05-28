package introducao_programacao_orientada_objetos.trabalhando_com_classes.animais;

public  class Cachorro {
   public String nome, cor, raça;
   public int altura;
   public double peso;

    public String getInfo() {
        return "Características do meu cachorro: [nome= " + nome + ", cor= " + cor + ", raça= " + raça + ", altura= " + altura + ", peso= " + peso + "]";
    }
}