package com.joao.santana.component.character.data.di

import com.joao.santana.character.domain.repository.CharacterRepository
import com.joao.santana.component.character.data.mapper.CharacterMapper
import com.joao.santana.component.character.data.repository.CharacterRepositoryImpl
import com.joao.santana.component.character.data.source.CharacterRemoteDataSource
import com.joao.santana.component.character.data.source.CharacterRemoteDataSourceImpl
import org.koin.dsl.module

object ModuleProvider {

    val mapperModule = module {
        factory { CharacterMapper() }
    }

    val repositoryModule = module {
        factory<CharacterRepository> { CharacterRepositoryImpl(get(), get()) }
    }

    val dataSourceModule = module { 
        factory<CharacterRemoteDataSource> { CharacterRemoteDataSourceImpl(get()) }
    }
}
