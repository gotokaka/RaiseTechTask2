import java.util.List;

class MobileSuit {

    private final String name; //MobileSuitの名前
    private final String color;//MobileSuitの色
    private final String force;//MobileSuitの所属

    public MobileSuit(String name,String color,String force){

        this.name = name;
        this.color = color;
        this.force = force;

    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getForce() {
        return force;
    }
}