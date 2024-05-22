// tipo 2 = salario + comissao
public class EmpregadoComissionado extends Empregado {
    // herda o atributo salário
    private double comissao;

    public EmpregadoComissionado(double salario, double comissao){
        super(salario);
        this.comissao = comissao;
    }
    // sobrescreve o método calculoSalario() do Empregado
    public double calculoSalario(){
        return getSalario() + this.comissao;
    }
    public double getComissao(){
        return comissao;
    }
}
