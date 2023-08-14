package com.example.telalogin_arquiteturadedados.data

import com.example.telalogin_arquiteturadedados.listener.RespostaServidor

class DataSource {

    fun logar(email:String, senha:String, respostaServidor: RespostaServidor){

        if (email.isEmpty()){
            respostaServidor.onFailure("Preencha o email.")
        }
        else if(senha.isEmpty()){
            respostaServidor.onFailure("Preencha a senha.")
        }
        else if (email == "tazmania@gmail.com" && senha == "taz123"){
            respostaServidor.onSucess("Login efetuado com sucesso!")
        }
        else{
            respostaServidor.onFailure("Erro desconhecido.")
        }

    }
}