public class Waffenbaum {

    public BinaryTree <Bauminhalt> baum;

    public Waffenbaum(){
        baum = new BinaryTree<Bauminhalt>();
        Frage f1 = new Frage("Bist du eine AK-47?");
        Waffe w1 = new Waffe("AK-47");
        Waffe w2 = new Waffe("Glock 19");

        new BinaryTree<Bauminhalt>(f1,new BinaryTree<Bauminhalt>(w1,null,null),new BinaryTree<Bauminhalt>(w2,null,null));
    }

    public void ersetzen(){

    }

    /*
    public void hinzufuegen(){

    }
    */



    //fehlt?
    public boolean istEsEmpirischNichtexistentFragezeichen(){
        return true;
    }

    public void newQuestionmacherUndNewWaffenhinzufueger(){

    }

}
