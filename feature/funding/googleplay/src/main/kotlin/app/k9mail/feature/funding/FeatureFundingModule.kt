package app.k9mail.feature.funding

import app.k9mail.feature.funding.api.FundingManager
import app.k9mail.feature.funding.api.FundingNavigation
import app.k9mail.feature.funding.googleplay.GooglePlayFundingManager
import app.k9mail.feature.funding.googleplay.GooglePlayFundingNavigation
import org.koin.dsl.module

val featureFundingModule = module {
    single<FundingManager> { GooglePlayFundingManager() }
    single<FundingNavigation> { GooglePlayFundingNavigation() }
}
