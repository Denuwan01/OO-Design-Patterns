public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay1 = new PhoneDisplay("Phone Display 1");
        Observer phoneDisplay2 = new PhoneDisplay("Phone Display 2");

        weatherStation.registerObserver(phoneDisplay1);
        weatherStation.registerObserver(phoneDisplay2);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
    }
}
