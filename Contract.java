package com.example.android.habittracker.Data;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class Contract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private Contract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class IndividualEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_NAME ="name";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_AGE = "age";

        /**
         * Gender of the pet.
         *
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_GENDER = "gender";

        /**
         * Weight of the pet.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}

