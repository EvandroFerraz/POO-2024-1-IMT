public class EmpregadoHorista extends Empregado{
    private double valorHora;
    private double numeroHoras;

    public EmpregadoHorista(double valorHora, double numeroHoras){
        super(valorHora*numeroHoras);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public double calculoSalario(){
        return this.valorHora * this.numeroHoras;
    }
}
