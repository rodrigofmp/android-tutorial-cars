package devmasterteamudemy.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import devmasterteamudemy.carros.R;
import devmasterteamudemy.carros.adapter.CarListAdapter;
import devmasterteamudemy.carros.data.CarMock;
import devmasterteamudemy.carros.entities.Car;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Como incluir RecyclerView
        // 1. Obter referência
        // 2. Construir Adapter
        // 3. Definir layout

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        this.mViewHolder.recyclerCars = this.findViewById(R.id.recycler_cars);

        CarListAdapter carListAdapter = new CarListAdapter(carList);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    public static class ViewHolder {
        RecyclerView recyclerCars;
    }
}
