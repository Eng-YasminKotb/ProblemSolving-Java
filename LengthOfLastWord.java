import java.lang.String;


public class LengthOfLastWord {

      public int lengthOfLastWord(String s){
          int n=s.length()-1, cnt=0;
          boolean isAlpha=false;
          for(int i=n;i>=0;i--){
              if(s.charAt(i)!=' '){
                  cnt++;
                  isAlpha=true;
              }
              else if(s.charAt(i)==' ' && isAlpha==true){
                  return cnt;
              }
          }
          return cnt;
      }
}
