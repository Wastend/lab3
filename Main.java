import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    int past, next;
            for (int i=0;i<1000001;i++)
    {
        past=i-1;
        next=i+1;
        if (Math.sqrt(past)%1==0)
            if(Math.cbrt(next)%1==0) System.out.println(i);
    }
}
}
