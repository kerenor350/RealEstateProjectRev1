public class City {

    private String city;
    private String district;
    private String [] streetName;


    public City(String city, String district, String [] streetName) {
        this.city = city;
        this.district = district;
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String[] getDistrict() {
        return district;
    }

    public String[] getStreetName() {
        return streetName;
    }

    public void setStreetName(String[] streetName) {
        this.streetName = streetName;

    }
    public String getStreetName1() {
        return streetName1;
    }

    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    public String getStreetName2() {
        return streetName2;
    }

    public void setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
    }

    public String getStreetName3() {
        return streetName3;
    }

    public void setStreetName3(String streetName3) {
        this.streetName3 = streetName3;
    }

}