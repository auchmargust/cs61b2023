public class OffByN implements CharacterComparator{
    public int n;
    public OffByN(int N){
        this.n =N;
    }
    @Override
    public  boolean equalChars(char x, char y){
        return (x-y==n)||(y-x==n) ? true: false;
    }
}
