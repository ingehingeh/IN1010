// IN1010 oblig 4 gruppearbeid
// Del B: Itererbare lister

// om implementerer Iterator => må implementere metodene hasNext() og next()
// om implementerer Compareable => må implementere metodene compareTo()

interface Liste < T extends Iterable<T> > {
    int stoerrelse ();
    void leggTil (T x);
    T hent ();
    T fjern ();
    T next(); // returns next element. Throws ‘NoSuchElementException’ if there is no next element.
    T hasNext(); // True, if Iterator has more element to iterate.
}
