package funcoes;

public class index {
    public static void main(String[] args) {
        String nome ="Fabiana";
        saudacao(nome);

        int result = soma(2,3);
        System.out.println(result);
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, "+ nome + "!!!");
    }

    public static int soma(int a, int b) {
        return a+b;
        
    }
}
