package com.reptil.panda.cryptocurrencytrading.model

import java.util.*

class User{
    var id:String?= null
    var currentFiatAmmount:Double?= null
    var coinList: ArrayList<UserCoins>?= null

    constructor(currentFiatAmmount:Double, coinList: ArrayList<UserCoins>){
        id = UUID.randomUUID().toString()
        this.currentFiatAmmount = currentFiatAmmount
        this.coinList = coinList
    }
}