/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.benchmark.room

import androidx.benchmark.junit4.measureRepeated
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dvinc.benchmark.BaseBenchmarkTest
import com.dvinc.benchmark.room.RoomBenchmarkHelper.createSimpleEntities
import com.dvinc.database.room.RoomSimpleEntityDao
import com.dvinc.database.room.RoomDb
import com.dvinc.database.room.RoomSimpleEntity
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RoomBenchmark : BaseBenchmarkTest() {

    private val dbName = "room_db"

    private lateinit var roomDb: RoomDb

    private lateinit var roomSimpleEntityDao: RoomSimpleEntityDao

    @Before
    fun setUp() {
        roomDb = Room.databaseBuilder(getContext(), RoomDb::class.java, dbName).build()
        roomSimpleEntityDao = roomDb.roomDao()
    }

    @After
    fun tearDown() {
        roomDb.clearAllTables()
        roomDb.close()
    }

    @Test
    fun create_simple_entity_1() {
        val data = RoomSimpleEntity(name = "foo")
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_10() {
        val data = createSimpleEntities(100)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_100() {
        val data = createSimpleEntities(100)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_1000() {
        val data = createSimpleEntities(1000)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_10000() {
        val data = createSimpleEntities(10000)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_25000() {
        val data = createSimpleEntities(25000)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun create_simple_entities_50000() {
        val data = createSimpleEntities(50000)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.insert(data)
        }
    }

    @Test
    fun read_simple_entity_1() {
        val data = RoomSimpleEntity(name = "foo")
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_10() {
        val data = createSimpleEntities(100)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_100() {
        val data = createSimpleEntities(100)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_1000() {
        val data = createSimpleEntities(1000)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_10000() {
        val data = createSimpleEntities(10000)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_25000() {
        val data = createSimpleEntities(25000)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }

    @Test
    fun read_simple_entities_50000() {
        val data = createSimpleEntities(50000)
        roomSimpleEntityDao.insert(data)
        benchmarkRule.measureRepeated {
            roomSimpleEntityDao.getEntities()
        }
    }
}
