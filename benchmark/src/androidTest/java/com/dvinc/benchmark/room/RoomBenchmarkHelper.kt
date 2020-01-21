/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.benchmark.room

import com.dvinc.database.room.RoomSimpleEntity

object RoomBenchmarkHelper {

    fun createSimpleEntities(count: Int): List<RoomSimpleEntity> {
        return (1..count).map {
            RoomSimpleEntity(name = "name$it")
        }
    }
}
