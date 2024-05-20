public class Cachorro extends Animal{
    // cachorro herda da classe animal
    // então método fazerBarulho da classe Animal (mãe)
    // é SOBRESCRITO pelo mesmo método na classe Cachorro (filha)
    public void fazerBarulho(){
        System.out.println("auau");
    }
}
