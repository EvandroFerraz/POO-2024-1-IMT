import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class ListaDeMusicas {
    public static void main(String[] args){
        List <Musica> musicas = new ArrayList<>();
        int opcao;
        do{
            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "0-Sair\n1-Inserir Música\n" +
                    "2-Avaliar Música\n3-Listar Músicas")
            );
            switch(opcao){
                case 0:
                    JOptionPane.showMessageDialog(null,
                    "Até mais!!");
                    break;
                case 1:
                    // inserir uma nova música na coleção
                    String musicaInserir = 
                    JOptionPane.showInputDialog(
                        "Digite o título da música:");
                    musicas.add(new Musica(musicaInserir));
                    JOptionPane.showMessageDialog(null,
                    "Música inserida com sucesso!!");
                    break;
                case 2:
                    // avaliar uma música já existente
                    String musicaAvaliar = 
                        JOptionPane.showInputDialog(
                            "Digite o título da música" +
                            " que deseja avaliar:"
                        );
                    int nota = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Digite a nota:"
                        )
                    );
                    for(int i=0; i < musicas.size(); i++){
                        if(musicas.get(i).getTitulo().equals(musicaAvaliar)){
                            musicas.get(i).setAvaliacao(nota);
                            break;
                        }
                    }
                    break;
                case 3:
                    // listar as musicas ordenadas
                    Collections.sort(musicas,Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null,musicas);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                    "Opção Inválida!!");
            }
        }while(opcao != 0);
    }
}
