package au.com.shiftyjelly.pocketcasts.discover.view

import au.com.shiftyjelly.pocketcasts.servers.model.DiscoverCategory

data class CategoryPill(val discoverCategory: DiscoverCategory, val isSelected: Boolean = false)
