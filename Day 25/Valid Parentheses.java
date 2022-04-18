package com.company;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack <Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                boolean val = myfunc(st,'(');
                if(val==false){System.out.println(val);return;}
            }
            else if (ch==']'){
                boolean val = myfunc(st,'[');
                if(val==false){System.out.println(val);return;}
            }
            else if (ch=='}'){
                boolean val = myfunc(st,'{');
                if(val==false){System.out.println(val);return;}
            }
            else{}

        } // end of For loop

        if(st.size()==0){System.out.println(true);}
        else{System.out.println(false);}



    }// end of  main func

    public static boolean myfunc(Stack<Character> st, char corrOch)
    {
        if(st.size()==0)
        {
            return false;
        }
        else if(st.peek()!=corrOch)
        {
            return false;
        }
        else
        {
            st.pop(); return true;
        }

    }
} // end of Class
