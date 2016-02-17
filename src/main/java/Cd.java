import java.util.ArrayList;

public class Cd {
  private static ArrayList<Cd> instances = new ArrayList<Cd>();

  private int mId;
  private String mTitle;

  public Cd(String title) {
    mTitle = title;
    instances.add(this);
    mId = instances.size();
  }

  public String getTitle() {
    return mTitle;
  }

  public static ArrayList<Cd> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Cd find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
