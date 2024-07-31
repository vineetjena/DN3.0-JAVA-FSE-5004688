public class ExcelDocument implements Document {
  @Override
  public void open() {
    System.out.println("Excel Document is being opened...");
  }

  @Override
  public void edit() {
    System.out.println("Editing Excel Document...");
  }

  @Override
  public void save() {
    System.out.println("Saving Excel Document...");
  }

  @Override
  public void close() {
    System.out.println("Excel Document being closed...");
  }
}