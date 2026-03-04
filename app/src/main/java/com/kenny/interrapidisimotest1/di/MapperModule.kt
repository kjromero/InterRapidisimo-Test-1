package com.kenny.interrapidisimotest1.di

import com.kenny.interrapidisimotest1.data.remote.mapper.DefaultHttpErrorMapper
import com.kenny.interrapidisimotest1.data.remote.mapper.HttpErrorMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    @Singleton
    abstract fun bindHttpErrorMapper(impl: DefaultHttpErrorMapper): HttpErrorMapper
}