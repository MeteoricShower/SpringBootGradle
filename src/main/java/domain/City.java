package domain;

public class City {
    private int id;
    private String name;
    private String province;
    private String country;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    @Override
    public String toString(){
        return "id = " + id + ", name = " + name + ", province = " + province + ", country = " + country;
    }
}
