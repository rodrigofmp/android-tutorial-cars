package devmasterteamudemy.carros.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import devmasterteamudemy.carros.R;
import devmasterteamudemy.carros.entities.Car;
import devmasterteamudemy.carros.viewholder.CarViewHolder;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder>
{
    private List<Car> mListCars;

    public CarListAdapter(List<Car> cars) {
        this.mListCars = cars;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false);
        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = this.mListCars.get(position);
        holder.bindData(car);
    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();
    }
}
