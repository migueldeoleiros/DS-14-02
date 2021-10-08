package e3;

import static e3.Melody.Accidentals.*;

public class Note{
    public Melody.Notes note;
    public Melody.Accidentals accidental;
    public float time;

    /**
     * Initializes note fields
     */
    public void setNote(Melody.Notes note, Melody.Accidentals accidental, float time) {
        this.note = note;
        this.accidental = accidental;
        this.time = time;
    }

    /**
     * @return the note (DO,RE,MI,FA,SOL,LA,SI)
     */
    public Melody.Notes getNote() {
        return note;
    }

    /**
     * @return the note accidental (SHARP,FLAT,NATURAL)
     */
    public Melody.Accidentals getAccidental() {
        return accidental;
    }

    /**
     * @return the note's duration.
     */
    public float getTime() {
        return time;
    }

    /**
     * Transforms FLAT notes into their matching SHARP/NATURAL notes.
     *
     * @param nota that is going to have the new transformed values.
     * @throws IllegalArgumentException if the note is null
     */
    private void transform(Note nota) {
        if (note == Melody.Notes.RE && accidental == Melody.Accidentals.FLAT) //DO# = REb
            nota.setNote(Melody.Notes.DO, Melody.Accidentals.SHARP, time);
        else if (note == Melody.Notes.MI && accidental == Melody.Accidentals.FLAT) //RE# = MIb
            nota.setNote(Melody.Notes.RE, Melody.Accidentals.SHARP, time);
        else if (note == Melody.Notes.FA && accidental == Melody.Accidentals.FLAT) //MI = FAb
            nota.setNote(Melody.Notes.MI, Melody.Accidentals.NATURAL, time);
        else if (note == Melody.Notes.MI && accidental == Melody.Accidentals.SHARP) //MI# = FA
            nota.setNote(Melody.Notes.FA, Melody.Accidentals.NATURAL, time);
        else if (note == Melody.Notes.SOL && accidental == Melody.Accidentals.FLAT) //FA# = SOLb
            nota.setNote(Melody.Notes.FA, Melody.Accidentals.SHARP, time);
        else if (note == Melody.Notes.LA && accidental == Melody.Accidentals.FLAT) //SOL# = LAb
            nota.setNote(Melody.Notes.SOL, Melody.Accidentals.SHARP, time);
        else if (note == Melody.Notes.SI && accidental == Melody.Accidentals.FLAT) //LA# = SIb
            nota.setNote(Melody.Notes.LA, Melody.Accidentals.SHARP, time);
        else if (note == Melody.Notes.DO && accidental == Melody.Accidentals.FLAT) //Si = DOb
            nota.setNote(Melody.Notes.SI, Melody.Accidentals.NATURAL, time);
        else if (note == Melody.Notes.SI && accidental == Melody.Accidentals.SHARP) //SI# = DO
            nota.setNote(Melody.Notes.DO, Melody.Accidentals.NATURAL, time);
        else nota.setNote(note, accidental, time);
    }

    /**
     * Checks if two notes are equivalent.
     *
     * @return true if the notes are equal or equivalent, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        Note note2 = new Note();
        note2.setNote(note,accidental,time);

        if (Float.compare(note1.time, time) == 0 && note == note1.note && accidental == note1.accidental)return true;

        Note tr1 = new Note(); note1.transform(tr1);
        Note tr2 = new Note(); note2.transform(tr2);

        if(tr1.note.toString().equals(tr2.note.toString()))
            if(tr1.accidental.toString().equals(tr2.accidental.toString()))
                return tr1.time == tr2.time;

       return false;
    }

    /**
     * Returns an integer that is a hash code representation of the note.
     * Two notes n1 , n2 that are equals (n1.equals(n2) == true) must
     * have the same hash code.
     *
     * @return hash code of this note.
     */
    @Override
    public int hashCode() {
        int hash=0;
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setNote(note,accidental,time);
        note1.transform(note2);

        hash += note2.note.ordinal();
        if(note2.accidental == SHARP)
            hash += 7;

        hash += (note2.time*100);

        return Float.hashCode(hash);
    }

    /**
     * The string representation of this note.
     *
     * @return The String representation of this note.
     */
    @Override
    public String toString(){
        String accidentalStr;

        if(accidental == SHARP) accidentalStr = "#";
        else if(accidental == FLAT) accidentalStr = "b";
        else accidentalStr = "";

        return note.toString()+accidentalStr+"("+time+")";
    }
}