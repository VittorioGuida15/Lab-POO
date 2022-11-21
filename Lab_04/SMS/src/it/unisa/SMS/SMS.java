package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
  private final String sender;
  private final GregorianCalendar date;
  private static int contMessage;
  private static int id;
  private final String text;

  public SMS(String sender, GregorianCalendar date, String text){
    this.sender = sender;
    this.date = date;
    this.text = text;
    id = contMessage;
    contMessage++;
  }

  public GregorianCalendar getDate() {
    return date;
  }

  public int getId() {
    return id;
  }

  public String getSender() {
    return sender;
  }

  public String getText() {
    return text;
  }

}