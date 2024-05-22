// tipo 4: valorHora * numeroHoras
public class EmpregadoHorista extends Empregado{
    private double valorHora;
    private double numeroHoras;

    public EmpregadoHorista(double valorHora, double numeroHoras){
        super(valorHora*numeroHoras);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    //sobrescreve o método calculoSalario() de Empregado
    public double calculoSalario(){
        return this.valorHora * this.numeroHoras;
    }
}
