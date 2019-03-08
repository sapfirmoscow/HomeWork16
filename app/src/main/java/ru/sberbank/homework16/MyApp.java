package ru.sberbank.homework16;

import android.app.Application;

import ru.sberbank.homework16.di.AppModule;
import ru.sberbank.homework16.di.BasicComponent;
import ru.sberbank.homework16.di.DaggerBasicComponent;

public class MyApp extends Application {
    private static MyApp mApp;
    private AppModule mAppModule;
    private BasicComponent mBasicComponent;

    public static MyApp app() {
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        mAppModule = new AppModule(this);
        mBasicComponent = DaggerBasicComponent.builder()
                .appModule(mAppModule)
                .build();
    }

    public BasicComponent basicComponent() {
        return mBasicComponent;
    }

    public AppModule appModule() {
        return mAppModule;
    }
}
