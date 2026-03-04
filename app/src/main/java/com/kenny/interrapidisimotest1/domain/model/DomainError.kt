package com.kenny.interrapidisimotest1.domain.model

sealed interface DomainError {
    object Network : DomainError
    object Unauthorized : DomainError
    object Server : DomainError
    object Unknown : DomainError
}