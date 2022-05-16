import com.google.gson.annotations.SerializedName

data class DownloadLinkModel(

	@SerializedName("status") val status: Int,
	@SerializedName("desc") val desc: String,
	@SerializedName("data") val data: Data,
) {
    data class Data(

		@SerializedName("all_groups") val all_groups: List<All_groups>,
	) {
        data class All_groups(

			@SerializedName("id") val id: Int,
			@SerializedName("name") val name: String,
			@SerializedName("link") val link: String,
			@SerializedName("status") val status: String,
			@SerializedName("created_at") val created_at: String,
		)
    }
}