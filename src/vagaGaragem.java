public class vagaGaragem extends Apartamento{
    private String identificador;
    private boolean ocupado;

    public vagaGaragem(int idApartamento, String identificador, boolean ocupado) {
        super(idApartamento);
        this.identificador = identificador;
        this.ocupado = ocupado;
    }
    // Getters e Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Vaga Garagem {" +
                "id=" + getidApartamento() +
                ", identificador='" + identificador + '\'' +
                ", ocupado=" + ocupado +
                '}';
    }

}
