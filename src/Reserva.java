import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;// aa/mm/dd

public class Reserva {
  private int id;
  private AreaComum area;
  private LocalDateTime inicio;
  private LocalDateTime fim;
  private LocalDateTime createdAT;
  private Double valor;
  statusReserva status;
  private Residente morador;
  private politicaReserva politica;
    public Reserva(int id, AreaComum area, LocalDateTime inicio, LocalDateTime fim, LocalDateTime createdAT, Double valor,Residente morador,statusReserva status) {
        this.id = id;
        this.area = area;
        this.inicio = inicio;
        this.fim = fim;
        this.createdAT = createdAT;
        this.valor = valor;
        this.morador=morador;
        this.status=statusReserva.confirmado;
    }

    public boolean confirmarReserva() {
        if (this.inicio.isBefore(LocalDateTime.now())) {
            System.out.println("nao foi possivel fazer a reserva no dia"+getInicio());
            this.status=statusReserva.cancelado;
            return false;
        }
        if (this.status.equals(statusReserva.pendente)) {
            this.status = statusReserva.confirmado;
            System.out.println("sua reserva foi marcada");
            return true;
        }
        return false;
    }

    public boolean cancelar(){
        if(this.status.equals(statusReserva.pendente)||this.status.equals(statusReserva.confirmado)){
            this.status=statusReserva.cancelado;
            System.out.println("Sua reserva foi cancelada");
            return true;
        }
        if(this.status==null){
            System.out.println("A reserva nao existe");
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AreaComum getArea() {
        return area;
    }

    public void setArea(AreaComum area) {
        this.area = area;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public LocalDateTime getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(LocalDateTime createdAT) {
        this.createdAT = createdAT;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public statusReserva getStatus() {
        return status;
    }

    public void statusReserva (String status) {
        status = status;
    }

    //classe enum para definir o status da reserva
    public enum  statusReserva{
        pendente,
        confirmado,
        cancelado

    }
}
