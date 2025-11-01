import java.util.List;
import java.time.LocalDateTime;
public class Residente {
    private int id;
    private String nome;
    private int telefone;
    private String email;

    private List<Pet> pets;
    private List<vagaGaragem> vagaGaragens;
    private List<Visitante> visitantesAutorizados;

    public Residente(int id, String nome) {
    }

    public void login(){
        System.out.println("Morador fazendo login...");
    }

    public void solicitacaoManutencao(int areaId, String descricao){
        System.out.println("solicitando manutanção para a área" + areaId);
    }
    public void fazerReserva(int areaID, LocalDateTime start, LocalDateTime end){
        System.out.println("Fazendo reserva" + areaID);

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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<vagaGaragem> getVagaGaragens() {
        return vagaGaragens;
    }

    public void setVagaGaragens(List<vagaGaragem> vagaGaragens) {
        this.vagaGaragens = vagaGaragens;
    }

    public List<Visitante> getVisitantesAutorizados() {
        return visitantesAutorizados;
    }

    public void setVisitantesAutorizados(List<Visitante> visitantesAutorizados) {
        this.visitantesAutorizados = visitantesAutorizados;
    }
}
