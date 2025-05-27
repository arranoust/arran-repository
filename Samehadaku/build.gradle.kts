// use an integer for version numbers
version = 23


cloudstream {
    language = "id"
     description = "Samehadaku is a plugin that provides streaming links for Anime."
     authors = listOf("arranoust")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AnimeMovie",
        "OVA",
        "Anime",
    )

    iconUrl = "https://samehadaku.now/wp-content/uploads/2020/04/cropped-download-1-192x192.jpg"
}
