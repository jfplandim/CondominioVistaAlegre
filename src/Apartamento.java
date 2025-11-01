import  java.util.ArrayList;
import java.util.List;

//representa uma unidade de apartamento

public class Apartamento {

    private String numero;
    private String bloco;
    private int numeroVagas;
    private Residente titular;
    private List<Residente> moradores;
    private double saldoCondominio;

    public Apartamento(String numero, String bloco, int numeroVagas, Residente titular, double saldoCondominio) {

        this.numero = numero;
        this.bloco = bloco;
        this.numeroVagas = numeroVagas;
        this.moradores = new ArrayList<>();
        this.saldoCondominio = saldoCondominio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Residente getTitular() {
        return titular;
    }

    public void setTitular(Residente titular) {
        this.titular = titular;
    }

    public List<Residente> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Residente> moradores) {
        this.moradores = moradores;
    }

    public double getSaldoCondominio() {
        return saldoCondominio;
    }

    public void setSaldoCondominio(double saldoCondominio) {
        this.saldoCondominio = saldoCondominio;
    }
}