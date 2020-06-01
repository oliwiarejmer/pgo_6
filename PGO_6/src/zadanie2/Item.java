package zadanie2;

public class Item {

    private int ident;
    private String name;

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int ident, String name){
                this.setIdent(ident);
                this.setName(name);
    }

    public void show(){
        System.out.println(this.getName());
    }

    public String toString(){
        return "id: " + this.getIdent() + " nazwa: " + this.getName();
    }
}
