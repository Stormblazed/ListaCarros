package br.com.example.listacarros.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.example.listacarros.Model.ModeloModel
import br.com.example.listacarros.R
import kotlinx.android.synthetic.main.item_list.view.*

class ModeloAdapter (val contexto: Context, val lista: ArrayList<ModeloModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return lista.size
    }

    override fun getItem(p0: Int): Any {
        return  p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(contexto).inflate(R.layout.item_list, p2, false)

        view.tvItem.text =  lista[p0].descricao

        return  view
    }
}