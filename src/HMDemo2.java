import java.util.HashMap;
import java.util.Map;
class Bank1
{

    int accno;
    int balance;

    Bank1(int ac, int bal)
    {
        accno = ac;
        balance = bal;
    }
}

public class HMDemo2 {

    public static void main(String args[]) {
        Bank1 b1 = new Bank1(100, 1500);
        Bank1 b2 = new Bank1(101, 2000);
        
        
        
     HashMap<Integer, Bank1> hm = new HashMap<>();
        hm.put(1, b1);
        hm.put(2, b2);
        for (Map.Entry<Integer, Bank1> m : hm.entrySet()) {
            int i = m.getKey();
            Bank1 b = m.getValue();
            System.out.println(i + ")" + b.accno + " " + b.balance);
        }
    }
}
