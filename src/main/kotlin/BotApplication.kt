import me.ivmg.telegram.bot
import me.ivmg.telegram.dispatch
import me.ivmg.telegram.dispatcher.text

fun main() {
    //2
    bot {
        //1
        dispatch {
            text { bot, update ->
                //3
            }
        }
    }.startPolling()
}