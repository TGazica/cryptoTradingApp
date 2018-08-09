package com.reptil.panda.cryptocurrencytrading.model

class Coin {
    var id: String? = null
    var name: String? = null
    var rank: Int? = null
    var price: Double? = null
    var volume_24h: Double? = null
    var market_cap: Double? = null
    var percent_change_1h: Double? = null
    var percent_change_24h: Double? = null
    var percent_change_7d: Double? = null

    constructor(id: String, name: String, rank: Int, price: Double, volume_24h: Double, market_cap: Double,
                percent_change_1h: Double, percent_change_24h: Double, percent_change_7d: Double) {
        this.id = id
        this.rank = rank
        this.price = price
        this.volume_24h = volume_24h
        this.market_cap = market_cap
        this.percent_change_1h = percent_change_1h
        this.percent_change_24h = percent_change_24h
        this.percent_change_7d = percent_change_7d
    }

}