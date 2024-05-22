// tipo 3 = salario + comissao + bonus 
public class EmpregadoBonificado extends EmpregadoComissionado{
    
        // herda o atributo comissao do EmpregadoComissionado
        // herda o atributo salario do EmpregadoComissionado, 
        // que por sua vez herdou de Empregado
        private double bonus;

        public EmpregadoBonificado(double salario, double comissao, double bonus){
            super(salario, comissao);
            this.bonus = bonus;
        }

        // sobrescreve o método calculoSalario() de EmpregadoComissionado e Empregado
        public double calculoSalario(){
            return getSalario() + getComissao() + this.bonus;
        }
}
