public class comparision_op {
    public static void main(String[] args) {
        // comparision opperator
       int a=10;
       int b=28;
        System.out.println(a>b);// gtreater than        10>28=28 f
        System.out.println(a<b);//less than             10<28=28 t
        System.out.println(a==b);//equal                10==28=0 f
        System.out.println(a!=b);// in eaual            10!=28=0 T
        System.out.println(a<=b);// less than or equal  10<=28=28t
        System.out.println(a>=b); // great than or eual 10>=28=10fz

        // logical operation
        // And && all cases will be true .. output will be true
        // or || any one of cases will be true ... output will be true
        boolean c=true;
        boolean v=true;
        boolean t=false;
        System.out.println(c&&v); // &&  all te cases will be true otherwise will be false
        System.out.println((c || v) && (c && v) || (c&&v)); // case are true or false but hrere all cases true
        System.out.println((c || v) && (t));  // && the second one id false so output was false
    }
}
        // t &&t  = T  using here And.........(cases are true)
        // (t)&&(t)||(t)=T using her AND ,Or..(cases are true)
        // (t)&& (f)= F   using here And .....(one case is false)
