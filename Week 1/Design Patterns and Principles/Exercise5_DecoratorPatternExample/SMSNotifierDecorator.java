public class SMSNotifierDecorator extends NotifierDecorator {

  public SMSNotifierDecorator(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String msg) {
    super.send(msg);
    sendSMS(msg);
  }

  private void sendSMS(String msg) {
    System.out.println("Sending SMS with message: " + msg); 
  }
}