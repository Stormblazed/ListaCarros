package br.com.example.listacarros.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import br.com.example.listacarros.Model.FabricanteModel
import br.com.example.listacarros.R

class FabricanteAdapter(val contexto: Context, val lista: ArrayList<FabricanteModel>): BaseAdapter() {
    override fun getCount(): Int {
        return lista.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(contexto).inflate(R.layout.item_list, p2, false)
        val tvItem = view.findViewById<TextView>(R.id.tvItem)

        tvItem.text = "${lista[p0].sigla} - ${lista[p0].nome}"

        return view
    }
}