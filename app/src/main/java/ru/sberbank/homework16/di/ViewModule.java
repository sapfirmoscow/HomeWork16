package ru.sberbank.homework16.di;

import dagger.Module;
import dagger.Provides;
import ru.sberbank.homework16.presentation.presenters.MainPresenter;

@Module
public class ViewModule {
    private final MainPresenter.View mView;


    public ViewModule(MainPresenter.View view) {
        mView = view;
    }

    @Provides
    public MainPresenter.View provideView() {
        return mView;
    }
}
