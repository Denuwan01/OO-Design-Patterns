import java.util.ArrayList;
import java.util.List;
class WeatherStation implements Subject {
    private List<Observer> observers;
    private String weather;
    public WeatherStation() {
        this.observers = new ArrayList<>(); }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer); }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather); } }
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers(); }
}


