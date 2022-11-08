package ba.unsa.etf.rpr.t2z2;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    public boolean provjeriOdobrenjaPrekoracenja(Double broj){
        return this.prekoracenje > broj;
    }
    public boolean IzvrsiUplatu(Double novac){
        this.stanjeRacuna = this.stanjeRacuna + novac;
        return true;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public boolean izvrsiIsplatu(Double novac){
        if(this.stanjeRacuna + this.prekoracenje < novac){
            return false;
        }else{
            this.stanjeRacuna = this.stanjeRacuna - novac;
            return true;
        }
        public void odobriPrekoracenje(double vrijednost){
            this.prekoracenje = vrijednost;
        }

    }
}
