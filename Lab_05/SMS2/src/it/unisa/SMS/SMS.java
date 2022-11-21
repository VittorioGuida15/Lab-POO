package it.unisa.SMS;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class SMS {
    private final String sender;
    private final GregorianCalendar date;
    private final int id;
    private static int totalNumberSMS;
    private final String text;

    static  Comparator<SMS> data = new Comparator<SMS>() {
        @Override
        public int compare(SMS sms1, SMS sms2) {
            return sms1.date.compareTo(sms2.date);
        }
    };
    static Comparator<SMS> mittente = new Comparator<SMS>() {
        @Override
        public int compare(SMS sms1, SMS sms2) {
            return sms1.sender.compareTo(sms2.sender);
        }
    };

    public SMS(String sender, GregorianCalendar date, String text) {
        this.sender = sender;
        this.date = date;
        this.text = text;
        this.id = totalNumberSMS;
        totalNumberSMS++;
    }

    public String getSender() {
        return sender;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public static int getTotalNumberSMS() {
        return totalNumberSMS;
    }

    public String getText() {
        return text;
    }
}
