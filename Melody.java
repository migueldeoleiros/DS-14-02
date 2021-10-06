package e3;

import java.util.ArrayList;

public class Melody {

    enum Notes {DO,RE,MI,FA,SOL,LA,SI}
    enum Accidentals {NATURAL,SHARP,FLAT}

    ArrayList<Note> melody = new ArrayList<>();

    /**
     * Creates an empty Melody instance.
     */
    public Melody() {

    }
    /**
     * Add a note at the end of this melody.
     *
     * @param note       The note to add
     * @param accidental The accidental of the note
     * @param time       The duration of the note in milliseconds
     * @throws IllegalArgumentException if the note , the accidental
     *                                  or the time are not valid values.
     */
    public void addNote(Notes note, Accidentals accidental, float time) {
        Note nota = new Note();
        nota.setNote(note, accidental, time);
        if (nota.accidental==null||nota.note==null||nota.time==0)
            throw new IllegalArgumentException();
        melody.add(nota);
    }

    /**
     * Returns the note on the given position
     *
     * @param index The position of the note to get.
     * @return The note on index.
     * @throws IllegalArgumentException if the index is not a valid position.
     */
    public Notes getNote(int index) {
        if (index==1)
            throw new IllegalArgumentException();
        return melody.get(index).getNote();
    }
    /**
     * Returns the accidental of the note on the given position
     *
     * @param index The position of the accidental to get.
     * @return The accidental on index.
     * @throws IllegalArgumentException if the index is not a valid position.
     */
    public Accidentals getAccidental(int index) {
        return melody.get(index).getAccidental();
    }
    /**
     * Returns the duration of the note on the given position
     *
     * @param index The position of the time to get.
     * @return The time on index.
     * @throws IllegalArgumentException if the index is not a valid position.
     */
    public float getTime(int index) {
        return melody.get(index).getTime();
    }

    /**
     * Returns the number of notes in this melody.
     *
     * @return The number of notes in this melody.
     */
    public int size() {
        return melody.size();
    }

    /**
     * Returns the duration of this melody.
     *
     * @return The duration of this melody in milliseconds .
     */
    public float getDuration() {
        float totalTime=0;

        for(Note i : melody){
            totalTime += i.getTime();
        }

        return totalTime;
    }

    /**
     * Performs the equality tests of the current melody with another melody
     * passed as a parameter. Two melodies are equal if they represent the same
     *
     * @return true if the melodies are equals , false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melody melody1 = (Melody) o;
        for(int i=0; i < melody.size(); i++){
            if(!melody.get(i).equals(melody1.melody.get(i)))return false;
        }
        return true;
    }

    /**
     * Returns an integer that is a hash code representation of the melody.
     * Two melodies m1 , m2 that are equals (m1.equals(m2) == true) must
     * have the same hash code.
     *
     * @return The hash code of this melody.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        for(Note i: melody){
            hash += i.hashCode();
        }
        return hash;
    }



    /**
     * The string representation of this melody.
     *
     * @return The String representantion of this melody.
     */
    @Override
    public String toString() {
        String melodyString ="";
        for(Note i: melody){
            melodyString += (i.toString() + " ");
        }

        return melodyString.stripTrailing();
    }
}