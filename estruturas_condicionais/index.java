package estruturas_condicionais;

public class index {
    public static void main(String[] args) {
        int nota = 40;
        String graduacao;
        //int nota = 80;

        if(nota >= 80) {
           graduacao = "A";
        }else if (nota < 80 && nota >=70) {
            graduacao= "B";
        }else if (nota < 70 && nota >=60) {
            graduacao = "C";
        }else {
            graduacao = "D";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
                break;        

        }

    }
}
