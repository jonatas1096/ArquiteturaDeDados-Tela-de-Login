package com.example.telalogin_arquiteturadedados.listener

interface RespostaServidor {
    fun onSucess(mensagem:String)
    fun onFailure(erro:String)
}