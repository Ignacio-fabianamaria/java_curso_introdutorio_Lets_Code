package strings_datas;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

public class index {
    public static void main(String[] args) {
        String nome = "Fabiana";
       
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String dia = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil );
        String saudacao ;
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "BOM DIA!";
        }else if (agora.getHour() >= 12 && agora.getHour() < 12) {
            saudacao = "BOA TARDE!";
        }else {
            saudacao = "BOA NOITE!";
        }

        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!
        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, dia, saudacao.toUpperCase());

    }
}
