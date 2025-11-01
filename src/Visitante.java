import java.time.LocalDateTime;

public class Visitante extends Residente{
    private String documento;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    //construtor
    public Visitante(String email, int id, String nome, String documento, LocalDateTime entrada, LocalDateTime saida){
        super(id, nome, email);
        this.documento = documento;
        this.entrada = entrada;
        this.saida = saida;
    }
    // Getters e Setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }
    @Override
    public String toString() {
        return "Visitor {" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", documento='" + documento + '\'' +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}
