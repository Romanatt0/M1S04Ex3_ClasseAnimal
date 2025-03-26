package models;

public class animai {

    private String nome;
    private String habitat;
    private String som;
    private String tipoDeAlimentacao;

    public animai(String nome, String habitat, String som, String tipoDeAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public animai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void emitirSom(){
        System.out.println(getSom());
    }

    public void mover(){
        System.out.println("O animdal andou para frente");
    }

    public void alimentar(){

        if(tipoDeAlimentacao.equals("Carnivoro")){
            System.out.println("O animdal comeu m pedaço de carne");
        } else {
            System.out.println("O animal comeu uma planta");
        }
    }
}
