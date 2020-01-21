/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.benchmark.objectbox

import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dvinc.benchmark.BaseBenchmarkTest
import com.dvinc.benchmark.objectbox.ObjectBoxBenchmarkHelper.createSimpleEntities
import com.dvinc.database.objectbox.BoxSimpleEntity
import com.dvinc.database.objectbox.ObjectBox
import io.objectbox.Box
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ObjectBoxBenchmark : BaseBenchmarkTest() {

    private lateinit var boxSimpleEntity: Box<BoxSimpleEntity>

    @Before
    fun setUp() {
        ObjectBox.init(getContext())
        boxSimpleEntity = ObjectBox.boxStore.boxFor(BoxSimpleEntity::class.java)
    }

    @After
    fun tearDown() {
        ObjectBox.boxStore.close()
        ObjectBox.boxStore.deleteAllFiles()
    }

    @Test
    fun create_simple_entity_1() {
        val entity = BoxSimpleEntity(name = "test")
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(entity)
        }
    }

    @Test
    fun create_simple_entities_10() {
        val data = createSimpleEntities(10)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun create_simple_entities_100() {
        val data = createSimpleEntities(100)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun create_simple_entities_1000() {
        val data = createSimpleEntities(1000)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun create_simple_entities_10000() {
        val data = createSimpleEntities(10000)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun create_simple_entities_25000() {
        val data = createSimpleEntities(25000)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun create_simple_entities_50000() {
        val data = createSimpleEntities(50000)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.put(data)
        }
    }

    @Test
    fun read_simple_entity_1() {
        val entity = BoxSimpleEntity(name = "test")
        boxSimpleEntity.put(entity)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_10() {
        val data = createSimpleEntities(10)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_100() {
        val data = createSimpleEntities(100)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_1000() {
        val data = createSimpleEntities(1000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_10000() {
        val data = createSimpleEntities(10000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_25000() {
        val data = createSimpleEntities(25000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun read_simple_entities_50000() {
        val data = createSimpleEntities(50000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.all
        }
    }

    @Test
    fun delete_simple_entity_1() {
        val entity = BoxSimpleEntity(name = "test")
        boxSimpleEntity.put(entity)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_10() {
        val data = createSimpleEntities(10)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_100() {
        val data = createSimpleEntities(100)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_1000() {
        val data = createSimpleEntities(1000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_10000() {
        val data = createSimpleEntities(10000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_25000() {
        val data = createSimpleEntities(25000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }

    @Test
    fun delete_simple_entities_50000() {
        val data = createSimpleEntities(50000)
        boxSimpleEntity.put(data)
        benchmarkRule.measureRepeated {
            boxSimpleEntity.removeAll()
        }
    }
}
