package com.kenny.interrapidisimotest1.data.remote.mapper

import com.kenny.interrapidisimotest1.domain.model.DomainError
import javax.inject.Inject

class DefaultHttpErrorMapper @Inject constructor() : HttpErrorMapper {
    override fun map(code: Int): DomainError = when (code) {
        401, 403 -> DomainError.Unauthorized
        in 500..599 -> DomainError.Server
        else -> DomainError.Unknown
    }
}