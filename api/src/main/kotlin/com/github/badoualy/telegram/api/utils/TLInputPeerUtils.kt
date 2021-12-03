package com.github.badoualy.telegram.api.utils

import com.github.badoualy.telegram.tl.api.TLAbsChat
import com.github.badoualy.telegram.tl.api.TLChannel
import com.github.badoualy.telegram.tl.api.TLChat
import com.github.badoualy.telegram.tl.api.TLInputPeerChannel
import com.github.badoualy.telegram.tl.api.TLInputPeerChat
import com.github.badoualy.telegram.tl.api.TLInputPeerUser
import com.github.badoualy.telegram.tl.api.TLUser

fun TLUser.toInputPeer() = TLInputPeerUser(id, accessHash)
fun TLAbsChat.toInputPeer() = when (this) {
    is TLChat -> TLInputPeerChat(id)
    is TLChannel -> TLInputPeerChannel(id, accessHash)
    else -> null
}