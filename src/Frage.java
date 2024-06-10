public class Frage extends Bauminhalt{

    String frage;

    public Frage(String frage){
        this.frage = frage;
        istFrage = true;
    }

    public String getFrage(){
        return frage;
    }

    public void setFrage(String frage){
        this.frage = frage;
    }


}
