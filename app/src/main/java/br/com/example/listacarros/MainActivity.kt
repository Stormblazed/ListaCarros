package br.com.example.listacarros
// Nome: Wallace Batista Bessa
// Matricula: 71700200

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.example.listacarros.Adapter.FabricanteAdapter
import br.com.example.listacarros.Model.FabricanteModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaFabricante = getListaFabricante()

        lvMaster.adapter = FabricanteAdapter(this,listaFabricante)

        lvMaster.setOnItemClickListener { adpterview,view, i, l ->
            val fabricante = listaFabricante[i]
            var intentM = Intent(this,ModeloActivity::class.java)
            intentM.putExtra("fabricante",fabricante.sigla)
            startActivity(intentM)
        }
    }

    fun getListaFabricante(): ArrayList<FabricanteModel>{
        val array = ArrayList<FabricanteModel>()
        array.add(FabricanteModel("BMW", "Bayerische Motoren Werke"))
        array.add(FabricanteModel("AUDI", "Audi AG"))
        array.add(FabricanteModel("HONDA", "Honda Motor Company, Ltd."))
        array.add(FabricanteModel("MCLAREN", "McLaren Automotive"))
        array.add(FabricanteModel("PORSCHE", "Dr. Ing. h.c. F. Porsche AG,"))
        return array
    }
}