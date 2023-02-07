package au.com.shiftyjelly.pocketcasts.models.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import au.com.shiftyjelly.pocketcasts.models.entity.SearchHistoryItem

@Dao
abstract class SearchHistoryDao {
    @Query("SELECT * FROM search_history ORDER BY modified DESC LIMIT :limit")
    abstract suspend fun findAll(limit: Int = 10): List<SearchHistoryItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(searchHistoryItem: SearchHistoryItem)

    @Delete
    abstract suspend fun delete(result: SearchHistoryItem)

    @Query("DELETE FROM search_history")
    abstract suspend fun deleteAll()
}
