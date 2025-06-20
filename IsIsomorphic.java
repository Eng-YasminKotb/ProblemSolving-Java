import java.util.HashMap;
import java.lang.Character;


public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> Smp=new HashMap<>();
        HashMap<Character,Character> Tmp=new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(Smp.containsKey(ch1) && Smp.get(ch1)!=ch2) return false;
            else Smp.put(ch1,ch2);

            if(Tmp.containsKey(ch2) && Tmp.get(ch2)!=ch1) return false;
            else Tmp.put(ch2,ch1);



        }

          return true;
    }

}
