public class Waffenbaum<Bauminhalt> {

    public BinaryTree <Bauminhalt> baum;

    public Waffenbaum(){
        baum = new BinaryTree<Bauminhalt>();
        Fragen f1 = new Fragen("Bist du eine AK-47?");
        Waffen w1 = new Waffen("AK-47");
        Waffen w2 = new Waffen("Glock 19");

        new BinaryTree<Bauminhalt>(f1);
    }

    public void ersetzen(){}

    public void hinzufuegen(){}

    public boolean istEsEmpirischNichtexistentFragezeichen(){}

    public void newQuestionmacherUndNewWaffenhinzufueger(){}
}
