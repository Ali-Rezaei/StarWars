package com.android.sample.common.paging

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import io.reactivex.Observable

/**
 * Data class that is necessary for a UI to show a listing and interact w/ the rest of the system
 */
data class Listing<T>(
    // the LiveData of paged lists for the UI to observe
    val pagedList: Observable<PagedList<T>>,
    // represents the network request status to show to the user
    val networkState: LiveData<NetworkState>,
    // retries any failed requests.
    val retry: () -> Unit
)