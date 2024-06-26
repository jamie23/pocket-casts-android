package au.com.shiftyjelly.pocketcasts.widget.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.layout.Alignment
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.width

@Composable
internal fun PlaybackControls(
    isPlaying: Boolean,
    buttonHeight: Dp,
    modifier: GlanceModifier = GlanceModifier,
    isClickable: Boolean = true,
) {
    val iconPadding = buttonHeight / 3.5f
    Row(
        verticalAlignment = Alignment.Vertical.Bottom,
        modifier = modifier.fillMaxWidth(),
    ) {
        SkipBackButton(
            iconPadding = iconPadding,
            isClickable = isClickable,
            modifier = GlanceModifier.height(buttonHeight).defaultWeight(),
        )
        Spacer(
            modifier = GlanceModifier.width(4.dp),
        )
        PlaybackButton(
            isPlaying = isPlaying,
            iconPadding = iconPadding,
            isClickable = isClickable,
            modifier = GlanceModifier.height(buttonHeight).defaultWeight(),
        )
        Spacer(
            modifier = GlanceModifier.width(4.dp),
        )
        SkipForwardButton(
            iconPadding = iconPadding,
            isClickable = isClickable,
            modifier = GlanceModifier.height(buttonHeight).defaultWeight(),
        )
    }
}
