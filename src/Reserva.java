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
  private String Status;
  private Residente morador;

    private static final String pendente = "pendente";
    private static final String confirmado = "confirmado";
    private static final String cancelado=  "cancelado";

    public Reserva(int id, AreaComum area, LocalDateTime inicio, LocalDateTime fim, LocalDateTime createdAT, Double valor) {
        this.id = id;
        this.area = area;
        this.inicio = inicio;
        this.fim = fim;
        this.createdAT = createdAT;
        this.valor = valor;
        this.Status=pendente;
    }

    public boolean confirmarReserva() {
        if (this.inicio.isBefore(LocalDateTime.now())) {
            System.out.println("nao foi possivel fazer a reserva no dia"+getInicio());
            this.Status=cancelado;
            return false;
        }
        if (this.Status.equals(pendente)) {
            this.Status = confirmado;
            System.out.println("sua reserva foi marcada");
            return true;
        }
        return false;
    }

    public boolean cancelar(){
        if(this.Status.equals(pendente)||this.Status.equals(confirmado)){
            this.Status=cancelado;
            System.out.println("Sua reserva foi cancelada");
            return true;
        }
        if(this.Status==null){
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
