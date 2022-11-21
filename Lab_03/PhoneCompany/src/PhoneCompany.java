import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;

    /*readUserDataFromFile ;
    findUserByCode;
    computeUserCost;*
     */

    public PhoneCompany(double minutePrice, double smsPrice, int gbPrice){
        users = new ArrayList<>();
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException{
        Scanner in = new Scanner(file);

        while(in.hasNext()){
            int code = in.nextInt();
            in.nextLine();
            String name = in.nextLine();
            String lastName = in.nextLine();
            int min = in.nextInt();
            int sms = in.nextInt();
            int gb = in.nextInt();

            User user = new User(code, name, lastName);
            user.setUsedMinutes(min);
            user.setUsedSMS(sms);
            user.setUsedMB(gb);

            users.add(user);
        }
    }

    public User findUserByCode(int code){
        for(User user : users){
            if(user.getCode() == code)
                return user;
        }
        return null;
    }

    public void computeUserCost(User user){
        double tot = (user.getUsedMinutes() * minutePrice) + (user.getUsedSMS() * smsPrice) + (user.getUsedMB()/1000 * gbPrice);
        user.setTotalCost(tot);
    }
}
