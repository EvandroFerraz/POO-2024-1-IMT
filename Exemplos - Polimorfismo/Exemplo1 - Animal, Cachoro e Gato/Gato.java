public class Gato extends Animal{
    // gato herda da classe animal
    // então método fazerBarulho da classe Animal (mãe)
    // é SOBRESCRITO pelo mesmo método na classe Gato (filha)
    public void fazerBarulho(){
        System.out.println("miau");
    }
}
