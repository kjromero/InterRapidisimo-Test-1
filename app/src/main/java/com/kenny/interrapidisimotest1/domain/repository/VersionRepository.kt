package com.kenny.interrapidisimotest1.domain.repository

import com.kenny.interrapidisimotest1.domain.model.DomainError
import com.kenny.interrapidisimotest1.domain.model.Either

interface VersionRepository {
    suspend fun getRemoteVersion(): Either<DomainError, String>
}