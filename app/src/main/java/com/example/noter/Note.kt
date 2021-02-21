package com.example.noter

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Making a table inside SQLite by annotating class 'Note' with entity
//notes_table is table name and inside class Note parameters are columns i.e. text is a column
@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name="text")val text : String) {
    @PrimaryKey(autoGenerate = true) var id = 0

    //To access these table we need to make a DAO - Data Access Object
}