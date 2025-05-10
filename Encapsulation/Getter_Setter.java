package Encapsulation;
class detail{
    private String name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        detail obj = new detail();
        obj.setName("Tushar Vaidya");
        System.out.println(obj.getName());
        obj.setId(18);
        System.out.println(obj.getId());

    }
}
