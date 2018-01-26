package ooplab7;

public class SuperCar {
    //propertis of student class

    private String carbrand ;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;
    public int length;

    //Contructor
    //defult constructor
    public  SuperCar(){}
    //create by own
    public SuperCar  (String b,String color,String eng,String max,String count){
        // assign data to class properties

        this.carbrand = b;
        this.carcolor = color;
        this.carenginesize = eng;
        this.maxspeed = max;
        this.countryoforigin = count;
    }//Student
    //getter  and setter methodos etter อ่านค่า  setter เปลี่ยนแปลงภายในpropertiesที่ต้องการ
//Alt+insent-> getter  and setter


    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }
}
