package com.example.android_hw2_webtoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_hw2_webtoon.adapter.WebtoonAdapter
import com.example.android_hw2_webtoon.model.WebtoonChar

/**
 * A simple [Fragment] subclass.
 */
class TueFragment : Fragment() {

    private var recyclerView : RecyclerView? = null
    private var gridLayoutManager : GridLayoutManager? = null
    private var arrayList : ArrayList<WebtoonChar>? = null
    private var webtoonAdapter : WebtoonAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView2 = inflater.inflate(R.layout.fragment_tue, container, false)
        recyclerView = rootView2.findViewById(R.id.web_tue)
        gridLayoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList2()
        webtoonAdapter = WebtoonAdapter(requireContext(), arrayList!!)
        recyclerView?.adapter = webtoonAdapter

        return rootView2
    }

    private fun setDataInList2() : ArrayList<WebtoonChar>? {
        var items : ArrayList<WebtoonChar> = ArrayList()
        items.add(WebtoonChar(R.drawable.tue1, "여신강림"))
        items.add(WebtoonChar(R.drawable.tue2, "마음의 소리"))
        items.add(WebtoonChar(R.drawable.tue3, "랜덤채팅의 그녀"))
        items.add(WebtoonChar(R.drawable.tue4, "체크포인트"))
        items.add(WebtoonChar(R.drawable.tue5, "신도림"))
        items.add(WebtoonChar(R.drawable.tue6, "바른연애 길잡이"))
        items.add(WebtoonChar(R.drawable.tue7, "사신소년"))
        items.add(WebtoonChar(R.drawable.tue8, "신의언어"))
        items.add(WebtoonChar(R.drawable.tue9, "원주민 공포만화"))
        items.add(WebtoonChar(R.drawable.tue10, "은주의 방"))
        items.add(WebtoonChar(R.drawable.tue11, "하루만 네가 되고 싶어"))
        items.add(WebtoonChar(R.drawable.tue12, "빙탕후루"))


        return items
    }

}
