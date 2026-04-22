package api.data.novo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        //LocalDate nascimento = LocalDate.of(1986,02,12);
        LocalDate nascimento = LocalDate.of(1986, Month.FEBRUARY, 12);
        System.out.println();
        System.out.println(agora);
        System.out.println(nascimento);
        System.out.println("Formatando Padrao pt-Br");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(agora.format(dateTimeFormatter));

        //Calculando diferenca anos
        System.out.println();
        int diff = agora.getYear() - nascimento.getYear();
        System.out.println("Diferenca de anos: " + diff);

        System.out.println();
        //Diferenca entre duas dastas utilizando Period
        Period period = Period.between(agora, nascimento);
        System.out.println("Diferenca entre duas datas: " + period);
        //Ajustando para formato..mais legivel

        System.out.printf("Anos: %s, Meses: %s, Dias: %s", period.getYears(), period.getMonths(), period.getDays());
        //System.out.println("Diferenca ajustada: " + LocalDate.of(period.getYears(),  period.getMonths(),period.getDays()));

        System.out.println();
        //Subtraindo dias, meses e ano...
        System.out.println(agora.plusYears(5)); //5 anos pra frente
        System.out.println(agora.plusYears(-5)); //5 anos pra traz
        System.out.println(agora.plusDays(60)); //60 dias pra frente
        System.out.println(agora.plusDays(-60)); //60 dias pra traz
        System.out.println(agora.plusMonths(8)); //8 meses pra frente


        //Uma API imutável
        System.out.println("Fizemos tantas alteracoes nas datas acima, a mesma nao mudou");
        System.out.println(agora);
        System.out.println("Precisa criar novo obejto");
        LocalDate agoraModificado = agora.plusYears(5); //5 anos pra frente
        System.out.println(agoraModificado);


        //LocalDateTime agora.
        System.out.println();
        LocalDateTime agoraTime = LocalDateTime.now();
        System.out.println("Sem formatar data e hora: " + agoraTime);
        //DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Formatada1: " + agoraTime.format(dateTimeFormatter1));
        System.out.println("Formatada2: " + agoraTime.format(dateTimeFormatter2));
        System.out.println("Formatada3: " + agoraTime.format(dateTimeFormatter3));


        //Somente ano e mes etc
        System.out.println();
        YearMonth pegandoAnoMes = YearMonth.of(nascimento.getYear(),nascimento.getMonthValue());
        System.out.println("Pegando ano e Mes: " + pegandoAnoMes);
        System.out.println();
        LocalTime pegandoHoraMinuto = LocalTime.of(20,55);
        System.out.println(pegandoHoraMinuto);


        //Pegar data e hora pais especifico ou  via UTC/GMT
        ZonedDateTime dataHoraLondres = ZonedDateTime.now(ZoneId.of("UTC-5"));
        System.out.println(dataHoraLondres);


    }
}
