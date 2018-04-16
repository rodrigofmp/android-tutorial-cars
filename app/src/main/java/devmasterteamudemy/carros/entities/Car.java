package devmasterteamudemy.carros.entities;

import android.graphics.drawable.Drawable;

/**
 * Created by rodrigofmp on 24/02/18.
 */

public class Car {

    public int id;
    public String model;
    public int horsePower;
    public Double price;
    public String manufacturer;
    public Drawable picture;

    public Car(int id, String model, String manufacturer, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }
}
