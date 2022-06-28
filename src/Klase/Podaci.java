package Klase;

public class Podaci {

    ////Zadatak 4 - Kreirati paket "Klase" i unutar tog paketa kreirati klasu "MainKlasa" i "Podaci".
    // U klasi Podaci deklarisati ime, prezime, fakultet i prosecnu ocenu sa fakulteta.
    // U klasi MainKlasa kreirati 3 objekta i odstampati podatke koje prosledjujete
    // preko konstruktora u klasu Podaci.
    // Klasa Podaci sadrzi i metodu za stampanje.

    public String ime;
    public String prezime;
    public String fakultet;
    public int ocena;

    public Podaci(String ime, String prezime, String fakultet, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet= fakultet;
        this.ocena = ocena;




        }
        public void stampanje() {
            System.out.println("Polaznik " + this.ime + " " + this.prezime + " " + this.fakultet + " " + "ima ocenu " + this.ocena);
    }
}

