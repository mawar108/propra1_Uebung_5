package kino;

public class Kinoverwaltung {

    public static void main(String[] args) {

        Saal saal1= new Saal(10,6);
        Saal saal2= new Saal(12, 8);

        Vorfuehrung saal1_A= new Vorfuehrung(saal1,Zeitslot.A);
        VorfuehrungID vorfuehrungID1_A= saal1_A.getVorfuehrungID(); // Die ID kann man als eine Kombination aus Filmnamen, Saal und Zeitslot interpretieren
                                                                    //was der Mitarbeiter schon weiß. Hier ist es einfachheitshalber eine UUID

        Vorfuehrung saal1_B= new Vorfuehrung(saal1,Zeitslot.B);
        VorfuehrungID vorfuehrungID1_B= saal1_B.getVorfuehrungID();

        Vorfuehrung saal1_C= new Vorfuehrung(saal1,Zeitslot.C);
        VorfuehrungID vorfuehrungID1_C= saal1_C.getVorfuehrungID();

        Vorfuehrung saal2_A= new Vorfuehrung(saal2,Zeitslot.A);
        VorfuehrungID vorfuehrungID2_A= saal2_A.getVorfuehrungID();

        Vorfuehrung saal2_B= new Vorfuehrung(saal2,Zeitslot.B);
        VorfuehrungID vorfuehrungID2_B= saal2_B.getVorfuehrungID();

        Vorfuehrung saal2_C= new Vorfuehrung(saal2,Zeitslot.C);
        VorfuehrungID vorfuehrungID2_C= saal2_C.getVorfuehrungID();

        VorfuehrungRepository vorfuehrungen= new VorfuehrungRepository();
        vorfuehrungen.saveVorfuehurng(saal1_A,saal1_B,saal1_C,saal2_A,saal2_B,saal2_C);

        Mitarbeiter mitarbeiter1= new Mitarbeiter();
        Mitarbeiter mitarbeiter2= new Mitarbeiter();

        //Bisher hier wurde nur "das Kino" erstellt mit seinem Programm



        mitarbeiter1.blockierGewünschtenSitzOderSitze(new Sitz('A', 3));










    }

}