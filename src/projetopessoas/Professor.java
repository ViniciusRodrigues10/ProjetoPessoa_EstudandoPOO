package projetopessoas;
public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salário;
    
    public void receberAumento(float aum) {
        this.salário += aum;
    }
    
    // Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalário() {
        return salário;
    }

    public void setSalário(float salário) {
        this.salário = salário;
    }

}
