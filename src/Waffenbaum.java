public class Waffenbaum<Bauminhalt> {

    public BinaryTree <Bauminhalt> baum;

    public Waffenbaum(){
        baum = new BinaryTree<Bauminhalt>();
        Fragen f1 = new Fragen("Bist du eine AK-47?");
        Waffen w1 = new Waffen("AK-47");
        Waffen w2 = new Waffen("Glock 19");

        new BinaryTree<Bauminhalt>(f1,new BinaryTree<Bauminhalt>(w1,null,null),new BinaryTree<Bauminhalt>(w2,null,null));
    }


}
