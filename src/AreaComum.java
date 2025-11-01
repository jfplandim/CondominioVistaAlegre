import java.util.ArrayList;
import java.util.List;

public class AreaComum {

    private Long id;
    private String nome, descricao;
    private Integer capacidade;
    private boolean disponivel;

    private List<Integer> Reservation = new ArrayList<>();
    private List<MaintenanceRequest> historicoManutencao = new ArrayList<>();

    AreaComum(Long id, String nome, String descricao, Integer capacidade, boolean disponivel){
        this.id = id;
        this.nome=nome;
        this.descricao=descricao;
        this.capacidade=capacidade;
        this.disponivel=disponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Integer> getReservation() {
        return Reservation;
    }

    public void setReservation(List<Integer> reservation) {
        Reservation = reservation;
    }

    public List<MaintenanceRequest> getHistoricoManutencao() {
        return historicoManutencao;
    }

    public void setHistoricoManutencao(List<MaintenanceRequest> historicoManutencao) {
        this.historicoManutencao = historicoManutencao;
    }
}
