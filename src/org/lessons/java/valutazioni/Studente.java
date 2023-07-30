package org.lessons.java.valutazioni;

public class Studente {
    private int studentID;
    private int percAssenze;
    private double mediaVoti;

    public Studente(int studentID, int percAssenze, double mediaVoti) {
        this.studentID = studentID;
        this.percAssenze = percAssenze;
        this.mediaVoti = mediaVoti;
    }

    public String passOrNot(){

        String response;
        if (percAssenze<25 & mediaVoti<=2){
             response="Promosso";
        } else if (percAssenze>=25 & percAssenze<=50 & mediaVoti>2){
             response="Promosso";
        } else {
             response="Bocciato";
        }
        return response;
    }
    @Override
    public String toString(){
        return "id studente:"+studentID + " assenze:" + percAssenze +" media voti:"+ mediaVoti;
    }
}
