package com.thinkdevs.sqlkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		
		try{
			val myDatabase = this.openOrCreateDatabase("Musician", Context.MODE_PRIVATE, null)
			//myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musician (name VARCHAR, age INT(2))")
			//myDatabase.execSQL("INSERT INTO musician(name,age) VALUES('kevin', 27)")
//			myDatabase.execSQL("INSERT INTO musician(name,age) VALUES('Isabella', 24)")
//			myDatabase.execSQL("INSERT INTO musician(name,age) VALUES('Chance', 30)")
//			myDatabase.execSQL("INSERT INTO musician(name,age) VALUES('Medard', 39)")
//			myDatabase.execSQL("INSERT INTO musician(name,age) VALUES('Seraphine', 44)")
			
//			myDatabase.execSQL("UPDATE musician SET age = 77 WHERE name='Isabella'")
//			myDatabase.execSQL("DELETE FROM musician WHERE name ='Isabella'")
			
			
			
			
			/**
			 * Get Value From the Db
			 */
			val cursor=myDatabase.rawQuery("SELECT * FROM musician WHERE  age < 39", null)
			
			val indexName = cursor.getColumnIndex("name")
			val indexAge = cursor.getColumnIndex("age")
			
			cursor.moveToFirst()
			while (cursor != null){
				println("Name ${cursor.getString(indexName)}")
				println("Age ${cursor.getInt(indexAge)}")
				
				
				cursor.moveToNext()
				
			}
			
			if (cursor != null){
				cursor!!.close()
			}
			
			
			
		}catch(e:Exception){
		
		}
	}
}
