package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var listTop:MutableList<String>
    lateinit var list:MutableList<RCVItem>
    lateinit var list1:MutableList<InnerItem>
    lateinit var list2:MutableList<InnerItem>
    lateinit var list3:MutableList<InnerItem>
    lateinit var list4:MutableList<InnerItem>
    lateinit var list5:MutableList<InnerItem>
    lateinit var list6:MutableList<InnerItem>
    lateinit var list7:MutableList<InnerItem>
    lateinit var list8:MutableList<InnerItem>
    lateinit var list9:MutableList<InnerItem>
    lateinit var list10:MutableList<InnerItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listTop = mutableListOf()
        listTop.addAll(arrayListOf("For you", "Top charts", "Children", "Premium", "Categories", "Editor's Choice"))
        topRcv.adapter = TopRcvAdapter(this, listTop)
        loadData()
        rcv.adapter = MainRCVAdapter(this, list)
        rcv.layoutManager = LinearLayoutManager(this)


    }

    private fun loadData() {
        loadInnerData()
        list = mutableListOf()
        val item1 = RCVItem()
        item1.string = "Discover recommended games"
        val recyclerView = RecyclerView(this)
        recyclerView.adapter = InnerRcvAdapter(this, list1)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        item1.rcv = recyclerView
        list.add(item1)

        val item2 = RCVItem()
        item2.string = "Suggested for you"
        val recyclerView1 = RecyclerView(this)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = InnerRcvAdapter(this, list2)
        item2.rcv = recyclerView1
        list.add(item2)

        val item3 = RCVItem()
        item3.string = "Premium games"
        val recyclerView2 = RecyclerView(this)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = InnerRcvAdapter(this, list3)
        item3.rcv = recyclerView2
        list.add(item3)
    }

    private fun loadInnerData() {
        list1 = mutableListOf()
        var item = InnerItem("https://play-lh.googleusercontent.com/AWyCxphtp45dYyZjPxAHuSJqAT3FwHSQdrH2opl-m3R9bD7pqoCE6WRcmrXLqNJDaLk=w720-h310-rw", "https://play-lh.googleusercontent.com/ZQXNGxMGyXurnCTHHj5JQh52_fWEjXUwYGeJi3VKWOwrEeUjGAvcdCJSySmMGxvZujI=s180-rw", "Beacjh Buggy Racing", "Racing", "4.4", "82 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/TZB8fK6rypI-6lfSySdwmAoy0CjxQZ5ejuEizmQXW40FvuZ9ko7y2BNHZHJcnXEQf1x-=w720-h310-rw", "https://play-lh.googleusercontent.com/SGS-r-NmqdUVkOxqd7E92TWUqopyjfJ5oVfLMBv6sVjqNLBYxFnn5wJCX6lUSZ-d1VWn=s180-rw", "Cell to Singularity - Evolution", "Simulation", "4.5", "97 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/xN0Iyt0mdEU9JMi_gObVugsaJBbRuBFL5jIhriy5Ky7dDNFig_nbxH0fNaX3uh9be5n7=w720-h310-rw", "https://play-lh.googleusercontent.com/o-mwZhDsl644uJzVgQirinNxqUr-yG-8KcDEvcLK-1Rsv_skZTkyOvsOiqV4I2YFX1tE=s180-rw", "Chess Royale: Play and Learn free Online", "Board", "4.5", "78 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/WakXgCBRKrIogiK4f3Q7LebMko3lp85NDenkuqFRuL4QEeo6PBXiBOx7IIK9gUKQ9Idh=w720-h310-rw", "https://play-lh.googleusercontent.com/DaK6MZTcREsXvOMjwB28aD3ZkyJ9h6zPXwHsZCCfxQEC2EXSuMknmnJveRhbRrHV-A=s180-rw", "Energy: AntiStress Loops", "Puzzle", "4.8", "39 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/-Yoo3r9oNuderBeYLzxjVKYPoVpB1G8YPIEAqF_je6XpCNysHz01QENWLhWdnFfoIatJ=w720-h310-rw", "https://play-lh.googleusercontent.com/G1p4B59USSKWcU3xrAKPoNOA_1YoXOYVNK5D6roSgL1J6hgj1389GDwcLDbhX9qz4xs=s180-rw", "Europan War 6: 1914 - WW2 StrategyGame", "Strategy", "4.5", "104 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/kooJfeyCuMyM4efz8V4LVwvRzTENN-WwgD8rlyTurKdJShTzDXg1nN4z3XGny_N5AA=w720-h310-rw", "https://play-lh.googleusercontent.com/V4mD_YwNoVRZYjeWEon2QmrSaHaO8luHG4KrI1i_etKrGv054sLqllOS09VxZwEz-w=s180-rw", "Modern Warships: Sea Battle Online", "Action", "4.7", "262 MB")
        list1.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/8e7Vq03aWkgjosDgRnVTaltQzFtwPQTcee7qFtWeJEJFwWZup41ecxnC2g9G6CV8fw=w720-h310-rw", "https://play-lh.googleusercontent.com/UlyGE1J33f5F_9T5ra2TFQQCnatqGvp1WH9WpM-V5JqED56IUhkpGfBWNtbRk6qirKk=s180-rw", "Defense Zone 3 HD", "Strategy", "4.5", "147 MB")
        list1.add(item)

        list2 = mutableListOf()
        item = InnerItem("https://play-lh.googleusercontent.com/j8-imOvi67brdgjUE96xHzZM_dJbzR-xO2OGsUMMNQr3zEtYzAz3KbUfUA7lPXqlgqM=w720-h310-rw", "https://play-lh.googleusercontent.com/JRd05pyBH41qjgsJuWduRJpDeZG0Hnb0yjf2nWqO7VaGKL10-G5UIygxED-WNOc3pg=s180-rw", "PUBG MOBILE 1.5: IGNITION", "Action", "4.5", "696 MB")
        list2.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/raGGHaGtDHPfucyMO7UWyajs-CQOkF2ohzlcb4CzTDPXyhkFSwPrYGrV-9kSQSh59mc=w720-h310-rw", "https://play-lh.googleusercontent.com/cmd3VpWaBAmXTJ4cDDQkyMqnC5EibXhUrK6S6Blp1myO8D5qoU_U4VkOxR3u8obrGXiI=s180-rw", "Castle Cash", "Strategy", "4.3", "613")
        list2.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/SKlwl-s8-5LuMBj3nKYAkJ52v6GV6IeeZ_H6iMr-VFreKQ2tAhgjNYWcij6nk_9vNlM=w720-h310-rw", "https://play-lh.googleusercontent.com/LBZkUdopEhebgjpjhWKwxHX2r0UmBMH9wqUR4Xc4rnkFYG_joN3AYZ8wVB5BRLL8OyI=s180-rw", "Drift Max Pro", "Racing", "4.5", "378 MB")
        list2.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/S_R8tsen1Q89_-eFFVgW0B59Jc_8piDocbm4LM5PJwgTYduJa00VAHrkG_0-uActwwWL=w720-h310-rw", "https://play-lh.googleusercontent.com/IpICTa1bEJAv2xiVgdpDy1Otn1jX0p4YPS_JISp3EnP8youLeYLd-afbKUyHksWjXmTg=s180-rw", "RACE: Rocket Arena Car Extreme", "Racing", "4.5", "149 MB")
        list2.add(item)

        list3 = mutableListOf()
        item = InnerItem("https://play-lh.googleusercontent.com/soywaPw0kB7fiDHokNdGlxbOijFwLe8XahjnZhJAejpCTcPMdogHEu10hcAF6dBW9LI=w720-h310-rw", "https://play-lh.googleusercontent.com/nl1Y6bn06faVBuPEwWh5gInl_Zji3A5wTA4zscKDsJLXpcZ5C35F5zaGzEwCE0bKJ8Jr=s180-rw", "Grand Theft Auto: Vice City", "Arcade", "4.3", "$4.99")
        list3.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/13WfWxp48qO1mpQ7lpQIWidRXuebTS0-MkmI-sMiahmR_7OkAzOgM8GJxEg4Zv4aNQ=w720-h310-rw", "https://play-lh.googleusercontent.com/Kedo-c81Tcz9l_tit-d9Bprl-rMiIaQiCf4eoZO_hHXN7Z55T7aNeaZezrW1bg1uMfg=s180-rw", "Assasin's Creed Identity", "Action", "4.6", "$2.16")
        list3.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/IlhopeC41hp-BPT3HaQJ_ucLmlOif-cdk6fpDpWITVq8EUrvusPLT5nL4yfB1krpKH0=w720-h310-rw", "https://play-lh.googleusercontent.com/LyOLqzFJtKHmTPiciOepfy2yatlJ7fJYITmNMO63Qd1qYWhwXvk-VioEp0jBHwTqrJA=s180-rw", "Need For Speed: Most Wanted", "Racing", "4.5", "$6.52")
        list3.add(item)
        item = InnerItem("https://play-lh.googleusercontent.com/0-zBoTxVn5PJQtNNnovURx1JIbIytd7_H8fXbOVNyReZkKdgU30BkBzD-XmdoP6BtS0=w720-h310-rw", "https://play-lh.googleusercontent.com/VSwHQjcAttxsLE47RuS4PqpC4LT7lCoSjE7Hx5AW_yCxtDvcnsHHvm5CTuL5BPN-uRTP=s180-rw", "Minecraft", "Arcade", "4.5", "$7.49")
        list3.add(item)
    }
}