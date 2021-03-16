package com.android.sample.feature.search.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.android.sample.commons.base.BasePagingViewModel
import com.android.sample.commons.paging.Listing
import com.android.sample.commons.util.schedulers.BaseSchedulerProvider
import com.android.sample.core.domain.SearchPeopleUseCase
import com.android.sample.core.response.Person
import com.android.sample.feature.search.paging.SearchPageKeyRepository
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val useCase: SearchPeopleUseCase,
    private val schedulerProvider: BaseSchedulerProvider,
    private val app: Application
) : BasePagingViewModel<Person>(app) {

    private val query = MutableLiveData<String>()

    override val repoResult: LiveData<Listing<Person>> = Transformations.map(query) {
        SearchPageKeyRepository(
            useCase, it, compositeDisposable,
            schedulerProvider, app.applicationContext
        ).getItems(networkIO)
    }

    fun showQuery(query: String): Boolean {
        if (this.query.value == query) {
            return false
        }
        this.query.value = query
        return true
    }
}