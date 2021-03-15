package com.android.sample.feature.search.di

import com.android.sample.core.di.CoreComponent
import com.android.sample.core.di.FeatureScope
import com.android.sample.feature.search.ui.SearchFragment
import dagger.Component

/**
 * Class for which a fully-formed, dependency-injected implementation is to
 * be generated from [SearchModule].
 *
 * @see Component
 */
@FeatureScope
@Component(
        modules = [SearchModule::class],
        dependencies = [CoreComponent::class]
)
interface SearchComponent {

    /**
     * Inject dependencies on component.
     *
     * @param searchFragment
     */
    fun inject(searchFragment: SearchFragment)
}