package ru.sberbank.homework16.di;

import android.content.Context;

import dagger.Component;
import ru.sberbank.homework16.presentation.presenters.MainPresenter;
import ru.sberbank.homework16.presentation.ui.activities.MainActivity;

@Component(modules = SampleModule.class)
public interface SampleComponent {
    Context context();

    MainPresenter.View view();

    void inject(MainActivity mainActivity);
}
