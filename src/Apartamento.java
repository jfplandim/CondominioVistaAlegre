import java.util.ArrayList;
import java.util.List;

//representa uma unidade de apartamento

public class Apartamento {
    private String numero;
    private int andar;
    private String bloco;
    private int vagasGaragem; // Requisito: "número de vagas de garagem"
    private List<Residente> residentes;

    public Apartamento(String numero, int andar, String bloco, int vagasGaragem) {
        this.numero = numero;
        this.andar = andar;
        this.bloco = bloco;
        this.vagasGaragem = vagasGaragem;
        this.residentes = new ArrayList<>();
    }

    public void adicionarMorador(Residente residente) {
        this.residentes.add(residente);
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public int getVagasGaragem() {
        return vagasGaragem; //
    }

    public List<Residente> getResidentes() {
        return residentes;
    }
}