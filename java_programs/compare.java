//import java.net.SocketTimeoutException;
import java.util.*;

class compare{
    public static boolean check(int x) {
        if( x == 1) return false;
        if(x==2) return true;
        int s = 2;
        while( s <= x/2){
            if(x%s==0) return false;
            s++;
        }
        return true;
    }

    public static void main (String [] args) throws java.lang.Exception {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(23);
        list.add(900);
        list.add(600);
        list.add(100);

        // Collections.sort(list , (e1 ,e2) -> {
        //     if(e1 < 0 && e2 > 0){
        //         return 1;
        //     }
        //     if(e1 > 0 && e2 < 0){
        //         return -1;
        //     }
        //     return Integer.compare(e1,e2);
        // });

        Collections.sort(list , (e1,e2) ->{

            if( check(e1) && check(e2)){
                return Integer.compare(e1,e2);
            }
            if(check(e1) && !check(e2)){
                return -1;
            }
            if( !check(e1) && check(e2)){
                return 1;
            }
            return Integer.compare(e2,e1);
        });
        System.out.println(list);
    }
}