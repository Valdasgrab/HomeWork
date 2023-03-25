package lt.vgrabauskas.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "Homework ref"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        typeMaxNumber()
    }

    fun typeMaxNumber() {
        val maxByte: Byte = Byte.MAX_VALUE
        val maxShort: Short = Short.MAX_VALUE
        val maxInt = Int.MAX_VALUE
        val maxLong: Long = Long.MAX_VALUE

        Log.i(
            TAG,
            "Max Byte: $maxByte, Max Short: $maxShort, Max Int: $maxInt, Max Long $maxLong"
        )

        var suma = maxLong.plus(maxInt).plus(maxShort).plus(maxByte)

        Log.i(TAG, "The sum of the numbers: $suma")

        var floatRef: Float
        var doubleRef: Double

        val charTypeOne: Char = 88.toChar()
        val charTypeTwo: Char = '*'

        Log.i(TAG, "typeMaxNumber: Char type: $charTypeOne, $charTypeTwo")

    }
}