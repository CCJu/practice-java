//Œ Ã‚√Ë ˆ
//°°°°∏¯∂®n∏ˆ Æ¡˘Ω¯÷∆’˝’˚ ˝£¨ ‰≥ˆÀ¸√«∂‘”¶µƒ∞ÀΩ¯÷∆ ˝°£
// ‰»Î∏Ò Ω
//°°°° ‰»Îµƒµ⁄“ª––Œ™“ª∏ˆ’˝’˚ ˝n £®1<=n<=10£©°£
//°°°°Ω”œ¬¿¥n––£¨√ø––“ª∏ˆ”…0~9°¢¥Û–¥◊÷ƒ∏A~F◊È≥…µƒ◊÷∑˚¥Æ£¨±Ì æ“™◊™ªªµƒ Æ¡˘Ω¯÷∆’˝’˚ ˝£¨√ø∏ˆ Æ¡˘Ω¯÷∆ ˝≥§∂»≤ª≥¨π˝100000°£
// ‰≥ˆ∏Ò Ω
//°°°° ‰≥ˆn––£¨√ø––Œ™ ‰»Î∂‘”¶µƒ∞ÀΩ¯÷∆’˝’˚ ˝°£
//◊¢“‚
//°°°° ‰»Îµƒ Æ¡˘Ω¯÷∆ ˝≤ªª·”–«∞µº0£¨±»»Á012A°£
//°°°° ‰≥ˆµƒ∞ÀΩ¯÷∆ ˝“≤≤ªƒ‹”–«∞µº0°£
//—˘¿˝ ‰»Î
//2
//39
//123ABC
//—˘¿˝ ‰≥ˆ
//71
//4435274
//Ã· æ
//   œ»Ω´ Æ¡˘Ω¯÷∆ ˝◊™ªª≥…ƒ≥Ω¯÷∆ ˝£¨‘Ÿ”…ƒ≥Ω¯÷∆ ˝◊™ªª≥…∞ÀΩ¯÷∆°£

//±æ≥Ã–ÚÕ®π˝≤‚ ‘£¨”√¡∑œ∞œµÕ≥µƒ≤‚ ‘ ˝æ›£¨”√ ±11√Î
//∂‘◊÷∑˚¥Æ¡¨Ω”Ω¯––”≈ªØ£∫◊÷∑˚¥Æ¡¨Ω”∏ƒ”√append∑Ω∑®
import java.util.*;
public class Main1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int k,n;  
        n=input.nextInt();
        input.nextLine();
        String s1;
        StringBuffer s2 = new StringBuffer();
        for(k = 0; k < n; k++)  
        {   
            s1=input.nextLine();
            for(int i = 0; i < s1.length(); i++)
            {  
                switch(s1.charAt(i))  
                {  
                    case '0': s2.append("0000"); break;  
                    case '1': s2.append("0001"); break;  
                    case '2': s2.append("0010"); break;  
                    case '3': s2.append("0011"); break;  
                    case '4': s2.append("0100"); break;  
                    case '5': s2.append("0101"); break;  
                    case '6': s2.append("0110"); break;  
                    case '7': s2.append("0111"); break;  
                    case '8': s2.append("1000"); break;  
                    case '9': s2.append("1001"); break;  
                    case 'A': s2.append("1010"); break;  
                    case 'B': s2.append("1011"); break;  
                    case 'C': s2.append("1100"); break;  
                    case 'D': s2.append("1101"); break;  
                    case 'E': s2.append("1110"); break;  
                    case 'F': s2.append("1111"); break;  
                    default: break;  
            }  
        }  
        int len = s2.length();  
        if(len%3 == 1)
            s2.insert(0,"00");  
        else if(len%3 == 2)  
            s2.insert(0,"0");  
        int flag = 0;  
        for(int i = 0; i <= s2.length() - 3; i += 3)  
        {  
            int num = 4 * (s2.charAt(i) - '0') + 2 * (s2.charAt(i+1)- '0') + (s2.charAt(i+2)- '0');  
            if(num>0)  
                flag = 1;
            if(flag==1)  
                System.out.print(num);  
        }  
    System.out.println();  
    s2.setLength(0);
    }  
  }
}