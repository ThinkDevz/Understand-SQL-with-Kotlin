package com.thinkdevs.sqlkotlin

import android.graphics.Bitmap

/**
 * Created by kevinjanvier on 10/03/2018.
 */
class Globals{
	companion object Chosen{
		var choseImage:Bitmap? = null
		
		fun returnImage():Bitmap{
			return choseImage!!
		}
	}
}