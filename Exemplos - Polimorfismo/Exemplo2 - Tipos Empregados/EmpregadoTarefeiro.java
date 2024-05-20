public class EmpregadoTarefeiro extends Empregado{
    // herda salario da classe Empregado
    private double valorTarefa;
    private int numeroTarefas;

    public EmpregadoTarefeiro(double valorTarefa, int numeroTarefas){
        super(valorTarefa*numeroTarefas);
        this.valorTarefa = valorTarefa;
        this.numeroTarefas = numeroTarefas;
    }

    public double calculoSalario(){
        return this.valorTarefa*this.numeroTarefas;
    }
}
