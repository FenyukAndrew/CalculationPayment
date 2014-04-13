package com.Fenyuk.CalculationPayment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class WaterDataTable extends SQLiteOpenHelper 
{
	// константы для конструктора - вынести в отдельный static class - т.к. общее для всех
	private static final String DATABASE_NAME = "/sdcard/CalculationPayment.db";
	private static final int DATABASE_VERSION = 1;
	
	public WaterDataTable(Context context) 
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	private static final String SQL_CREATE_ENTRIES = 
"CREATE TABLE Water" +
"(" +
"_id INTEGER PRIMARY KEY AUTOINCREMENT," +
"Date_Input_Value DateTime," +
"Value real," +
"Sum real," +
"Sum_Commission real," +
"Date_Payment DateTime,Tariff real," +
"Month_Payment char," +
"Year_Payment char" +
");";
	
	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		// TODO Auto-generated method stub
		db.execSQL(SQL_CREATE_ENTRIES);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		// TODO Auto-generated method stub

	}

}
