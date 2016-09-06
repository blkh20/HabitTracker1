package com.example.android.habittracker.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Database helper for Pets app. Manages database creation and version management.
 */
public class IndividualDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = IndividualDbHelper.class.getSimpleName();

    /**
     * Name of the database file
     */
    private static final String DATABASE_NAME = "habits.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link IndividualDbHelper}.
     *
     * @param context of the app
     */
    public IndividualDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_TABLE = "CREATE TABLE " + Contract.IndividualEntry.TABLE_NAME + " ("
                + Contract.IndividualEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Contract.IndividualEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + Contract.IndividualEntry.COLUMN_AGE + " INTEGER NOT NULL, "
                + Contract.IndividualEntry.COLUMN_GENDER + " INTEGER NOT NULL, "
                + Contract.IndividualEntry.COLUMN_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            Log.d(LOG_TAG, "onUpgrade method called");
    }
    // Method to delete the db
    public void deleteDatabase(Context context, String dbName) {

        context.deleteDatabase(dbName);
        Log.d(LOG_TAG, "deleteDatabase method called");
    }
}