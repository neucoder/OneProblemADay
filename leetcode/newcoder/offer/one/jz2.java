package newcoder.offer.one;

public class jz2 {

    public String replaceSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sb.append("%20");

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
