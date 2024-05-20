public class EmpregadoComissionado extends Empregado {
    // herda o atributo salário
    private double comissao;

    public EmpregadoComissionado(double salario, double comissao){
        super(salario);
        this.comissao = comissao;
    }
    public double calculoSalario(){
        return getSalario() + this.comissao;
    }
    public double getComissao(){
        return comissao;
    }
    public void setComissao(int comissao){
        this.comissao = comissao;
    }
}
