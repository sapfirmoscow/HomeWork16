package ru.sberbank.homework16.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.sberbank.homework16.MainActivity;

@Singleton
@Component(modules = AppModule.class)
public interface BasicComponent {
    void inject(MainActivity activity);
}
