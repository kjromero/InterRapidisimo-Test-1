package com.kenny.interrapidisimotest1.data.remote.mapper

import com.kenny.interrapidisimotest1.domain.model.DomainError

interface HttpErrorMapper {
    fun map(code: Int): DomainError
}