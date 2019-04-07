package ru.sberbank.homework16.di;

import dagger.Component;
import ru.sberbank.homework16.data.ForecastRepositoryImpl;

@Component(modules = DataModule.class)
public interface DataComponent {
    void inject(ForecastRepositoryImpl forecastRepository);
}
