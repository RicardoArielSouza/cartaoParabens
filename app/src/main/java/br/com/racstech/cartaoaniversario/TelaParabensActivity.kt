package br.com.racstech.cartaoaniversario

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TelaParabensActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_parabens)
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloDeVidaLog", "TelaParabensActivity::onDestroy")
    }
}