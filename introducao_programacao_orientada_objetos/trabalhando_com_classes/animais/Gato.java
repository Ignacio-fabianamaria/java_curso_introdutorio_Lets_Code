package introducao_programacao_orientada_objetos.trabalhando_com_classes.animais;

public class Gato extends Animal {
    // Construtor
    public Gato(String nome, String cor, String raça, int altura, double peso) {
        super(nome, cor, raça, altura, peso);
    }

   //Métodos
   public void miar() {
    System.out.println("O gato está miando!");
}
}
