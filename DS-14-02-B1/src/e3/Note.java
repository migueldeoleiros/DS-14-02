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
        if(note == Melody.Notes.RE && accidental == Melody.Accidentals.FLAT ){
            setNote(Melody.Notes.DO, Melody.Accidentals.SHARP, nota.time);
        }
        if(note == Melody.Notes.MI && accidental == Melody.Accidentals.FLAT ){
            setNote(Melody.Notes.RE, Melody.Accidentals.SHARP, nota.time);
        }

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
        Note note1 = new Note();
        note1.setNote(note,accidental,time);

        return Objects.hash(transform(note1));
    }

};

