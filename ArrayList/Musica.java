public class Musica implements Comparable <Musica>{
    private String titulo;
    private int avaliacao;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    // retorna o valor de um atributo
    public String getTitulo(){
        return titulo;
    }

    // recebe um valor como parâmetro e atribui aquele
    // valor para o atributo
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }

    @Override
    public int compareTo(Musica m){
        if(this.avaliacao < m.avaliacao){
            return -1;
        }
        if(this.avaliacao > m.avaliacao){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "Título: " + titulo + 
        " Nota: " + avaliacao;
    }
}