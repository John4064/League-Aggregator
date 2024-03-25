package logic.interfaces

import models.AccountDto
import models.MatchDto
import models.SummonerDto
import okhttp3.OkHttpClient

interface AggregationLogic {

    val httpClient: OkHttpClient

    val apiKey: String

    fun getAccountData(userName:String, tagLine: String): AccountDto?

    fun getSummonerData(userName:String, tagLine: String): SummonerDto?

    fun getMatchIDs(userName: String, tagLine: String, matchCount: Int): ArrayList<String>

    fun getMatchData(matchID: String) :MatchDto?
}