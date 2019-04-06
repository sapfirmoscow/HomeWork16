package ru.sberbank.homework16.domain.repository;

import java.io.IOException;

import ru.sberbank.homework16.domain.entity.Forecasts;

public interface ForecastRepository {
    Forecasts getForecast(String latitude, String longitude) throws IOException;
}
