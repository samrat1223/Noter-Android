package com.example.noter

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface NoteDao {
    // This support all DBMS Queries you want to perform .
    //Suppose you write an insert function and this function will insert a note into the table

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    //Suspend means that we want to perform insert in background thread and not in the main thread
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC ")
    fun getAllNotes() : LiveData<List<Note>>
}