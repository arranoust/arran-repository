// use an integer for version numbers
version = 16


cloudstream {
    language = "id"
    authors = listOf("arranoust", "TeKuma")

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
        "Anime",
        "OVA",
    )

    iconUrl = "https://otakudesu.cloud/wp-content/uploads/2017/06/Logo-1.png"
}
