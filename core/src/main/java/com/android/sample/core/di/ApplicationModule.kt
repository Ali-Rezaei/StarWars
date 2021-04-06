package com.android.sample.core.di

import android.app.Application
import com.android.sample.common.util.schedulers.BaseSchedulerProvider
import com.android.sample.common.util.schedulers.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Class that contributes to the object graph [CoreComponent].
 *
 * @see Module
 */
@Module
class ApplicationModule(private val application: Application) {

    /**
     * Create a provider method binding for [Application].
     *
     * @return Instance of application.
     * @see Provides
     */
    @Singleton
    @Provides
    fun provideApplication(): Application = application

    /**
     * Create a provider method binding for [SchedulerProvider].
     *
     * @return Instance of SchedulerProvider.
     * @see Provides
     */
    @Provides
    fun provideSchedulerProvider(): BaseSchedulerProvider = SchedulerProvider()
}