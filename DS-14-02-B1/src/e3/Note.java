package e3;

import java.util.Objects;

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

    public Note transform(Note nota){
        Note nota1 = new Note();
        if (note== Melody.Notes.RE && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.DO, Melody.Accidentals.SHARP,time);
        else if (note== Melody.Notes.MI && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.RE, Melody.Accidentals.SHARP,time);
        else if (note== Melody.Notes.FA && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.MI, Melody.Accidentals.NATURAL,time);
        else if (note== Melody.Notes.SOL && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.FA, Melody.Accidentals.SHARP,time);
        else if (note== Melody.Notes.LA && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.SOL, Melody.Accidentals.SHARP,time);
        else if (note== Melody.Notes.SI && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.LA, Melody.Accidentals.SHARP,time);
        else if (note== Melody.Notes.DO && accidental == Melody.Accidentals.FLAT)
            setNote(Melody.Notes.SI, Melody.Accidentals.NATURAL,time);
        else nota1 = nota;
        return nota1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        Note note2 = new Note();
        note2.setNote(note,accidental,time);

        if (Float.compare(note1.time, time) == 0 && note == note1.note && accidental == note1.accidental)return true;

        return transform(note1) == transform(note2);
    }

    @Override
    public int hashCode() {
        int hash=0;
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setNote(note,accidental,time);
        note2 = transform(note1);
        switch (note1.note) {
            case DO:
                hash = +1;
                break;
            case RE:
                hash = +2;
                break;
            case MI:
                hash = +3;
                break;
            case FA:
                hash = +4;
                break;
            case SOL:
                hash = +5;
                break;
            case LA:
                hash = +6;
                break;
            case SI:
                hash = +7;
                break;
        }
        if(note1.accidental == accidental.SHARP)
            hash += 7;

        hash += (note1.time*100);

        return hash;
    }

    public String toString(){
        return note.toString() + accidental.toString() + time;
    }
};
