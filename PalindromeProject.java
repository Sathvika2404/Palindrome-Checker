import java.util.Scanner;
public class PalindromeProject {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String str1=s.nextLine();
        String str= str1.replaceAll("[^a-zA-Z0-9]", ""); //removing all the special characters and spaces
        str= str.toLowerCase(); // to make case insensitive
        int l=str.length();
        int n=0;
        if(l%2==0)
            n+=l/2;
        else
            n=(l/2)+1;
        char[] a=new char[n];
        char[] b=new char[n];
        if(str.isEmpty())
            System.out.println("Invalid String");
        else if(str.length()==1)
            System.out.println("enter a string with atleast of length 2 ");
        else
        {
            for(int i=0;i<n;i++)
            {
                a[i]=str.charAt(i);
            }
            for (int i = 0; i < n; i++) {
                b[i] = str.charAt(l - 1 - i);
            }

            boolean isPal=true;
            for(int i = 0; i < n; i++) {
                if(a[i]!=b[i])
                {
                    isPal=false;
                    break;
                }
            }
            if(isPal==true)
                System.out.println("Palindrome");
            else
                System.out.println("Not A Palindrome");
        }
        s.close();
    }
}
