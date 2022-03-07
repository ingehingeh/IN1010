public class AListeUnik<K,V> extends AListe<K,V> {

    @Override
    public void settInn(K nokkel, V verdi) /*throws HarNokkel*/{
        if(harNokkel(nokkel)) throw new HarNokkel(nokkel.toString());
        super.settInn(nokkel, verdi);
    }
    
}
