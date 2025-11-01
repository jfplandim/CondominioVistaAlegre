import java.util.ArrayList;
import java.util.List;

public class AreaComum {

    private int id;
    private String nome, descricao;
    private Integer capacidade;
    private boolean disponivel;

    private List<Residente> reservas = new ArrayList<>();
    private List<PedidoDeManutencao> historicoManutencao = new ArrayList<>();

    AreaComum(int id, String nome, String descricao, Integer capacidade, boolean disponivel){
        this.id = id;
        this.nome=nome;
        this.descricao=descricao;
        this.capacidade=capacidade;
        this.disponivel=disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean EstaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Residente> getReservas() {
        return reservas;
    }

    public void setReservas(List<Residente> reservas) {
        this.reservas = reservas;
    }

    public List<PedidoDeManutencao> getHistoricoManutencao() {
        return historicoManutencao;
    }

    public void setHistoricoManutencao(List<PedidoDeManutencao> historicoManutencao) {
        this.historicoManutencao = historicoManutencao;
    }
}
