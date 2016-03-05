package com.temnogrudova.contentprovider;

/**
 * Created by 123 on 05.03.2016.
 */
public class DB_Constants {
    // // Константы для БД
    // БД
    static final String DB_NAME = "mydb";
    static final int DB_VERSION = 1;

    // Таблица
    static final String CONTACT_TABLE = "contacts";

    // Поля
    static final String CONTACT_ID = "_id";
    static final String CONTACT_NAME = "name";
    static final String CONTACT_EMAIL = "email";

    // Скрипт создания таблицы
    static final String DB_CREATE = "create table " + CONTACT_TABLE + "("
            + CONTACT_ID + " integer primary key autoincrement, "
            + CONTACT_NAME + " text, " + CONTACT_EMAIL + " text" + ");";
}
