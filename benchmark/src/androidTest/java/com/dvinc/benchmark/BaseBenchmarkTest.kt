/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.benchmark

import android.content.Context
import androidx.benchmark.junit4.BenchmarkRule
import androidx.test.core.app.ApplicationProvider
import org.junit.Rule

abstract class BaseBenchmarkTest {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    fun getContext(): Context = ApplicationProvider.getApplicationContext<Context>()
}
