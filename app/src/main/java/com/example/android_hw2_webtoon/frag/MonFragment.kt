package com.example.android_hw2_webtoon.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_hw2_webtoon.R
import com.example.android_hw2_webtoon.adapter.WebtoonAdapter
import com.example.android_hw2_webtoon.model.WebtoonChar

/**
 * A simple [Fragment] subclass.
 */
class MonFragment : Fragment() {

    private var recyclerView : RecyclerView? = null
    private var gridLayoutManager : GridLayoutManager? = null
    private var arrayList : ArrayList<WebtoonChar>? = null
    private var webtoonAdapter : WebtoonAdapter? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView1 = inflater.inflate(R.layout.fragment_mon, container, false)
        recyclerView = rootView1.findViewById(R.id.web_mon)
        gridLayoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList1()
        webtoonAdapter = WebtoonAdapter(requireContext(), arrayList!!)
        recyclerView?.adapter = webtoonAdapter

        return rootView1

    }

    private fun setDataInList1() : ArrayList<WebtoonChar>? {
        var items : ArrayList<WebtoonChar> = ArrayList()
        items.add(WebtoonChar(R.drawable.mon1, "신의탑"))
        items.add(WebtoonChar(R.drawable.mon2, "윈드브레이커"))
        items.add(WebtoonChar(R.drawable.mon3, "인생존망"))
        items.add(WebtoonChar(R.drawable.mon4, "소녀의 세계"))
        items.add(WebtoonChar(R.drawable.mon5, "평범한 8반"))
        items.add(WebtoonChar(R.drawable.mon6, "귀전구담"))
        items.add(WebtoonChar(R.drawable.mon7, "백수세기"))
        items.add(WebtoonChar(R.drawable.mon8, "야자괴담"))
        items.add(WebtoonChar(R.drawable.mon9, "장씨세가 호위무사"))
        items.add(WebtoonChar(R.drawable.mon10, "데드라이프"))
        items.add(WebtoonChar(R.drawable.mon11, "유일무이 로맨스"))
        items.add(WebtoonChar(R.drawable.mon12, "링크보이"))


        return items
    }



}
