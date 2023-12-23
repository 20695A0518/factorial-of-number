public class Factorial {
    public void Exception(){
    }
    public int fact(int n){
        int i=1;
        int s=1;
        while (i<=n) {
           s*=i;
           i++;
        }
        return s;
    }
}
