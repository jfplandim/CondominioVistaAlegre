import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

public class politicaReserva {
    private final int prazoCancelamento = 48;
    private  double taxaCancelamento= 0.30;
    private LocalDateTime inicio;

    public boolean Cancelavel(Reserva reserva){
       return reserva.getStatus()== Reserva.statusReserva.confirmado;
    }

    public double calcularTaxa(Reserva reserva, LocalDateTime hoje){
        if (!Cancelavel(reserva)){
            return 0.0;
        }
        //calcula a diferenca de tempo entre o inicio da resera e a dta atual
        Duration duracao= Duration.between(hoje,reserva.getInicio());
         long horasUteis= duracao.toHours();//converte a diferenca em horas.

        if(horasUteis<prazoCancelamento){
            System.out.println("o cancelamento foi feito em menos de: "+prazoCancelamento+",multa aplicavel");
            double taxa= reserva.getValor()*this.taxaCancelamento;
            return taxa;
        }else{
            System.out.println("cancelamento com: "+horasUteis+",pode ser realizado gratuitamente");
            return 0.0;
        }

    }


}
