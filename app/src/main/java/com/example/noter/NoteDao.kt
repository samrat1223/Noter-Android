package com.example.noter

import androidx.room.*


@Dao
interface NoteDao {
    // This support all DBMS Queries you want to perform .
    //Suppose you write an insert function and this function will insert a note into the table

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC ")
    fun getAllNotes() : List<Note>
}