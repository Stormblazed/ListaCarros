package br.com.example.listacarros

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.example.listacarros.Adapter.ModeloAdapter
import br.com.example.listacarros.Model.ModeloModel
import kotlinx.android.synthetic.main.activity_modelo.*

class ModeloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelo)

        val fabricante = intent.getStringExtra("fabricante")

        if(!fabricante.isNullOrEmpty()){
            val listaMunicipos = getListaMunicipios(fabricante)
            lvModel.adapter = ModeloAdapter(this,listaMunicipos)
        }else{
            finish()
        }

    }

    fun getListaMunicipios(fabricante: String): ArrayList<ModeloModel>{
        val array = ArrayList<ModeloModel>()
        when (fabricante) {
            "BMW" -> {
                array.add(ModeloModel("318I"))
                array.add(ModeloModel("320I"))
                array.add(ModeloModel("328I"))
                array.add(ModeloModel("330I"))
                array.add(ModeloModel("335I"))

            }
            "AUDI" -> {
                array.add(ModeloModel("A3"))
                array.add(ModeloModel("A4"))
                array.add(ModeloModel("A5"))
                array.add(ModeloModel("A6"))
                array.add(ModeloModel("A8"))
            }
            "HONDA" -> {
                array.add(ModeloModel("CIVIC"))
                array.add(ModeloModel("FIT"))
                array.add(ModeloModel("CRV"))
                array.add(ModeloModel("HRV"))
                array.add(ModeloModel("CITY"))
            }
            "MCLAREN" -> {
                array.add(ModeloModel("GT"))
                array.add(ModeloModel("720S"))
                array.add(ModeloModel("P1"))
                array.add(ModeloModel("765LT"))
                array.add(ModeloModel("F1"))
            }
            "PORSCHE" -> {
                array.add(ModeloModel("911"))
                array.add(ModeloModel("CAYENNE"))
                array.add(ModeloModel("TAYCAN"))
                array.add(ModeloModel("MACAN"))
                array.add(ModeloModel("CAYENNE COUPÉ"))
            }
        }

        return array
    }

}