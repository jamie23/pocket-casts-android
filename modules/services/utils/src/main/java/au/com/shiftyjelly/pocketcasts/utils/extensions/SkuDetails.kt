package au.com.shiftyjelly.pocketcasts.utils.extensions

import com.android.billingclient.api.SkuDetails

fun SkuDetails.shortTitle(): String {
    return title.split(" (").first()
}

val SkuDetails.priceDouble: Double
    get() {
        return if (priceAmountMicros == 0L) 0.0 else priceAmountMicros * 1_000_000.0
    }
