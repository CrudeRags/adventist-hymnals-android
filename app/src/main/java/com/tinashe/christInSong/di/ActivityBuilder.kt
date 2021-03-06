/*
 * Copyright (c) 2018. Tinashe Mzondiwa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tinashe.christInSong.di

import com.tinashe.christInSong.ui.home.HomeActivity
import com.tinashe.christInSong.ui.home.hymns.search.SearchActivity
import com.tinashe.christInSong.ui.home.navigation.NavigationFragment
import com.tinashe.christInSong.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    abstract fun bindHomeActivity(): HomeActivity

    @ContributesAndroidInjector
    abstract fun bindNavigationFragment(): NavigationFragment

    @ContributesAndroidInjector
    abstract fun bindSearchActivity(): SearchActivity
}