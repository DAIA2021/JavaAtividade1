package Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Funcionario a1 = new Funcionario();
        Funcionario a2 = new Funcionario();
        Funcionario a3 = new Funcionario();
        Funcionario a4 = new Funcionario();


        a1.setNome("Andre"); /// instanciar o objeto
        a1.setIdade(33);
        a1.setCargo("Analista");
        a1.setAtivo("Ativo");
        a1.demitirFuncionario();

        a2.setNome("Paulo");
        a2.setIdade(20);
        a2.setCargo("Analista Junior");
        a2.setAtivo("Ativo");
        a2.trocarCargoFuncionario();

        a3.setNome("Jose");
        a3.setIdade(21);
        a3.setCargo("Estágiário");
        a3.setAtivo("Ativo");
        a3.fazerAniversario();

        a4.setNome("Ana");
        a4.setIdade(25);
        a4.setCargo("Adminstração");
        a4.setAtivo("Ativo");
        a4.pagarSalario();




    }
}
