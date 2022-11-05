package p7;

public class ReverseInt {
    public int reverse(int x) {
        if(-Math.pow(2,31) <=x && x<= Math.pow(2,31)-1){
            int rem;
            long rsv=0;

            if(x>0){
                while (x > 0) {
                    rem=x%10;
                    x=x/10;
                    rsv=rsv*10+rem;
                }
            }
            else{
                while (x<0){
                    rem=x%10;
                    x=x/10;
                    rsv=rsv*10+rem;
                }
            }
            if(-Math.pow(2,31) <=rsv && rsv<= Math.pow(2,31)-1){
                return (int)rsv;
            }
            else{
                return 0;
            }
        }else{

            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInt().reverse(1534236469));;
        System.out.println((Math.pow(2,31)-1)>1056389759);
    }
}
