package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    final private List<SMS> messages;

    public SMSOrganizer() {
        messages = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS sms) {
        this.messages.add(sms);
    }

    public List<SMS> getListByDate() {
        messages.sort(SMS.data);
        return this.messages;
    }

    public List<SMS> getListBySender() {
        messages.sort(SMS.mittente);
        return this.messages;
    }
}
