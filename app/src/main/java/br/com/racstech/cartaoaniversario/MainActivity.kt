package br.com.racstech.cartaoaniversario

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("CicloDeVidaLog", "MainActivity::onCreate")
        configurarListener()
    }

    private fun configurarListener() {
        configurarListenerBtIrMensagem()
    }

    private fun configurarListenerBtIrMensagem() {
        val button = findViewById<Button>(R.id.btIrMensagem)
        button.setOnClickListener{
            startActivity(Intent(this, TelaParabensActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVidaLog", "MainActivity::onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVidaLog", "MainActivity::onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVidaLog", "MainActivity::onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CicloDeVidaLog", "MainActivity::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVidaLog", "MainActivity::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloDeVidaLog", "MainActivity::onDestroy")
    }


}