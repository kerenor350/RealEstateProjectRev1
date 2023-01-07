public class City {

    private String cityName;
    private final static String[] district = {"South", "North", "Negev", "Center", "Hasharon"};
    private static String[] streetName = {"Ben Yehuda", "Even Gavirol", "Hatamar"," Itzchak Shamir", };


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
}