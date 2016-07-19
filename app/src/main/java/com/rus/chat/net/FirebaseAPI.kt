package com.rus.chat.net

import com.rus.chat.entity.conversation.Conversation
import com.rus.chat.entity.conversation.User
import retrofit2.Call
import retrofit2.http.*
import rx.Observable

/**
 * Created by RUS on 17.07.2016.
 */
interface FirebaseAPI {

    @PUT("users/{id}.json")
    fun addUser(@Path("id") id: String, @Body user: User): Observable<User>

    @GET("users/{id}.json")
    fun getUserById(@Path("id") uid: String): Observable<User>

    @GET("conversations.json")
    fun getConversations(): Observable<List<Conversation>>

}