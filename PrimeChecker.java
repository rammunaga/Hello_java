public class PrimeChecker {
public static boolean isprime(int n){
    int i,f=0;
    for(i=2;i<=n/2;i++){
        if(n%i==0){
            f=1;
            break;
        }
    }
    if(f==0){
        return true;
    }
    return false;
}
}
