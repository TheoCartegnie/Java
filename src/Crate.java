import java.util.Scanner;

public class Crate {
private String name;
private String [] items;


public Crate(String name)
    {
        this.name = name;
    }

    public void AddItem(String item)
    {
        items[items.length-1] = item;
    }

    public void RemoveItem(String item)
    {
        items[items.length-1] = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}