package operadores_booleanos;

public class index {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean fazendoSol02 = false;
        boolean irAPraia = fimDeSemana && fazendoSol;
        String msg = fazendoSol02 ? "Está fazendo sol" : "Não está fazendo sol";

        System.out.println(irAPraia);
        System.out.println(msg);
    }
}
