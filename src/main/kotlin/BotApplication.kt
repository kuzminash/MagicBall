import me.ivmg.telegram.bot
import me.ivmg.telegram.dispatch
import me.ivmg.telegram.dispatcher.text
import kotlin.random.Random.Default.nextInt

fun main(args: Array<String>) {

    val replies: Array<String> = arrayOf("100%", "MaybeBaby", "Hmmm.. Ask me one more time", "Definitely", "Wow Yas!!", "Maybe next time?", "I think no")
    bot {
        token = "1625641304:AAHCfC6cVMjLgLwFbyXJbFGDK9HVzroJO-U"
        dispatch {
            text { bot, update ->
                if (update.message?.text == "/start") {
                    update.message?.let {
                        bot.sendMessage(it.chat.id, "Ask me a question and I will predict your future")
                    }
                } else if (update.message?.text?.last() == '?') {
                    update.message?.let {
                        bot.sendMessage(it.chat.id, replies.random())
                    }
                } else {
                    update.message?.let {
                        bot.sendMessage(it.chat.id, "It's not a question, question should ends with a ?")
                    }
                }
            }
        }
    }.startPolling()
}