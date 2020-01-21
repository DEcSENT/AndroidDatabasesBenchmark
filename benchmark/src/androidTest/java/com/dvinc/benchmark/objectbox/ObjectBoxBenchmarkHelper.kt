/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.benchmark.objectbox

import com.dvinc.database.objectbox.BoxSimpleEntity

object ObjectBoxBenchmarkHelper {

    fun createSimpleEntities(count: Int): List<BoxSimpleEntity> {
        return (1..count).map {
            BoxSimpleEntity(name = "name$it")
        }
    }
}
