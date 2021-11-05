import java.net.URL

fun response() {
    //("https://api.vk.com/method/wall.post?owner_id=646806410&message=test&access_token=f845c340139415d9912147c07cdeef23af7049bb1814b82553b893d0c94e77c7a425b360b098bbc2c4e5f&v=5.81")
    val token = "f845c340139415d9912147c07cdeef23af7049bb1814b82553b893d0c94e77c7a425b360b098bbc2c4e5f"
    var method = "wall.post"
    var owner_id: Int = 646806410
    var message = "just test api request"


    val url = "https://api.vk.com/method/$method?owner_id=$owner_id&message=$message&access_token=$token&v=5.81"
    val obj = URL(url)

}