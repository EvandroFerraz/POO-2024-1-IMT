public class EmpregadoBonificado extends EmpregadoComissionado{
    
        // herda o atributo salario do Empregado
        // herda o atributo comissao do EmpregadoComissionado
        private double bonus;

        public EmpregadoBonificado(double salario, double comissao, double bonus){
            super(salario, comissao);
            this.bonus = bonus;
        }

        public double calculoSalario(){
            return getSalario() + getComissao() + this.bonus;
        }
}
