public class Waffenbaum {

    public SpielGUI gui;
    public BinaryTree<Bauminhalt> baum;
    public BinaryTree<Bauminhalt> zeiger;

    String zwischenspeicher;

    public Waffenbaum(){
        gui = new SpielGUI();
        baum = new BinaryTree<Bauminhalt>();
        Frage f1 = new Frage("Bist du eine AK-47?");
        Waffe w1 = new Waffe("AK-47");
        Waffe w2 = new Waffe("Glock 19");

        baum = new BinaryTree<Bauminhalt>(f1,new BinaryTree<Bauminhalt>(w1,null,null),new BinaryTree<Bauminhalt>(w2,null,null));
        zeiger = baum;
    }

    public void ersetzen(){

    }

    public void ja(){
        zeiger = zeiger.getLeftTree();
    }

    public void nein(){
        zeiger = zeiger.getRightTree();
    }

    public void hinzufuegen(){

    }

    //fehlt?
    public boolean istEsEmpirischNichtexistentFragezeichen(){
        return true;
    }

    public void newQuestionmacherUndNewWaffenhinzufueger(){

    }

}
