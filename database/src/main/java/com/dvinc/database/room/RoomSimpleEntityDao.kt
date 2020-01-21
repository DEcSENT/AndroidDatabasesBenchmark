package com.dvinc.database.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RoomSimpleEntityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: RoomSimpleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: List<RoomSimpleEntity>)

    @Query("SELECT * FROM roomsimpleentity")
    fun getEntities(): List<RoomSimpleEntity>

    @Query("DELETE FROM roomsimpleentity")
    fun deleteAllEntities()
}
