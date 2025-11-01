import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

public class PedidoDeManutencao {
    private String tecnico;
    private int id;
    private AreaComum area;
    private Residente solicitante;
    private String descricao;
    private List<String> comentarios = new ArrayList<>();

    private LocalDateTime abertura;
    private LocalDateTime fechamento;
    private String status;

    void Atribuir(String tecnico){
        this.tecnico=tecnico;
    }

    void Fechar(){
        this.fechamento=LocalDateTime.now(); //para registrar o momento que é fechado
        this.status="Fechado"; // altera o estado do pedido
    }

    PedidoDeManutencao(int id, AreaComum area, Residente solicitante, String descricao){
        this.id=id;
        this.area=area;
        this.solicitante=solicitante;
        this.descricao=descricao;
        this.abertura=LocalDateTime.now();
        this.status= "Aberto";
        this.tecnico=null;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
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

    public Residente getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Residente solicitante) {
        this.solicitante = solicitante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public LocalDateTime getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDateTime abertura) {
        this.abertura = abertura;
    }

    public LocalDateTime getFechamento() {
        return fechamento;
    }

    public void setFechamento(LocalDateTime fechamento) {
        this.fechamento = fechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
