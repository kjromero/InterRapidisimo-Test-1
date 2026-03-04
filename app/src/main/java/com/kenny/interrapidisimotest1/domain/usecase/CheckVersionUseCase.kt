package com.kenny.interrapidisimotest1.domain.usecase

import com.kenny.interrapidisimotest1.domain.model.DomainError
import com.kenny.interrapidisimotest1.domain.model.Either
import com.kenny.interrapidisimotest1.domain.model.VersionStatus
import com.kenny.interrapidisimotest1.domain.repository.VersionRepository
import javax.inject.Inject

class CheckVersionUseCase @Inject constructor(
    private val versionRepository: VersionRepository,
) {
    suspend operator fun invoke(localVersion: Int): Either<DomainError, VersionStatus> {
        val result = versionRepository.getRemoteVersion()
        return when (result) {
            is Either.Left -> result
            is Either.Right -> {
                val remoteVersion = result.value.toIntOrNull() ?: 0
                Either.Right(
                    when {
                        localVersion < remoteVersion -> VersionStatus.LocalIsOutdated(localVersion.toString(), remoteVersion.toString())
                        localVersion > remoteVersion -> VersionStatus.LocalIsNewer(localVersion.toString(), remoteVersion.toString())
                        else -> VersionStatus.Match(localVersion.toString())
                    }
                )
            }
        }
    }
}