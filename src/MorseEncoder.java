import java.beans.Encoder;
/*
public class MorseEncoder {
    BinaryTree <String> letterTree;
    BinaryTree <String> currentTree;
    String finishedSentence;
    public MorseEncoder() {
        letterTree = new BinaryTree<>("/", createLeftLetterTree(), createRightLetterTree());
        currentTree = letterTree;
        finishedSentence = "";
    }
    private BinaryTree<String> createLeftLetterTree(){
        BinaryTree <String> b4P = new BinaryTree<>(".", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b4L = new BinaryTree<>("-", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b2P = new BinaryTree<>(".", b4P,b4L);
        BinaryTree <String> b5P = new BinaryTree<>(".", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b5L = new BinaryTree<>("-", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b2L = new BinaryTree<>("-", b5P,b5L);
        return new BinaryTree<>(".", b2P, b2L);
    }
    private BinaryTree<String> createRightLetterTree(){
        BinaryTree <String> b6P = new BinaryTree<>(".", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b6L = new BinaryTree<>("-", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b3P = new BinaryTree<>(".", b6P, b6L);
        BinaryTree <String> b7P = new BinaryTree<>(".", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b7L = new BinaryTree<>("-", new BinaryTree<String>("."), new BinaryTree<String>("-"));
        BinaryTree <String> b3L = new BinaryTree<>("-", b7P, b7L);
        return new BinaryTree<>("-", b3P, b3L);
    }

    //weg = w
    //c = content
    //Hinterperson*innen = links/rechts baum*innen
    public String encode(String finishedSentence){
        if(letterTree.isEmpty()){
           return "";
        } else{
            if(){

            } else{
                if(){

                }
            }
        }

        return this.encode(this.finishedSentence);
    }

    public static void main(String[] args) {
        MorseEncoder morseEncoder = new MorseEncoder();
        String finishedSentence = "AFD";
        String encodedMsg = morseEncoder.encode(finishedSentence);
        System.out.println(finishedSentence + " = " + encodedMsg);
    }
}
*/