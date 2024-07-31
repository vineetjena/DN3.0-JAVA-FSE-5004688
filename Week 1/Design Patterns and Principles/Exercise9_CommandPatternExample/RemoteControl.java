public class RemoteControl {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void activateRemote() {
    command.execute();
  }
}