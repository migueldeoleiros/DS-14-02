package e3;

public class Note{
    enum Notes {DO,RE,MI,FA,SOL,LA,SI};
    enum Accidentals {NATURAL,SHARP,FLAT};

    Notes note;
    Accidentals accidental;
    float time;

    public Note(Notes note, Accidentals accidental, float time){
        this.note = note;
        this.accidental = accidental;
        this.time = time;
    }

};

