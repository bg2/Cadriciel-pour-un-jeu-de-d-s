package Framework;

/**
 * Created by AN07460 on 2017-03-06.
 */
public class IterateurDes<De> implements Iterateur {

    private De[] des;
    private int position;

    public IterateurDes(De[] des){

        this.des = des;
        position = 0;
    }

    @Override
    public Object next() {
        return des[position++];
    }

    @Override
    public boolean hasNext() {

        if(position >= des.length || des[position] == null)
            return false;

        return true;
    }
}
