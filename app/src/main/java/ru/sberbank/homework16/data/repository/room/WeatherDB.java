package ru.sberbank.homework16.data.repository.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ru.sberbank.homework16.domain.entity.Forecast;

@Database(entities = Forecast.class, version = 2)

public abstract class WeatherDB extends RoomDatabase {

    public abstract WeatherDAO getWeatherDAO();
}
