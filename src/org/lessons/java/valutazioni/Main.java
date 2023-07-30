package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Studente[] studenti;
        studenti = new Studente[20];
        int promossi=0;

        for (int i=0; i< studenti.length; i++){
            Random randomGenerator = new Random();

            int studentId = i+1;
            int percAssenze =randomGenerator.nextInt(0, 100);
            double mediaVoti= randomGenerator.nextDouble(1, 5);

            Studente studente= new Studente(studentId,percAssenze,mediaVoti);

            studenti[i]=studente;
        }


        for (Studente studente : studenti) {
            if (studente.passOrNot().equals("Promosso")) {
                promossi = promossi + 1;
            }
        }

        System.out.println("Gli studenti promossi sono:" + promossi);

    }
}
