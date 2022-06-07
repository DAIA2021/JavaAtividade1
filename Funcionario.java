package Exercicio1;

public class Funcionario {

    private String nome ;
    private int idade ;
    private String cargo;
    private String ativo;


    public Funcionario() {


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }


    public void demitirFuncionario() {
        System.out.println(  getNome() + "  foi demitido!" );

    }

    public void trocarCargoFuncionario(){
        this.cargo = "Analista Pleno";
        System.out.println("O funcionário " +  getNome() + "  mudou de função foi para " + getCargo() );

    }
    public void pagarSalario(){
        System.out.println("Pagar salário do funcionário " + getNome());

    }

    public void fazerAniversario(){
        this.idade +=1;
        System.out.println("Parabens pelo seu aniversário , você faz : " + getIdade());

    }

}

