package com.kenny.interrapidisimotest1.data.remote.dto

import com.google.gson.annotations.SerializedName

data class AuthResponseDto(
    @SerializedName("Usuario") val username: String?,
    @SerializedName("Identificacion") val identification: String?,
    @SerializedName("Nombre") val name: String?,
    @SerializedName("Apellido1") val lastName1: String?,
    @SerializedName("Apellido2") val lastName2: String?,
    @SerializedName("Cargo") val position: String?,
    @SerializedName("Aplicaciones") val applications: String?,
    @SerializedName("Ubicaciones") val locations: String?,
    @SerializedName("MensajeResultado") val resultCode: String?,
    @SerializedName("IdLocalidad") val localityId: String?,
    @SerializedName("NombreLocalidad") val localityName: String?,
    @SerializedName("NomRol") val roleName: String?,
    @SerializedName("IdRol") val roleId: String?,
    @SerializedName("TokenJWT") val tokenJwt: String?,
    @SerializedName("ModulosApp") val appModules: String?,
)