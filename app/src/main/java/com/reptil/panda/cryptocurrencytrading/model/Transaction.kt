package com.reptil.panda.cryptocurrencytrading.model

import java.util.*

class Transaction{
    var id:String?= null
    var amountUSD:Double?= null
    var cryptoId:String?= null
    var amountCrypto:Double?= null
    var timestamp:String?= null

    constructor(amountUSD:Double, cryptoId:String, amountCrypto:Double, timestamp:String){
        id = UUID.randomUUID().toString()
        this.amountUSD = amountUSD
        this.cryptoId = cryptoId
        this.amountCrypto = amountCrypto
        this.timestamp = timestamp
    }
}