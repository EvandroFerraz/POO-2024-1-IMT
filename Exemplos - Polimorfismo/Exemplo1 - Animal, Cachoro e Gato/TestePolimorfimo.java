public class TestePolimorfimo {
    public static void main(String[] args) {
        // variáveis polimórficas: a1 e a2
        Animal a1 = new Gato();
        Animal a2 = new Cachorro();
        // imprime "miau"
        a1.fazerBarulho();
        // imprime "auau"
        a2.fazerBarulho();
    }
}
