package org.blockstack.android.sdktest.test

import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import androidx.test.rule.ActivityTestRule
import org.blockstack.android.sdk.BLOCKSTACK_SESSION
import org.blockstack.android.sdk.SessionStore

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
}


val A_VALID_BLOCKSTACK_SESSION_JSON = "{\"transitKey\":\"000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f\",\"userData\":{\"username\":null,\"profile\":{\"@type\":\"Person\",\"@context\":\"http:\\/\\/schema.org\",\"apps\":{\"https:\\/\\/app.graphitedocs.com\":\"https:\\/\\/gaia.blockstack.org\\/hub\\/1Fuzd6sJXqtXhgoFpb8W19Ao4BCG3EHQGf\\/\",\"https:\\/\\/app.misthos.io\":\"https:\\/\\/gaia.blockstack.org\\/hub\\/1CkGhNN71a1dpgXQjncunYZpXakJvwrpmc\\/\"},\"image\":[{\"@type\":\"ImageObject\",\"name\":\"avatar\",\"contentUrl\":\"https:\\/\\/gaia.blockstack.org\\/hub\\/12Gpr9kYXJJn4fWec4nRVwHLSrrTieeywt\\/\\/avatar-0\"}],\"name\":\"fm\"},\"decentralizedID\":\"did:btc-addr:12Gpr9kYXJJn4fWec4nRVwHLSrrTieeywt\",\"identityAddress\":\"12Gpr9kYXJJn4fWec4nRVwHLSrrTieeywt\",\"appPrivateKey\":\"89f92476f13f5b173e53926ad7d6e22baf78c6b1dcdf200c38dc73d2bf47d43b\",\"coreSessionToken\":null,\"authResponseToken\":\"eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NksifQ.eyJqdGkiOiI3MWI3NWY1Yi0xNDJkLTQxMzQtOGZkYy0zYWUyMWRmZTkzNjAiLCJpYXQiOjE1MzcxNjkxODYsImV4cCI6MTUzOTc2MTE4NSwiaXNzIjoiZGlkOmJ0Yy1hZGRyOjEyR3ByOWtZWEpKbjRmV2VjNG5SVndITFNyclRpZWV5d3QiLCJwcml2YXRlX2tleSI6IjdiMjI2OTc2MjIzYTIyMzEzOTMzMzM2NTM5MzYzNTY2NjMzNzM5NjM2MjYyMzAzNjY0NjMzMjM0MzIzNzY2NjY2MjYzMzczMjMyMzgzOTIyMmMyMjY1NzA2ODY1NmQ2NTcyNjE2YzUwNGIyMjNhMjIzMDMyMzQzMTY1MzY2NjYzMzEzODM0MzAzMDMyMzQzMTY0NjYzNzMzMzMzNTY1NjM2MjY2MzQzMzM0NjY2NDM5MzU2MjY0NjUzMjY2MzIzNTMxNjU2MzM3MzczNjMxMzQzNDM0MzAzMjY2NjUzNTM3NjE2MzYzMzA2MjY2MzQzNjYxMzQyMjJjMjI2MzY5NzA2ODY1NzI1NDY1Nzg3NDIyM2EyMjM5MzkzMTYxMzM2MzM1NjYzOTY2NjI2MzM2MzYzMzY2MzMzMDY0MzgzNzMxMzgzNzMyNjIzODM5MzMzMTYxMzMzMTMyNjUzMjM0NjM2MjM4MzAzNzM1NjQzODY0MzkzNzM1Mzg2MjM3NjEzMDY1NjMzMTM0Mzg2MTM2MzEzMjM2MzIzMjY1MzYzMjYyMzQ2NjY1NjYzNjMzNjMzMTYzNjYzMjMzNjEzMTM3MzM2NTM0NjUzOTMwMzIzMzM5MzQ2NDY1NjEzMTMxMzQzOTYzNjE2NTYxMzMzMzY2MzMzODY2NjIzMTMwMzczNTM0MzU2NDM1MzUzNDM3NjYzNjY2NjMzODMwMzg2MTM2MzIzNjM2MzAzMDMzNjMzNzM5MzMzNzM4MzYzMzM4MzMzNDMyNjEzNjYzMzMzOTM4MzM2MjM5MjIyYzIyNmQ2MTYzMjIzYTIyNjYzODMwMzQ2MjMzMzY2MjY0MzgzMjM2NjQzNTM3MzIzMzYxMzQzOTM4MzczOTYzMzAzMDYzNjQ2MzMzNjYzMDYxNjQzNzY0NjE2MTYyNjE2NDM0MzY2NDMzMzczNjY0MzUzMTYxNjI2NjYzNjYzMTM4MzM2MTM4MzAzNDMwMzgyMjJjMjI3NzYxNzM1Mzc0NzI2OTZlNjcyMjNhNzQ3Mjc1NjU3ZCIsInB1YmxpY19rZXlzIjpbIjAyODcyNmQyMGZhMTI4Yjc1OWViOGIwOWZjY2Y2ODU2ZTQzMjM1YmI5OTkxNjI0OWNmNjNhM2NiMjA0MTY0Y2I4ZSJdLCJwcm9maWxlIjpudWxsLCJ1c2VybmFtZSI6bnVsbCwiY29yZV90b2tlbiI6bnVsbCwiZW1haWwiOiJmcmllZGdlckBnbWFpbC5jb20iLCJwcm9maWxlX3VybCI6Imh0dHBzOi8vZ2FpYS5ibG9ja3N0YWNrLm9yZy9odWIvMTJHcHI5a1lYSkpuNGZXZWM0blJWd0hMU3JyVGllZXl3dC9wcm9maWxlLmpzb24iLCJodWJVcmwiOiJodHRwczovL2h1Yi5ibG9ja3N0YWNrLm9yZyIsInZlcnNpb24iOiIxLjIuMCJ9.QM8wx-EDjZrHk1ubK99divaejN5XAcCn_OkYAiPXQUNtzENUy8ogyrHzB4xC7mwfMckzFsMxEOdzwVW_Xcjqqg\",\"hubUrl\":\"https:\\/\\/hub.blockstack.org\"}}"

fun sessionStoreforIntegrationTests(rule: ActivityTestRule<*>): SessionStore {
    val prefs = PreferenceManager.getDefaultSharedPreferences(rule.activity)
    prefs.edit().putString(BLOCKSTACK_SESSION, A_VALID_BLOCKSTACK_SESSION_JSON)
            .apply()
    return SessionStore(prefs)
}
