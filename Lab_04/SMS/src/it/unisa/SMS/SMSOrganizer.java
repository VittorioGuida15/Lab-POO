package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    List messages;
    public SMSOrganizer(){
        this.messages = new ArrayList<SMS>();
    }

    public List getMessages() {
        return messages;
    }

    public void addSMSToOrganizer(SMS sms) {
        this.messages.add(sms);
    }

    static Comparator<SMS> data = new Comparator<SMS>() {
        @Override
        public int compare(SMS sms1, SMS sms2) {
            return sms1.getDate().compareTo(sms2.getDate());
        }
    };

    static Comparator<SMS> sender = new Comparator<SMS>() {
        @Override
        public int compare(SMS sms1, SMS sms2) {
            return sms1.getSender().compareTo(sms2.getSender());
        }
    };
    public List getListByDate(){
        this.messages.sort(data);
        return this.messages;
    }

    public List getListBySender(){
        this.messages.sort(sender);
        return this.messages;
    }
}
