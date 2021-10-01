package e3;

public class Note{
    public Melody.Notes note;
    public Melody.Accidentals accidental;
    public float time;

    public void setNote(Melody.Notes note, Melody.Accidentals accidental, float time) {
        this.note = note;
        this.accidental = accidental;
        this.time = time;
    }

    public Melody.Notes getNote() {
        return note;
    }

    public Melody.Accidentals getAccidental() {
        return accidental;
    }

    public float getTime() {
        return time;
    }
};

