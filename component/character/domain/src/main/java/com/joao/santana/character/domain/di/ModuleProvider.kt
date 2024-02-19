package com.joao.santana.character.domain.di

import com.joao.santana.character.domain.interactor.GetAllCharactersInteractor
import com.joao.santana.character.domain.interactor.GetSingleCharacterInteractor
import org.koin.dsl.module

object ModuleProvider {
    
    val interactorModule = module { 
        factory { GetAllCharactersInteractor(get()) }
        factory { GetSingleCharacterInteractor(get()) }
    }
}
