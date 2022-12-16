version = 1


cloudstream {
    language = "hi"
    // All of these properties are optional, you can safely remove them

    description =
        "This website support Hindi/Marathi/Kannada/Malayalam/Tamil/Telugu/Bengali/Punjabi\nFor Searching format: language,title\nexample: hindi,kantara"
    authors = listOf("darkdemon")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 0 // will be 3 if unspecified
    tvTypes = listOf(
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=einthusan.tv&sz=%size%"
}
