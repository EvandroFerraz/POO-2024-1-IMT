public class TesteEmpregadoPolimorfismo {
    public static void main(String[] args){
        Empregado e1 = new Empregado(1000); //tipo 1 = salario
        Empregado e2 = new EmpregadoComissionado(1000,500); //tipo2 = salario e comissao
        Empregado e3 = new EmpregadoBonificado(1000,500,300); //tipo3 = salario, comissao e bonus
        Empregado e4 = new EmpregadoHorista(200,40); //tipo4 = salario = valorHora * numeroHoras
        Empregado e5 = new EmpregadoTarefeiro(150,60); // tipo5 = salario = valorTarefa * numeroTarefas

       System.out.println("Empregado Assalariado: " + e1.calculoSalario()); 
       System.out.println("Empregado Comissionado: " + e2.calculoSalario());
       System.out.println("Empregado Bonificado: " + e3.calculoSalario());
       System.out.println("Empregado Horista: " + e4.calculoSalario());
       System.out.println("Empregado Tarefista: " + e4.calculoSalario());



    }
}
