package ru.sberbank.homework16.di;

import android.content.Context;

import dagger.Component;
import ru.sberbank.homework16.presentation.presenters.MainPresenter;
import ru.sberbank.homework16.presentation.ui.activities.MainActivity;

@Component(modules = {ViewModule.class, WeatherModule.class, ContextModule.class})
public interface WeatherComponent {
    Context context();

    MainPresenter.View view();

    void inject(MainActivity mainActivity);
}
