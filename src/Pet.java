public class Pet extends Residente{
    private String especie;

    //contrutor
    public Pet(int id, String nome, String especie) {
        super(id, nome);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
